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

public class CandidateSignUpSteps extends Utilities {

    RequestSpecification req;
    ResponseSpecification resspec;
    Response response;
    TestDataBuild data =new TestDataBuild();
    @Given("User Register payload")
    public void user_register_payload() throws IOException {
        req = given().log().all().spec(requestSpecification())
                .body(data.candidateSignup());
    }
    @When("user register by clicking register button {string} with {string} http request")
    public void user_register_by_clicking_register_button_with_http_request(String string, String string2) {
        response = req.when().post("/api/v1/access-control/candidate/sign-up");
    }
    @Then("user register successful with status code {int}")
    public void user_register_successful_with_status_code(Integer int1) {
        assertEquals(response.getStatusCode(),200);
    }

}
