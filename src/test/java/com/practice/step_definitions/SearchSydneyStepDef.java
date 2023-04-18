package com.practice.step_definitions;

import com.practice.pages.AfterSearchPage;
import com.practice.pages.WeatherHomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SearchSydneyStepDef {

    WeatherHomePage weatherHome = new WeatherHomePage();
    AfterSearchPage afterSearch = new AfterSearchPage();

    @When("user search for {string}")
    public void user_search_for(String city) {
        weatherHome.mainSearch.sendKeys(city);
        weatherHome.mainSearch.submit();
        afterSearch.chooseCity.click();
    }
    @Then("user sees city title {string}")
    public void user_sees_city_title(String city) {
        Assert.assertEquals(afterSearch.cityTitle.getText(), city);
    }
    @Then("user sees date and time")
    public void user_sees_date_and_time() {
        afterSearch.timeAndDate.isDisplayed();
    }

}
