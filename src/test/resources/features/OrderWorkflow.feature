@Faraz

Feature: Order Workflow
  In order for items to be purchased
  As product owner,
  I require a customer ordering work flow to be in place	
  
  Scenario: Customer is able to order an item and verify the purchase in order history
    Given I have signed in
    And I have added a t-shirt to my shopping cart
    When I confirm payment for my order
    Then the purchase is successful
    And the item is displayed in order history
    
  Scenario: Customer is able to change their first name
    Given I have signed in
    And I am on the my personal information page
    When I update my first name to "Faraz"
    Then the my personal information has been updated successfully