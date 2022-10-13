package stepDefinitions;

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
    LoginResponse loginResponse;
    ResponseSpecification response;
    Response resp;
    TestDataBuild testDataBuild = new TestDataBuild();

    @Given("Skill payload")
    public void skill_payload() throws IOException {
        req = given().spec(reqSpec(loginResponse.getUserId(), loginResponse.getToken()))
                .body(testDataBuild.addSkillPayload());

    }
    @When("User click saveSkill button")
    public void user_click_save_skill_button() {
        resp = req.when().post("/api/v1/lookup/employer-skills/saveOrUpdate");
    }
    @Then("Skill saved successful with status code {int}")
    public void skill_saved_successful_with_status_code(Integer int1) {
        assertEquals(resp.getStatusCode(),200);
    }


}
