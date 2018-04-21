Feature: Registration functionality verification for all the users of the DCE Web application
Description: The pupose of this feature is to perform user registration and verify the successful login

Scenario: validate residential customer dashboard
Given Application is launched and User is on home page
When User click on Registration link
And Enters all the required information for residential user
And User clicks on submit
Then Registration should be performed successfully


Scenario: validate business customer dashboard
Given Application is launched and User is on home page
When User click on Registration link
And Enters all the required information for business user
And User clicks on submit
Then Registration should be performed successfully