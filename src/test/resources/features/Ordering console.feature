Feature: I would like ordering the last version of console

  Background:
    Given user open page "Sign in" by link "amazoneSignInUrl" from property file
    When user "user" enter login and password


  Scenario: The last version of console should be availyble
    Then page "Main" was loaded
    And block "Search block" was loaded
    When user enter to the field "Search field" value "playstation 4 game console"
    When user click on button "Go"
    Then page "Search Results Page" was loaded
    And block "Amazon Filters" was loaded
    When user select filter "PlayStation 4  Consoles"
    When user select filter "Ship to Lithuania"
    When user select filter "Last 90 days"
    When user select filter "4 Stars & Up"
    When user unselect filter Include Out of Stock if selected
    Then page "Search Results Page" was loaded
    When user select item number "0" in search results item
    Then page "Product Details Page" was loaded
    When user click on button "Add to cart button"
    Then page "Smart added to Cart" was loaded



