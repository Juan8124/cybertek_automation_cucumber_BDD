@smoke
Feature: Register new User

  Scenario: Create a new User account
    Given User is on automation exercise website
    Then verify User is on homepage
    And click on SignupLogin button
    Then verify "New User Signup!" is visible
    And Enter name and email address
    Then click signup button
    Then verify that "ENTER ACCOUNT INFORMATION" is visible
    Then fill details Title, Password, Date of birth
    Then select checkbox Sign up for our newsletter!
    Then Select checkbox Receive special offers from our partners!
    Then Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    And Click create account button
    Then verify that ACCOUNT CREATED! is visible
    And Click continue button
    Then verify that the user is logged in


