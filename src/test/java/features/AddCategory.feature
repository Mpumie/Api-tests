Feature: Add category functionality

  Scenario: Test if category can be added successfully
    Given Category payload
    When User click saveCategory button
    Then Category saved successful with status code 200
