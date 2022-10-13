Feature: Add Skill functionality

  Scenario: Test if a skill can be added successfully
    Given Skill payload
    When User click saveSkill button
    Then Skill saved successful with status code 200
