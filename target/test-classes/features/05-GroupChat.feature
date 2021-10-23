@groupChat @Dev
Feature: Send Message

  @SendMessage
  Scenario: Send message with valid text
    Given User already login on the Cicle App and click card on the Teams
    And User on the Teams Page
    When User click group chat and input "Big Project" as a message
    And User click attach File and input "test.png"
    Then Message already sent
    
    
    @SendEmptyMessage
    Scenario: Send empty message
    	Given User on the Cicle App and click card on the Teams
    	When User open the group chat and input "HaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHaloHalo" as a message
    	Then Cannot send message
    
    
    