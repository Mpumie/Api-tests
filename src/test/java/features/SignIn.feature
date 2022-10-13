Feature: Test Login Functionality
  Scenario: Check Login is successful with valid credentials

    Given logIn payload
    When user calls "SignInAPI" with "POST" http request
    Then the API call is successful with status code 200
