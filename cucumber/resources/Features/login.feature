Feature: Login Feature File
@selenium
Scenario: Login scenario test for facebook

Given navigate to facebook page
When user logged in using username and password
Then home page should be displayed