Feature: Already registered

Scenario: The one where the user moves to cart without adding any item in it 
Given Alex has registered in to TestMeApp
And user clicks on Signin link
And  username lalitha
And password  password123
And user clicks on the login button  
When Alex search a particular product like headphones
And try to proceed to payment without adding any item in the cart
Then TestMeApp doesn't display the cart icon 