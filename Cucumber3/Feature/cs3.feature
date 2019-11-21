Feature:Test me App Purcahse

Scenario: Purchasing

Given User opens the Test me app
And Home page is opened
And user clicks on Signin link
And enters username as lalitha
And password as password123
And clicks on login
Then displays login is succesfull
And enters the search as Headphone
And clicks on find details 
And is directed to add to cart page
And clicks on add to cart page
Then clicks on cart link
And views the product details
And clicks on checkout
And click on Proceed to pay
Then the page is redirected to welcome to payment gateway
And select HDFC bank
And click on continue
Then enter the payment gateway username as 12357
And password Pass@457
Then click LOGIN
And user enters the Transaction password as Trans@457
And clicks on Pay now option
And the User is directed to order details page


