Feature:Login - Logout feature

  @WARE-884/positive @WARE-885
  Scenario Outline: Login & Logout to website / Positive Scenario
    Given user on the login page
    When user enter valid <userNameV> and <PasswordV>
    Then user click the Login button
    Then user should reach the main page
    Then user click profile button
    Then user should click Log out option
    Then user should log out from the page
    Examples:
      | userNameV    | PasswordV     |
      | "Employee12" | "Employee123" |
      | "Employee2"  | "Employee123" |
      | "User2"      | "Userpass123" |


  @WARE-884/negative
  Scenario Outline: Login & Logout to website / Negative Scenario
    Given user on the login page
    When user enter invalid username <userName> and password <Password>
    Then user click the Login button
    Then user should see Wrong username or password message
    Examples:
      | userName      | Password      |
      | "Employee12 " | "Ee4"         |
      | "E"           | "Employee123" |
      | "U2  "        | "Userpass123" |