@case8Wip
Feature: verify all products and product detail page

  Background:
    Given User launches browser and navigates to the url
    Then Verifies that the home page message "Automation Exercise" is visible successfully

  Scenario: verify all products
    Given User clicks on Products button
    Then Verify user has navigated to "Automation Exercise - All Products" page successfully
    And Verify products list is visible
      | POLO               |
      | H&M                |
      | Madame             |
      | Mast & Harbour     |
      | Babyhug            |
      | Allen Solly Junior |
      | Kookie Kids        |
      | Biba               |
    Then User clicks on view product of first product
    And Verify that user landed on "Automation Exercise - Product Details" detail page
    Then Verify that detail are is visible  product name "Blue Top",category "Category: Women > Tops",price "Rs. 500",availability "In Stock", condition "New", Brand "Polo"



