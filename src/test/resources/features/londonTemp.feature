Feature: London Temperature
  User story: Compare temperature in London on the website against the Google


  Scenario: User is searching for London temp
    Given user is on OpenWeather Home page
    When user search for 'London' location and save temp
    And user opens new tab to search 'London weather' on Google
    Then user is comparing if temp on website is same as on Google