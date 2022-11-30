Feature: Login functionality

Background: User successfully clicked on initial Login page
When user provide "webdriver.chrome.driver" and exe location as "F:\\Automation Support\\chromedriver.exe"
When user provide url as "https://www.flipkart.com/"
When user cancle initial Login page

@SmokeTest
Scenario: Login functionality with valid username and valid password
When user navigate on Login 
When user click on My Profile
When user enter "9764888093" as username
When user enter "abcd@1234" as password
When user click on Login button
Then application shows user profile to user










