Feature: enrollment

@Reg
Scenario Outline: SLA_001
Given  user open the web page 
When Type the URL.(Staging site)"<URL>"
Then Login page should displayed.
And user validate the Qnet logo
Examples:
|URL|
|https://portal.qntest.com/VirtualOffice/onlineestore/Online_Login_VO.aspx|


Scenario Outline: SLA_003
Given user enter invalid/blank username and password."<username>","<password>"
When user clicked on login button
Then corresponding error messages should displayed
Examples:
|username|password|
|hu041755|testpw|
|hu041755|tessspw|
|hu041755|testpw|

@Reg
Scenario Outline: SLA_002
Given user enter the username and password."<username>","<password>"
When user clicked on login button
Then user should able to login to virtual office
And validate the user details "<irname>"
And RPP button should displayed 
And user click on the RPP button 
And User direct to the estore- RPP page
Examples:
|username|password|irname|
|hu041741|testpw|Ivan Wong|