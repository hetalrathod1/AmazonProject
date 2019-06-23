@addcart
Feature: add to cart functionality
  Scenario: user is able to add product in add to cart basket

    Given user is on homepage
    When user click on Todays deals
    And user click on Up to 70% off tops and bottoms from Amazon brands
    And user click on find. Women's T-Shirt
    And user select on size of size chart
    Then click on Add To Basket
    And user is able to see product added in the basket
