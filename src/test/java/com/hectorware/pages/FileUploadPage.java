package com.hectorware.pages;

import com.hectorware.utilities.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileUploadPage {
    public FileUploadPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='user']")
    public WebElement inputNameBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement inputPasswordBox;

    @FindBy(xpath ="//input[@id='submit-form']" )
    public WebElement loginButton;

    @FindBy(css = "#appmenu > li:nth-child(2) > a")
    public WebElement fileButton;

    @FindBy(css = "#controls > div.actions.creatable > a")
    public WebElement plusButton;

    @FindBy(xpath = "//label[@class='menuitem']")
    public WebElement uploadFileButton;

    @FindBy(xpath = "//*[@id=\"fileList\"]/tr[4]/td[2]/a/span[3]/a[2]/span[1]")
    public WebElement deleteButton;






}
