Feature: Bill Payments functionality verification for all the users of the DCE Web application
Description: The pupose of this feature is to perform Bill Payments for the users

Scenario: validate residential customer bill payment
Given Application is launched and User logs into home page
When User makes payment through Credit card
And Enters all the required information for residential user
And User clicks on submit
Then Bill payment is performed successfully


Scenario: validate business customer bill payment
Given Application is launched and User logs into home page
When User makes payment through Bank account
And Enters all the required information for business user
And User clicks on submit
Then Bill payment is performed successfully