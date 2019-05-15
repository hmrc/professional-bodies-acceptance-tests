@suite

Feature: Display list of approved professional organisations

  Scenario: Viewing all organisations
    When the user navigates to the professional bodies listing page
    Then the count of organisations shown is 2890

  Scenario: Searching for "AABC"
    Given the user navigates to the professional bodies listing page
    When the user enters "AABC" into the search box
    Then the count of organisations shown is 1

  Scenario: Searching for "Am"
    Given the user navigates to the professional bodies listing page
    When the user enters "Am" into the search box
    Then the count of organisations shown is 273