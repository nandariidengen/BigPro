@AddCard @Dev
Feature: Add New Card

  @CardPositive
  Scenario: Create New Card
    Given User login into the cicle app and click card on the teams
    When User direct into teams page and click Board
    And User create new list and input "In Progress" as list name
    And User click add Card on the List and input "Register" as card name
    Then Card already created
    
  @CardNegative
  Scenario: Empty Card Name
  	Given User already on the Cicle App and click card on the teams
  	When User click Board on the teams page
  	And User add new list and input "In Progress" as list name
  	And User create new card and input "" as card name
  	Then User see the new card