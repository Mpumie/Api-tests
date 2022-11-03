Feature: Validating SignUp API

  Scenario: Validating if SignUp API is successful
    Given User Register payload
    When user register by clicking register button "LoginAPI" with "POST" http request
    Then user register successful with status code 200

