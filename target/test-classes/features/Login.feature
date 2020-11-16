@login @regression
Feature: Login


Scenario: Valid Login

When user enters user email "admin@elevatelms.com"
And user enters password "12341234"
And user clicks login button
Then user should "Admin" on dashboard page
And user should see "Alliancetek - Dashboard" as title of page

@invalidLogin
Scenario: Login with valid email and empty password

When user enters user email "admin@elevatelms.com"
And user clicks login button
Then user should see error message "Incorrect password" on login page

@emptyEmail
Scenario: Login with empty email and correct password
And user enters password "12341234"
And user clicks login button
Then user should see email error message "Please provide accurate email" on login page
