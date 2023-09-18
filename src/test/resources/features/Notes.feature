Feature: Note create / edit / delete
  @NotesEmre:
  @WARE-837
  Scenario: Using The Notes Functions
    Given User login into the web application
    When  User entered the valid credentials into the username and password box
    And   User clicked the login button
    Then  The main web page should be displayed
    Then  User clicked the Notes tab
    Then  User should see the Notes page
    Then  User should click the + sign
    And   User will write something
    Then  User will verify create and edit functions are working correctly
    Then  User should click the ... sign
    And   User should click delete button





