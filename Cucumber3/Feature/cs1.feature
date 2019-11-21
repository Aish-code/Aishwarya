Feature: Test me App Registration

  Scenario: Registration
    Given the signup page is opened
    Then user enters Aishwarya as username
    And user enters First name Aishwarya
    And user enters Last name Musale
    And entersAish12 as password
    And enters Aish12 as password for confirmation
    And Select gender as Female
    And enters aishwaryamusale@gmail.com as email id
    And user enters "8553348403" as phone number
    And Selects "27-08-1997" as his date of birth
    And enters abcdef as address
    And selects security question as birth place
    And answers as Hubli
    And Clicks on register
    Then User is navigated to Login Page
