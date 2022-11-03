Feature: Validating Employer SignUp API

  Scenario: Validating if Employer SignUp API is successful
    Given User Register Employer payload
    When user signUp by clicking register button "SignUpAPI" with "POST" http request
    Then user signUp successful with status code 200

