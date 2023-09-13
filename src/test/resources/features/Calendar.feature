Feature: Calendar Functionality


  Scenario: View Calendar page
    Given the user login to the app
    When the user clicks on the Calendar tab
    And calendar page should be opened
    Then User should click +New event sign
    Then the user should be able to add to the calendar page
    Then User should select add new event from dropdown
    Then User verify the event is added