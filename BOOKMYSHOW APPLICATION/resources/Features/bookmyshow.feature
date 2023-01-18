Feature: Test bookmyshow page 
@selenium
Scenario: test bookmyshow page

Given user is on browser
When user get url
Then display home page of bookmyshow
And user signup
Then user navigate to url
When user want to book tickets
Then it should display booking page
Then user navigate to another url







 
