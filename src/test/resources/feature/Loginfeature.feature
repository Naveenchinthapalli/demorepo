Feature: login
@sanity
Scenario: LoginTest004
Given Open Browser and navigate to "http://automationpractice.com/"
When Click on the Sign in link
When Enter username and password "shiva@test.com"
When After Login Pass below parameters

|Santosh kumar|Gaddam|9876543210|Miyapur|500049|


@sanity
Scenario Outline: LoginTest005
Given Open Browser and navigate to "http://automationpractice.com/"
When Click on the Sign in link
When Enter username and password "shiva@test.com"
When After Login Pass below parameters to the system "<name>" "<lname>" "<phone>" "<place>" "<pin>"

Examples:
|name | lname | phone | place | pin |
|Santosh kumar|Gaddam|9876543210|Miyapur|500049|
|shiva | Kumar| 9700879824| nalgonda |508001|





