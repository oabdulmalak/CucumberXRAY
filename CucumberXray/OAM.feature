@XRAY-35
Feature: Manage currencies and Stocks

	#Passed Case : supply less than or equal to the stock
	@XRAY-38
	Scenario: Manage delivery based on stock - Passed Case
		Given the stock of my coffee doses is 4 
		When 3 coffee is selected 
		Then must be distributed is true	

	#Passed Case : coffee shop must manage different currencies, and provide the invoice accordinly
	@XRAY-39
	Scenario: Must handle currencies
		Given the price list for an international coffee shop
		| product | currency | price |
		| coffee  | EUR      | 1     |
		| donut   | SEK      | 18    |
		When I buy 1 coffee and 2 donut
		Then should I pay 1 EUR and 40 SEK		

	#Manage delivery based on stock - Not Passed Case
	@XRAY-40
	Scenario: Manage delivery based on stock - Not Passed Case
		Given the stock of my coffee doses is 4 
		When 5 coffee is selected 
		Then must be distributed is false