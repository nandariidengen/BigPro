@Restore @Dev
Feature: Restore List

  @RestoreList
  Scenario: Restore List on the Board
    Given User open Cicle App and click card on the Teams
    When User click Board and will be direct on the Board age
    And User click archive adn click switch to list
		And User click restore one of the list
		Then User see the success message 

	@RestoreCard
	Scenario: Restore Card on the Board
		Given User already login to the Cicle and click card
		And User open Board Page
		When User click button archive and click restore one of the card
		Then Card success restore
