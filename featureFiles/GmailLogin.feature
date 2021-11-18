Feature: This feature is for login functionality using Gmail
Scenario: User logs in with valid username and password
 Given User is on Login page
 When User enters the username as "sukumarmunusamy" and password as "Numeric@123"
 And clicks on the login button
 Then user should be getting error message