package com.hectorware.stepDefinitions;

import com.hectorware.pages.ProfileSettingsPage;
import com.hectorware.utilities.BrowserUtils;
import com.hectorware.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;

public class profileHalim_StepDefs {

    ProfileSettingsPage profileSettingsPage = new ProfileSettingsPage();

    @Given("the user login to the app")
    public void the_user_login_to_the_app() {
        profileSettingsPage.loginValid();

    }
    @When("the user clicks on the Profile avatar")
    public void the_user_clicks_on_the_profile_avatar() {
        BrowserUtils.clickWithWait(By.xpath("//*[@id='expand']"),2);
        BrowserUtils.waitFor(3);
    }

    @When("the user clicks on Profile Settings in the dropdown")
    public void the_user_clicks_on_profile_settings_in_the_dropdown() {
        //BrowserUtils.clickWithWait(By.xpath("//li[@data-id='settings']"),2);
        BrowserUtils.clickWithJS(profileSettingsPage.settingsTab);
        BrowserUtils.waitFor(3);

    }
    @Then("the user should Profile Settings page")
    public void the_user_should_profile_settings_page() {
        String expectedURL = "https://qa.hectorware.com/index.php/settings/user";
        Assert.assertEquals(expectedURL, Driver.getDriver().getCurrentUrl());
        System.out.println("Profile Settings Page is displayed...");

    }
}
