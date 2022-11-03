package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import resources.TestDataBuild;
import resources.Utilities;

import java.io.IOException;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class SignInSteps extends Utilities {

    Response response;
    RequestSpecification request;
    TestDataBuild data = new TestDataBuild();

    @Given("user login payLoad")
    public void user_login_pay_load() throws IOException {
        request = given().log().all().spec(requestSpecification().body(data.logInPayLoad()));
    }
    @When("user  clicks Login button")
    public void user_clicks_login_button() {
        response = request.when().post("/api/v1/access-control/sign-in");
    }
    @Then("Log in must be successful")
    public void log_in_must_be_successful() {
        assertEquals(response.getStatusCode(),200);
    }

}
