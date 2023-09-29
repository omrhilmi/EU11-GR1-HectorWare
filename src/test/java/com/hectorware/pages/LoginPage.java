package com.hectorware.pages;

import com.hectorware.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='user']")
    public WebElement inputNameBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement inputPasswordBox;

    @FindBy(xpath ="//input[@id='submit-form']" )
    public WebElement loginButton;

    @FindBy(xpath = "//p[@class='warning wrongPasswordMsg']")
    public WebElement wrongPasswordMessage;

    @FindBy(xpath = "//*[@id=\"expand\"]")
    public WebElement profileButton;

    @FindBy(xpath = "//*[@id=\"expanddiv\"]/ul/li[4]/a")
    public WebElement logoutButton;
}
