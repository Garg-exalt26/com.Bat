Feature: Login functionality

@Smoke
Scenario: Verify login functionality with correct credentials
       Given User launch site URL
       When User enter correct username & password details 
       Then User click on login button
       And Validate user login navigate to Home  