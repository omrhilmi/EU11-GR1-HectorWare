Feature: File upload / copy / delete
@fileUpload @WARE-833
  Scenario: Login to the website
    Given user on the login page
    When User enter valid credentials
    Then Main page should be displayed
    Then User click on the file tab
    Then User should click + sign
    Then User should select Upload File from dropdown
    Then User verify the file is uploaded
@file @WARE-832
  Scenario: Login to the website
    Given user on the login page
    When User enter valid credentials
    Then Main page should be displayed
    Then User click on the file tab
    Then User should click + sign
    Then User should select Upload File from dropdown
    Then User verify the file is uploaded