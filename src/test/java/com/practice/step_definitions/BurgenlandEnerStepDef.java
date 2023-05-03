package com.practice.step_definitions;

import com.practice.pages.BurgenlandEnerPage;
import com.practice.utilities.BrowserUtils;
import com.practice.utilities.ConfigurationReader;
import com.practice.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class BurgenlandEnerStepDef extends BrowserUtils {

    BurgenlandEnerPage burgenlandEnerPage = new BurgenlandEnerPage();

    @Given("user is on Burgenland Home page")
    public void user_is_on_burgenland_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("URL4"));
    }
    @When("user types {string} to ChatBot")
    public void user_types_to_chat_bot(String greetings) {
        burgenlandEnerPage.allowCookies.click();
        sleep(4);
        burgenlandEnerPage.textInput.sendKeys(greetings, Keys.ENTER);
    }
    @And("user clicks on {string} button first")
    public void user_clicks_on_button_first(String str1) {
        sleep(4);
        burgenlandEnerPage.tarifBtn.click();
        sleep(4);
    }

    @And("user clicks on {string} button second")
    public void user_clicks_on_button_second(String str2) {

    }

    @And("user clicks on {string} button third")
    public void user_clicks_on_button_third(String str3) {

    }
    @Then("user can see {string} answer")
    public void user_can_see_answer(String answer) {

    }

}
