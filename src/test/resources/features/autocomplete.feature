Feature: Testing Autocomplete page
  User story: User is able to start typing letters and autocomplete dropdown must show available options

  Scenario: User is on Autocomplete page and he/she is choosing options
    Given user is on Practice Home page
    When user clicks on Autocomplete link
    And user start typing "serb" in the input box
    And user choose Serbia from autocomplete options
    And user click on Submit button
    Then user can see message You selected: Serbia
