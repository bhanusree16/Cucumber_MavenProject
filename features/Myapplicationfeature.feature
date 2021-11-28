
Feature: Test smoke

Scenario Outline: login test
Given open browser
When enter "<user>" and "<pass>"
Then CLICK ON LOGIN
Then close

Examples:
						| user | pass |
						| bhanu1 | bhanu1 |
						| bhanu2 | bhanu2 |
						| bhanu3 | bhanu3 |
