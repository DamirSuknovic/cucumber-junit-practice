package com.practice.step_definitions;

import com.practice.pages.AddRemovePage;
import com.practice.pages.PracticeHomePage;
import com.practice.utilities.ConfigurationReader;
import com.practice.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import org.openqa.selenium.NoSuchElementException;

public class AddRemoveStepDef {

    PracticeHomePage practiceHomePage = new PracticeHomePage();
    AddRemovePage addRemovePage = new AddRemovePage();

    @Given("user is on Practice Home page")
    public void user_is_on_practice_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("URL1"));
    }

    @When("user clicks on AddRemove Elements link")
    public void user_clicks_on_add_remove_elements_link() {
        practiceHomePage.addRemElements.click();
    }

    @And("user click on Add button to add element")
    public void user_click_on_add_button_to_add_element() {
        addRemovePage.addElemBtn.click();
    }

    @And("user click on Remove button")
    public void user_click_on_remove_button() {
        addRemovePage.deleteBtn.click();
    }

    @Then("user is able to remove added elements")
    public void user_is_able_to_remove_added_elements() {
        try {
            addRemovePage.deleteBtn.isDisplayed();
            System.out.println("Element is still present on the web page.");
        } catch (NoSuchElementException e) {
            System.out.println("Element has been deleted from the web page.");
        }
    }

}






