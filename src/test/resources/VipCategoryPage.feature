Feature: Vip Category Page

  Scenario: Open a category page
    Given  I open the home page
    When  Open category page
    Then Category page is open

  Scenario: Products are sorted by price on category page
    Given  I open the home page
    When  Open category page
    And I sort products by "Price" in descending order
    Then All products are sorted by "Price" in ascending order

  Scenario: Open Product detail page by click on product image
    Given  I open the home page
    When  Open category page
    And I click on product image
    Then Product detail page is open

  Scenario: Open Product detail page by click on product name
    Given  I open the home page
    When  Open category page
    And I click on product name
    Then Product detail page is open