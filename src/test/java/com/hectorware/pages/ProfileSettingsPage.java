package com.hectorware.pages;

import com.hectorware.utilities.ConfigurationReader;
import com.hectorware.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProfileSettingsPage {

    @FindBy(xpath = "//*[@id='expand']")
    public WebElement profileDropdown;

    @FindBy(xpath = "//li[@data-id='settings']")
    public WebElement settingsTab;

    @FindBy(xpath = "//input[@id='displayname']")
    public WebElement fullNameBox;

    @FindBy(xpath = "//a[@class='user-status-menu-item__toggle']")
    public WebElement SetStatus;

    public void loginValid(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Driver.getDriver().findElement(By.id("user")).sendKeys(ConfigurationReader.getProperty("app.username"));
        Driver.getDriver().findElement(By.id("password")).sendKeys(ConfigurationReader.getProperty("app.password"));
        Driver.getDriver().findElement(By.id("submit-form")).click();

        //verify Dashboard page
        String expectedTitle = "Files - QA Hectorware";
        Assert.assertEquals(expectedTitle,Driver.getDriver().getTitle());

        System.out.println("Logged in to the app successfully...");

    }

}
