package com.practice.pages;

import com.practice.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddRemovePage {

    public AddRemovePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[.='Add Element']")
    public WebElement addElemBtn;

    @FindBy(xpath = "//button[.='Delete']")
    public WebElement deleteBtn;

}
