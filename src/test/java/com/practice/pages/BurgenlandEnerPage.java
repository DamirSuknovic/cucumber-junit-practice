package com.practice.pages;

import com.practice.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BurgenlandEnerPage {

    public BurgenlandEnerPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "textarea#msgarea")
    public WebElement textInput;

    @FindBy(xpath = "//span[@sug_id='171z8wytci']")
    public WebElement tarifBtn;

    @FindBy(xpath = "//span[@sug_id='23899jpop4']")
    public WebElement electricityBtn;

    @FindBy(xpath = "//span[@sug_id='2yqd2ffmgm']")
    public WebElement privatBtn;

    @FindBy(xpath = "//span[.=' Um welches Thema handelt es sich?']")
    public WebElement themaText;

    @FindBy(xpath = "//a[@id='CybotCookiebotDialogBodyButtonDecline']")
    public WebElement allowCookies;


}
