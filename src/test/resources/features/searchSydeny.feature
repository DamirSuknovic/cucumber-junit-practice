Feature: Search for Sydney, AU

  @wip
  Scenario: Search and select Sydney, AU from the list
    Given user is on OpenWeather Home page
    When user search for 'Sydney'
    Then user sees city title 'Sydney, AU'
    And user sees date and time