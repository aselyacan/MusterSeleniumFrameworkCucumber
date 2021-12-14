@muster
Feature: User success register with valid credentials

  Background: User visit homepage
	Given user visit localhost

  Scenario Outline: Register user
	When User enter a username "<username>"
	And  User enter a name "<name>"
	And  User enter a lastname "<lastname>"
	And  User enter a passport "<passport1>"
	And  User enter a second passport "<passport2>"
	Then User click registerButton
	And  User sees succes message
	Examples:
	  | username | passport1 | passport2 | name  | lastname  |
	  | muster1  | passport1 | passport2 | name1 | lastname1 |