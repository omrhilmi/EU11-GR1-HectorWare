package com.hectorware.stepDefinitions;

import com.hectorware.pages.FileUploadPage;
import com.hectorware.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FileUpload {

    FileUploadPage webPage = new FileUploadPage();
    @Given("user on the login page")
    public void user_on_the_login_page() {
        Driver.getDriver().get("https://qa.trycloud.net");
    }
    @When("User enter valid credentials")
    public void user_enter_valid_credentials() {

        webPage.inputNameBox.sendKeys("User12");
        webPage.inputPasswordBox.sendKeys("Userpass123");
        webPage.loginButton.click();

    }
    @Then("Main page should be displayed")
    public void main_page_should_be_displayed() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Dashboard"));
    }
    @Then("User click on the file tab")
    public void user_click_on_the_file_tab() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        webPage.fileButton.click();
    }
    @Then("User should click + sign")
    public void user_should_click_sign() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        webPage.plusButton.click();

    }

    @Then("User should select Upload File from dropdown")
    public void user_should_select_upload_file_from_dropdown() {
        String path = "//Users/tolgaaltan/Desktop/TEST_QA.docx";

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(webPage.uploadFileButton));
        webPage.uploadFileButton.sendKeys(path);


    }

    @Then("User verify the file is uploaded")
    public void user_verify_the_file_is_uploaded() {

        WebElement element = Driver.getDriver().findElement(By.xpath("//*[@id=\"recommendations\"]/a[2]/div[2]/div[1]/span[1]"));
        String fileName = element.getText();
        Assert.assertTrue("File is uploaded", fileName.contains("TEST"));

    }


    @Then("User should click three dots next to the file that is desired to edit")
    public void user_should_click_three_dots_next_to_the_file_that_is_desired_to_edit() {
        webPage.threeDots.click();
    }

    @Then("User should select Rename from dropdown")
    public void user_should_select_rename_from_dropdown() {
        webPage.RenameFile.click();
    }

    @Then("User verify the file name is edited")
    public void user_verify_the_file_name_is_edited() {

    }

    @Then("User should select Delete File from dropdown menu")
    public void user_should_select_delete_file_folder_from_dropdown_menu() {
        webPage.deleteFile.click();
    }

    @Then("User verify the file name is deleted")
    public void user_verify_the_file_name_is_deleted() {

    }





}
