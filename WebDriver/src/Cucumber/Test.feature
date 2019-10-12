Feature: Checking login functionality

Scenario: User login to application with valid credentials
Given User launch application
When User enters uid and pwd and login
Then User able to login