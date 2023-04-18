package com.practice.pages;

import com.practice.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticeHomePage {

    public PracticeHomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[.='Home']")
    public WebElement homeBtn;

    @FindBy(xpath = "//a[.='Add/Remove Elements']")
    public WebElement addRemElements;

    @FindBy(xpath = "//a[.='Autocomplete']")
    public WebElement autocomplete;

}
