@wip
Feature: Auto Complete
  given the user is on the practice home page. User should be able to submit "u" to click on autocomplete, selects
  Country type and submits and should get message displayed country should be United states

  Background:
    Given User is on Cybertek Practice Home Page

  Scenario: user autoCompletes
    Given user clicks on Autocomplete
    Then User should be able input "u"
    And Verify all countries are being displayed:

      | Uganda                   |
      | Ukraine                  |
      | United Arab Emirates     |
      | United Kingdom           |
      | United States of America |
      | Uruguay                  |
      | Uzbekistan               |

    And select United States Of America and click submit
    Then User should get "You selected: United States of America"




