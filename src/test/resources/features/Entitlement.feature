#Author: Junaid.sattar85@gmail.com
Feature: Entitlement Feature
Scenario: Acceptance criteria

Given I logged into OrangeHRM
When I click Leave Module and click add Entitlements
And Add all default employees to FMLA US leave type
And I Enter "50" Entitlement
Then I Confirm that all default employees have new Entitlements added

Scenario: Add Default Employee
Given I logged into OrangeHRM
When I click Leave Module and click add Entitlements
And Add "John Smith" default employees to any leave type besides FMLA US leave type
Then I select Paternity US leave type
And I Enter "50" Entitlement
Then I Confirm that all default employees have new Entitlements added

Scenario: Check Assigned Leave

Given I logged into OrangeHRM
When I click Leave Module and click Assign Leave
And I enter "John" default employee names
And I select FMLA US
Then Balance should be present for employee
And I select From Date "2018-12-21" to "2019-01-18" 
Then I should see that the leave balance has changed based on how many days that was taken