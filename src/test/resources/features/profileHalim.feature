Feature: Profile Setting
@ProfileHalim @WARE-848
  Scenario: Display Profile Settings page
    Given the user login to the app
    When the user clicks on the Profile avatar
    And the user clicks on Profile Settings in the dropdown
    #Then the user should Profile Settings page