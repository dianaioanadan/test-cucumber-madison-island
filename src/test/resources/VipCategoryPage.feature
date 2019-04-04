Feature: Vip Category Page

  Scenario: Open a category page
    Given  I open the home page
    When  Open category page
    Then Category page is open

  Scenario: Products are sorted by price on category page
    Given  I open the home page
    When  Open category page
    And I sort products by "Price" in ascending order
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

  Scenario:  Recently Viewed Products Component is displayed
    Given  I open the home page
    When  Open category page
    And I click on product name
    And I click back
    Then Recently Viewed Products Component is displayed

  Scenario: Add product to wishlist without login
    Given I open the home page
    When  Open category page
    And I click on wishlist button
    Then Login page is open

  Scenario: Add product to compare
    Given I open the home page
    When  Open category page
    And I click Add to Compare button
    Then Compare component is displayed on page

  Scenario: Add to Cart products
    Given I open the home page
    When  Open category page
    And I click Add to Cart button
    Then Checkout page is open

  Scenario: Products are filter by price
    Given  I open the home page
    When  Open category page
    And I click on filter by price option
    Then All products are filter by price

  Scenario: Search functionality from CategoryPage
    Given I open the home page
    When  Open category page
    And I search products by "vase"
    Then "Vase" products are displayed
