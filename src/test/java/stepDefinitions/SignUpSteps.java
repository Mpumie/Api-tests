package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import resources.TestDataBuild;
import resources.Utilities;

import java.io.IOException;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class SignUpSteps extends Utilities {
    RequestSpecification req;
    ResponseSpecification resspec;
    Response response;
    TestDataBuild data =new TestDataBuild();

    @Given("User Register Employer payload")
    public void user_register_employer_payload() throws IOException {
        req = given().log().all().spec(requestSpecification())
                .body(data.employerSignUp());

    }
    @When("user signUp by clicking register button {string} with {string} http request")
    public void user_sign_up_by_clicking_register_button_with_http_request(String string, String string2) {
        response = req.when().post("/api/v1/access-control/employer/sign-up");

    }
    @Then("user signUp successful with status code {int}")
    public void user_sign_up_successful_with_status_code(Integer int1) {
        assertEquals(response.getStatusCode(),200);
    }

}
