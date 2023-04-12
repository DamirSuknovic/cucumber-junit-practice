package com.practice.pages;

import com.practice.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WeatherHomePage {

    public WeatherHomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//input[@placeholder='Weather in your city'])[1]")
    public WebElement mainSearch;

}
