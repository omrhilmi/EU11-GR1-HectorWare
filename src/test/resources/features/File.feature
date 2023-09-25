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

@fileEdit @WARE-832
  Scenario: Login to the website
    Given user on the login page
    When User enter valid credentials
    Then Main page should be displayed
    Then User click on the file tab
    Then User should click three dots next to the file that is desired to edit
    Then User should select Rename from dropdown
    Then User verify the file name is edited

 @fileDelete @WARE-831
  Scenario: Login to the website
    Given user on the login page
    When User enter valid credentials
    Then Main page should be displayed
    Then User click on the file tab
    Then User should click three dots next to the file that is desired to edit
    Then User should select Delete File from dropdown menu
    Then User verify the file name is deleted