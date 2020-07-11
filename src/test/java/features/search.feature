Feature: Search and place order for vegetables

  @Selenium  @Sanity
  Scenario Outline: Search for items and validate Results
    Given user on greenkart home page
    When user search for a <vegetable>
    Then verify displaying <vegetable>
    Examples:
      |vegetable|
      |Cucumber|
      |Brinjal|

  @Selenium  @Regression
  Scenario Outline: Add a item to cart and verify item on checkout page
    Given user on greenkart home page
    When user search for a <vegetable>
    Then Added to cart
    Then user proceed to checkout page for purchase
    Then verify selected <vegetable> are displaying in checkout page
    Examples:
      |vegetable|
      |Cucumber|
      |Brinjal|