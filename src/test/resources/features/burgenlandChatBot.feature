Feature: Testing the Simple ChatBot
  User story: Test if ChatBot on home page is providing rule-based answers

  @wip
  Scenario: User is chatting with the ChatBot
    Given user is on Burgenland Home page
    When user types 'Hallo' to ChatBot
    And user clicks on 'Tarif' button first
    And user clicks on 'Electricity' button second
    And user clicks on 'Privat' button third
    Then user can see ' Um welches Thema handelt es sich?' answer