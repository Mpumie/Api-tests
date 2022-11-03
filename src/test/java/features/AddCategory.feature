Feature: Verify Category API's

  Scenario: Test if a category can be added successfully
    Given Category payload
    When user calls "AddCategoryAPI" with "POST" http request
    Then Category saved successful with status code 200

