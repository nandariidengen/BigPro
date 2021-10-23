@AddList @Dev
Feature: Add New List

  @AddListPostive
  Scenario: Add List on the Board
    Given User already Sign In on the Cicle App
    When User click card on the teams
    And User will be direct on the Teams Page and click Board
    And User Add List on the Board and input "In Progress" as list name
    Then List is already created
    
  @AddListNegative
  Scenario: Create new List on the Board
  	Given User open the Cicle App and click card on the teams
  	When User go to teams page and click Board
  	And User create new list on the board and input "" as list name
  	Then Error message will appears

    