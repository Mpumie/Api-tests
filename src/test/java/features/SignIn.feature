Feature: Validating Login API
  Scenario: Validating if Login API is successful
    Given User Login payload
    When user clicks "LoginAPI" with "POST" http request
    Then the API call got success with status code 200


