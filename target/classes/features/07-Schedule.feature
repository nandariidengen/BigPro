@schedule @Dev
Feature: Create New Event

  @SchedulePositive
  Scenario: Add new event with valid data
    Given User open cicle App and click card on the Teams
    When User click Schedule and user will be direct on the schedule page
    And User click create event
    And User fills in the data event and input "Sekolah QA" as notes
    Then Event will be created
    
    