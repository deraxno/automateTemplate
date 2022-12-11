Feature: swipe
@positive
  Scenario: user success input form page
    Given user in homepage
    When click form button
    And input text
    And check input text result
    Then input and output is match
  @negative
    Scenario: user success switch toogle
      Given user in homepage
      When click form button
      And switch toogle off
      Then toogle success off