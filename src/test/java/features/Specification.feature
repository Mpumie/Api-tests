Feature: Verify Specification API's

  Scenario: Test if a specification can be added successfully
    Given Specification payload
    When user saves job specification "saveJobSpecificationAPI" with "POST" http request
    Then Job specification saved successfully with status code 200
