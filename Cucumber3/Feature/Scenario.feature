Feature:login Feature

Scenario Outline:Successful Login with Valid Credentials
Given User opens the application
When User click on to login link
And User enters "<username>" and "<password>"
Then Meassge displayed login Successfully


Examples:
| username                         |password|
| aishwaryamusale123@gmail.com     |Aish12  |
| aravind.guggilla57@gmail.com     |aravind |