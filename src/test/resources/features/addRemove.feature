Feature: Practicing add or remove functionality
  Agile story: As a user, I can click on Add to add element and on Remove to remove it.


  Scenario: Add/Remove Elements
    Given user is on Practice Home page
    When user clicks on AddRemove Elements link
    And user click on Add button to add element
    And user click on Remove button
    Then user is able to remove added elements