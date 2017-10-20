Feature: I would like to buy all this things

  Background:
    Given user open page "Sign in" by link "amazoneSignInUrl" from property file
    When user "user" enter login and password
    Then page "Main" was loaded


  Scenario: User should buy all things successful
    When page "Search block" was loaded
    Then count from field "Items Quantity" will be equal 3
    When user click on button "Shopping cart"
    * page "Shopping cart" was loaded
    When user click on button "Proceed  to checkout"
    * page "Address confirm" was loaded
    When user click on button "Confirm"
