@Archive @Dev
Feature: User want to archive list

  @ArchiveList
  Scenario: Archive List on the Board
    Given User have been sign in on the Cicle App and click card 
    When User click Board and will be direct on the Board Page
    And User create new List on the board and input "Archive" as listname
    And User click toggle on the list and click archive this list
    Then List will be archive
    

  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
