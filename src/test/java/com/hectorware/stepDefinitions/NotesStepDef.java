package com.hectorware.stepDefinitions;


import com.hectorware.pages.NotesFunction;
import com.hectorware.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NotesStepDef {

    NotesFunction appPage = new NotesFunction();

    @Given("User login into the web application")
    public void user_on_the_login_page() {
        Driver.getDriver().get("https://qa.meetsky.net/index.php/login");
    }

    @When("User entered the valid credentials into the username and password box")
    public void user_enter_valid_credentials() {

        appPage.inputNameBox.sendKeys("Employee12");
        appPage.inputPasswordBox.sendKeys("Employee123");

    }

    @And("User clicked the login button")
    public void user_click_loginButton() {

        appPage.loginButton.click();

    }

    @Then("The main web page should be displayed")
    public void main_page_should_be_displayed() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Dashboard"));
    }

    @Then("User clicked the Notes tab")
    public void user_click_the_Notes_tab() {
        appPage.notesButton.click();

    }

    @Then("User should see the Notes page")
    public void user_should_see_notesPage() {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), (10));
    }

    @Then("User should click the + sign")
    public void user_should_click_the_add_button() {

        appPage.createNoteButton.click();

    }

    @And("User will write something")
    public void user_should_write_something() {

        appPage.writingNoteSpace.sendKeys("Deneme 123");
    }

    @Then("User will verify create and edit functions are working correctly")
    public void user_verify_the_create_and_edit_function() {

        WebElement element = Driver.getDriver().findElement(By.xpath("//*[@id=\"note-container\"]/div/div[2]/div[2]/div/div[1]/div[5]/div[1]/div/div/div/div[5]/pre/span"));
        String noteName = element.getText();
        Assert.assertTrue("Note Writed And Everything Verified", noteName.contains("Deneme 123"));
    }

    @Then("User should click the ... sign")
    public void user_click_the_notes_function_multiButton() {

        appPage.noteFunctionButton.click();

    }

    @And("User should click delete button")
    public void user_click_delete_button() {

        appPage.deleteNoteButton.click();
    }

}


