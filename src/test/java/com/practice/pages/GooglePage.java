package com.practice.pages;

import com.practice.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {

    public GooglePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "textarea#APjFqb")
    public WebElement searchBox;

    @FindBy(xpath = "(//div[@class='QS5gu sy4vM'])[1]")
    public WebElement cookiesReject;

}
