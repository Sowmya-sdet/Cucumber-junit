Feature: Login features
This feature indicates scenarios that can be tested here.
1) Login as Admin
2) Login as linda.anderson
3) Login with Negative data

Background: 
Given I am able to navigate into login page

@Login
Scenario: Login as Admin
When I enter the username as "Admin" 
And I enter the password as "admin123" 
And I click on the Login button
Then I should see the username as "Welcome Paul" 

Scenario: Login as linda.anderson
When I enter the username as "Admin" 
And I enter the password as "admin123" 
And I click on the Login button
Then I should see the username as "Welcome Paul" 

@InvalidLogin
Scenario: Login with Negative data
When I enter the username as "Sowmya" 
And I enter the password as "sowmya123" 
And I click on the Login button
Then I should see a error message as "Invalid Credentials" 

