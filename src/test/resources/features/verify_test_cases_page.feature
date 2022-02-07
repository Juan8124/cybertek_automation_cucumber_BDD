@case7Wip
Feature: Verify Test Case Page

  Scenario: verify testCase Page
    Given User launches browser and navigates to the url
    Then Verifies that the home page message "Automation Exercise" is visible successfully
    And Click on Test Cases button
    Then Verify User navigated to "TEST CASES" cases page successfully