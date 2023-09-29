package com.hectorware.stepDefinitions;

import com.hectorware.pages.LoginPage;
import com.hectorware.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class LoginStepDef {
    LoginPage loginPage = new LoginPage();

    @When("user enter valid {string} and {string}")
    public void user_enter_valid_userName_and_Password(String user, String pass){
    loginPage.inputNameBox.sendKeys(user);
    loginPage.inputPasswordBox.sendKeys(pass);

    }


    @Then("user click the Login button")
    public void userClickTheLoginButton() {
        loginPage.loginButton.click();
    }


    @Then("user should reach the main page")
    public void userShouldReachTheMainPage() {
        String title = Driver.getDriver().getTitle();
        Assert.assertTrue(title.contains("Dashboard"));
    }

    @Then("user click profile button")
    public void userClickProfileButton() {
        loginPage.profileButton.click();
    }

    @Then("user should click Log out option")
    public void userShouldClickLogOutOption() {
        loginPage.logoutButton.click();
    }

    @Then("user should log out from the page")
    public void userShouldLogOutFromThePage() {
        String mainTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(mainTitle.equalsIgnoreCase("Trycloud QA"));
    }

    @When("user enter invalid username {string} and password {string}")
    public void userEnterInvalidUsernameUserNameAndPasswordPassword(String userName, String password) {
        loginPage.inputNameBox.sendKeys(userName);
        loginPage.inputPasswordBox.sendKeys(password);
    }


    @Then("user should see Wrong username or password message")
    public void userShouldSeeWrongUsernameOrPasswordMessage() {

        String text = loginPage.wrongPasswordMessage.getText();
        System.out.println(text);
        Assert.assertEquals("Wrong username or password.",text,"Message is not matched");
    }



}