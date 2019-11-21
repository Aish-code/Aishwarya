Feature:Test me App Log in

Scenario Outline: Successful Login with Valid Credentials
Given Users navigate to testme app
And the home page is opened
And the user clicks on signin
And Users enters "<username>" and "<password>"
Then Login is successfull


Examples:
|username|password|
|lalitha|password123|
|aravind.guggilla57@gmail.com|aravind |

