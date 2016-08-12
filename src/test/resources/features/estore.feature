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
Scenario Outline: SLA_002-005
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

@Reg
Scenario Outline: SLA_006-010
Given user select the search option as  Product name/brand"<type>"
When user enter a key word "<prodName>"
And click on search button 
Then verify on product name "<prodName>"
And verify on image "<image>"
And verify on IR price "<irp>"
And verify on BV "<bv>"
And verify on RSP "<rsp>"
And verify on S&H fee "<sh>"
And verify on Avalability "<avalability>"
And user select preferred products 
And click on add to cart button 
And Direct to the Shopping cart page 
Examples:
|type|prodName|image|irp|bv|rsp|sh|avalability|
|Product Name|HomePure 7 in 1 Replacement Filter Cartridge|true|USD 76.00|BV 10|RSP 50|USD 14.00|false|
|Product Name|OLE Olive Leaf Extract 500ml x 2 + OLE Olive Leaf Extract 100ML x 4|true|USD 135.00|BV 20|RSP 150|USD 24.00|true|




