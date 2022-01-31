@AddRemove
Feature: adding and removing elements
  Agile story: Given user is on cybertek Practice page
  user should be able to add and remove elements once on "Add/Remove Elements" page

  Scenario: adding and removing elements
    Given User is on Cybertek Practice Home Page
    Then User should click on addRemoveElements
    Then User should be able to click on AddRemove Elements and verify text match "Add Element"
    Then User should be able to verify "Delete" button is there and should be able to click on it