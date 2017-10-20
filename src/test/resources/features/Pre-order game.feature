Feature: I would like to pre-order game


  Background:
    Given user open page "Sign in" by link "amazoneSignInUrl" from property file
    When user "user" enter login and password
    Then page "Main" was loaded

  Scenario: Pre-ordering game is successful
    * page "Search block" was loaded
    When user enter to the field "Search field" value "just dance 2018 playstation 4"
    When user click on button "Go"
    When page "Amazon Filters" was loaded
    When user select filter "Ship to Lithuania"
    Then page "Search Results Page" was loaded
    When user select item number "0" in search results item
    Then page "Product Details Page" was loaded
    Then value in field "Add to cart button" equals "Pre-order: Add to Cart"
    When user click on button "Add to cart button"
    Then page "Added to cart" was loaded