package com.practice.step_definitions;

import com.practice.pages.AfterGoogleSearchPage;
import com.practice.pages.AfterSearchPage;
import com.practice.pages.GooglePage;
import com.practice.pages.WeatherHomePage;
import com.practice.utilities.ConfigurationReader;
import com.practice.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class ComparingTempStepDef {

    WeatherHomePage weatherHome = new WeatherHomePage();
    AfterSearchPage afterSearchPage = new AfterSearchPage();
    AfterGoogleSearchPage afterGoogleSearchPage = new AfterGoogleSearchPage();
    GooglePage googlePage = new GooglePage();
    String openWeatherLondonTemp = "";
    String googleLondonTemp = "";

    @When("user search for {string} location and save temp")
    public void user_search_for_location_and_save_temp(String city) {
        weatherHome.mainSearch.sendKeys(city);
        weatherHome.mainSearch.submit();
        afterSearchPage.chooseCityLondon.click();
        // saving the OpenWeather London temp in variable
        openWeatherLondonTemp = afterSearchPage.tempLondonOpenWeather.getText();
    }

    @When("user opens new tab to search {string} on Google")
    public void user_opens_new_tab_to_search_on_google(String city) {
        Driver.getDriver().get(ConfigurationReader.getProperty("URL3"));

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(googlePage.cookiesReject);

        googlePage.cookiesReject.click();
        googlePage.searchBox.sendKeys(city);
        googlePage.searchBox.submit();
        // saving the Google London temp in variable
        googleLondonTemp = afterGoogleSearchPage.googleLondonTemp.getText().concat("°C");

    }

    @Then("user is comparing if temp on website is same as on Google")
    public void user_is_comparing_if_temp_on_website_is_same_as_on_google() {
        Assert.assertEquals(openWeatherLondonTemp, googleLondonTemp);
    }

}
