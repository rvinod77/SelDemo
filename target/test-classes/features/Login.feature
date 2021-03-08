Feature: Login into Application

Scenario: Happypath  default login
Given Initialize the broswer with chrome
And Navigte to "google.com" site
When user login into application with username and password
Then Home page is populated
And Cards are displayed
