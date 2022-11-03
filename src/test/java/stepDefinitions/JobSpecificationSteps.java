package stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import pojo.LoginResponse;
import resources.TestDataBuild;
import resources.Utilities;

import java.io.IOException;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class JobSpecificationSteps extends Utilities {

    RequestSpecification req;
    private LoginResponse loginResponse;
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
    @Given("Specification payload")
    public void specification_payload() throws IOException {
        req = given().log().all().spec(reqSpec(loginResponse.getUserId(), loginResponse.getToken()))
                .body(data.specificationPayload());

    }
    @When("user saves job specification {string} with {string} http request")
    public void user_saves_job_specification_with_http_request(String string, String string2) {
        resspec =new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();

        resp =req.when().post("/api/v1/job-specifications/saveOrUpdate").then().extract().response();
    }
    @Then("Job specification saved successfully with status code {int}")
    public void job_specification_saved_successfully_with_status_code(Integer int1) {
        assertEquals(resp.getStatusCode(),200);

    }

}
