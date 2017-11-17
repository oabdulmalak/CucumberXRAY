Feature: International coffee shop 
  
   Scenario: Manage delivery based on stock - passed 
    Given the stock of my coffee doses is 4 
    When 3 coffee is selected 
    Then must be distributed is true

    Scenario: Must handle currencies
    Given the price list for an international coffee shop
      | product | currency | price |
      | coffee  | EUR      | 1     |
      | donut   | SEK      | 18    |
    When I buy 1 coffee and 2 donut
    Then should I pay 1 EUR and 36 SEK
  
    Scenario: Manage delivery based on stock - not passed
    Given the stock of my coffee doses is 4 
    When 5 coffee is selected 
    Then must be distributed is false