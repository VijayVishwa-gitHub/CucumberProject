Feature: Online Shopping
@T1
Scenario: Login into ecommerce application

Given User enters application URL
Then User is taken to landing Page
When User enters "balajivijay2410@gmail.com" and "Tester@1234"
Then User login into application
@T2
Scenario Outline: Verify Login page of the application

Given User enters application URL
Then User is taken to landing Page
And User enters "<Name>" and "<Password>"
Then User login into application


Examples:
|        Name              |  Password    |
|Vijayvishwa242@gmail.com  | TesterTester |
|balajivijay2410@gmail.com | Tester@1234  |

