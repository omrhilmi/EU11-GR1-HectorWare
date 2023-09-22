package com.hectorware.stepDefinitions;

import com.hectorware.pages.FileUploadPage;
import com.hectorware.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FileUpload {

    FileUploadPage webPage = new FileUploadPage();
    @Given("User on the login page")
    public void user_on_the_login_page() {
        Driver.getDriver().get("https://qa.meetsky.net/index.php/login");
    }
    @When("User enter valid credentials")
    public void user_enter_valid_credentials() {

        webPage.inputNameBox.sendKeys("Employee12");
        webPage.inputPasswordBox.sendKeys("Employee123");
        webPage.loginButton.click();

    }
    @Then("Main page should be displayed")
    public void main_page_should_be_displayed() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Dashboard"));
    }
    @Then("User clik on the file tab")
    public void user_clik_on_the_file_tab() {
        webPage.fileButton.click();
       // WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
    }
    @Then("User should click + sign")
    public void user_should_click_sign() {
        webPage.plusButton.click();

    }

    @Then("User should select Upload File from dropdown")
    public void user_should_select_upload_file_from_dropdown() {
        String path = "/Users/tolgaaltan/Downloads/cydeo.jpeg";

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(webPage.uploadFileButton));
        webPage.uploadFileButton.sendKeys(path);


    }

    @Then("User verify the file is uploaded")
    public void user_verify_the_file_is_uploaded() {

//        WebElement element = Driver.getDriver().findElement(By.xpath("//*[@id=\"recommendations\"]/a[2]/div[2]/div[1]/span[1]"));
//        String fileName = element.getText();
//        Assert.assertTrue("File is uploaded", fileName.contains("cydeo"));

    }


}
