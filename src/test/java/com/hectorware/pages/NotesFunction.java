package com.hectorware.pages;

import com.hectorware.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NotesFunction {

    public NotesFunction() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='user']")
    public WebElement inputNameBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement inputPasswordBox;

    @FindBy(xpath ="//input[@id='submit-form']" )
    public WebElement loginButton;

    @FindBy(css = "#appmenu > li:nth-child(9) > a")
    public WebElement notesButton;

    @FindBy(css = "#notes_new_note")
    public WebElement createNoteButton;

    @FindBy(xpath = "//div[@class='CodeMirror-code']")
    public WebElement writingNoteSpace;

    @FindBy(xpath = "//*[@id=\"app-navigation-vue\"]/ul/li[3]/div/div/div/div/button")
    public WebElement noteFunctionButton;

    @FindBy(xpath = "/html/body/div[3]/div/ul/li/div/div/div/div/button/span")
    public WebElement deleteNoteButton;


}


