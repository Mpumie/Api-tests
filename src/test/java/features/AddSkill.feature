Feature: Verify Skill API's

  Scenario: Test if Skill can be added successfully
    Given Skills payload
    When user hit "AddSkillAPI" with "POST" http request
    Then Skill saved successfully with status code 200
