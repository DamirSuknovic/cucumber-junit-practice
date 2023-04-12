package com.practice.pages;

import com.practice.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AfterSearchPage {

    public AfterSearchPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h2[.='Sydney, AU']")
    public WebElement cityTitle;

    @FindBy(xpath = "//a[.=' Sydney, AU']")
    public WebElement chooseCity;

    @FindBy(css = "span.orange-text")
    public WebElement timeAndDate;

}
