Feature: Order Processing

  Scenario: Order placement process without being logged in
    Given I navigate to url web page
    When I select S size for Hero Hoodle
    And I select the “green” color for “Hero Hoodle”
    And I press the “Add to Cart” button
    And I verify if the product has been added in the cart
    And I click the “Cart” button
    And I click the “ProceedToCheckout” button
    And I click Next button
    And I verify the message received about shipping method
    And I select first shipping method
    And I click Next button
    And I complete the <Email Address> field
    And I click Next button
    And I complete the <First Name> field
    And I click Next button
    And I complete the <Last Name> field
    And I click Next button
    And I complete the <Street Address> field
    And I click Next button
    And I complete the <City> field
    And I click Next button
    And I select the <StateProvince>
    And I click Next button
    And I complete the <ZipPostal Code> field
    And I click Next button
    And I complete the <Phone Number> field
    And I click Next button
    And I check the checkbox from My billing and shipping address are the same
    And I click the Apply Discount Code text
    And I complete the <Enter discount code> field
    And I click the Apply Discount button
    And I verify if the discount has been applied to the cart
    And I check the shipping fee
    And I check that one item is in the cart
    And I check the size and the color of the product
    And I change the shipping method
    And I click Next button
    And I click the Press Order button
    Then I verify the message after the order is done
