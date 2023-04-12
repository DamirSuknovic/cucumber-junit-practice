package com.practice.pages;

import com.practice.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutocompletePage {

    public AutocompletePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "input#myCountry")
    public WebElement inputBox;

    @FindBy(id = "myCountryautocomplete-list")
    public WebElement serbiaValue;

    @FindBy(xpath = "//input[@value='Submit']")
    public WebElement submitBtn;

    @FindBy(id = "result")
    public WebElement resultMsg;

}
