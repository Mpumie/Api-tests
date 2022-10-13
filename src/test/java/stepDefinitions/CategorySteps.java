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

public class CategorySteps extends Utilities {

    RequestSpecification req;
    LoginResponse loginResponse;
    ResponseSpecification response;
    Response resp;
    TestDataBuild testDataBuild = new TestDataBuild();

    @Before
    public void setUp() throws IOException {
        req = given().spec(requestSpecification()).body(testDataBuild.logInPayLoad());

        Response signInResp = req.when().post("/api/v1/access-control/sign-in");
        loginResponse = signInResp.getBody().as(LoginResponse.class);
        System.out.println(loginResponse.getToken());
    }
    @Given("Category payload")
    public void category_payload() throws IOException {

        String name= String.format("Technicall %o"  , randomTest());
        String description = String.format( "This is a technical skill %o"  , randomTest());
        req = given().spec(reqSpec(loginResponse.getUserId(), loginResponse.getToken()))
                .body(testDataBuild.categoryPayLoad(name, description));

    }
    @When("User click saveCategory button")
    public void user_click_save_category_button() {
        resp = req.when().post("/api/v1/lookup/categories/saveOrUpdate");
    }
    @Then("Category saved successful with status code {int}")
    public void category_saved_successful_with_status_code(Integer int1) {
        assertEquals(resp.getStatusCode(),200);
    }


}
