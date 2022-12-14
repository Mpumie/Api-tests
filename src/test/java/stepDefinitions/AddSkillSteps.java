package stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import pojo.LoginResponse;
import resources.TestDataBuild;
import resources.Utilities;

import java.io.IOException;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class AddSkillSteps extends Utilities {

    RequestSpecification req;
    private LoginResponse loginResponse;
    Response categoryResp;
    ResponseSpecification resspec;
    Response resp;
    TestDataBuild data = new TestDataBuild();

    @Before
    public void setUp() throws IOException {
        req = given().spec(requestSpecification()).body(data.logInPayLoad());
        Response signInResp = req.when().post("/api/v1/access-control/sign-in");
        loginResponse = signInResp.getBody().as(LoginResponse.class);
        System.out.println(loginResponse);
    }
    @Given("Skills payload")
    public void skills_payload() throws IOException {
        req = given().log().all().spec(reqSpec(loginResponse.getUserId(), loginResponse.getToken()))
                .body(data.skillsPayload());
    }

    @When("user hit {string} with {string} http request")
    public void user_hit_with_http_request(String resource, String method){

        resp = req.when().post("/api/v1/lookup/employer-skills/saveOrUpdate").then().extract().response();

    }

    @Then("Skill saved successfully with status code {int}")
    public void skill_saved_successfully_with_status_code(Integer int1) {
        assertEquals(resp.getStatusCode(),200);
    }

}
