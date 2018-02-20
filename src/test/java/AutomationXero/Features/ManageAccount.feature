Feature: As a user I want to manage my Xero account

  Scenario: As an existing Xero user I can add an ANZ account number to my profile

    Given user logged into Xero as an authorized user
    When the user adds a new ANZ account to his profile
    Then the account is added to his Xero profile


