Feature: File upload / copy / delete

  Scenario: Login to the website
    Given User on the login page
    When User enter valid credentials
    Then Main page should be displayed
    Then User clik on the file tab
    Then User should click + sign
    Then User should select Upload File from dropdown
    Then User verify the file is uploaded