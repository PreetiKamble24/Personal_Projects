Feature: Application Login

Scenario: Home page login
Given User is on landing page
When User login into application with "abc" and "pass@123"
Then Home page is displayed
And Cards are displayed
