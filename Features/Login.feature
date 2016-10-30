
Feature: Login Functionality

Scenario: User should not be able to login with invalid credentials

Given User is on Vodafone home page
When user tries to login with invalid credentials
Then login should be unsuccessful
And prompt following message to user
"""
Your mobile number is not registered for My Vodafone.
"""