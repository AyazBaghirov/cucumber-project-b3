Feature: Docuport Login Logout Feature

  Scenario: Login as a client
    Given user is on Docuport login page
    When user enters username for client
    And user enters password fir client
    And user click login button
    Then user should be able to see the home for client