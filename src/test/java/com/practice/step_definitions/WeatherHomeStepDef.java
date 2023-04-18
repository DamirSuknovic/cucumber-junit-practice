package com.practice.step_definitions;

import com.practice.pages.WeatherHomePage;
import com.practice.utilities.ConfigurationReader;
import com.practice.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class WeatherHomeStepDef {

    WeatherHomePage weatherHome = new WeatherHomePage();

    @Given("user is on OpenWeather Home page")
    public void user_is_on_open_weather_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("URL2"));
    }

    @Then("user can see correct placeholder text {string}")
    public void user_can_see_correct_placeholder_text(String text) {
        Assert.assertTrue(weatherHome.mainSearch.getAttribute("placeholder").equals(text));
    }


}
