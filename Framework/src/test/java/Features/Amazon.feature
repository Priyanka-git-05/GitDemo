Feature: Test cases for Amazon Website

@ValidateName
Scenario Outline: To Validate the Search icon in Amazon Website
Given Initialize the driver
When I launch the URL <URL>
And I enter the <Username> and <Password>
Then I validate the <Name>

Examples:
|URL|Username|Password|Name|
|https://www.amazon.in/|8903109093|Priya@56$|Priyanka|