Feature: This is to test google search
Scenario: Google search scenario
 Given user is entering google.co.in
 When user is typing the search term "BMW"
 And enters the return key
 Then the user should see the search results 
 
 