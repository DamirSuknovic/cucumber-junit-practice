Feature: London Temperature
  User story: Compare temperature in London on the website against the Google

  @wip
  Scenario: User is searching for London temp
    Given user is on OpenWeather Home page
    When user search for 'London'
    And user opens new tab to search 'London' on Google
    And user saves both temperatures to compare
    Then user is comparing if temp on website is same as on Google