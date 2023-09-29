package com.hectorware.pages;

import com.hectorware.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

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

    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[2]/a")
    public WebElement fileButton;

    @FindBy(xpath = "//span[@class='icon icon-add']")
    public WebElement plusButton;

    @FindBy(xpath = "//*[@id=\"controls\"]/div[2]/div[2]/ul/li[1]/label")
    public WebElement uploadFileButton;


    @FindBy(xpath="//span[2]/a[2]")
    public WebElement threeDots;

    @FindBy(xpath = "//*[@id=\"rightClickMenu\"]/ul/li[3]/a")
    public WebElement RenameFile;

    @FindBy(xpath = "//*[@id=\"fileList\"]/tr[2]/td[2]/div/ul/li[8]/a")
    public WebElement deleteFile;





}
