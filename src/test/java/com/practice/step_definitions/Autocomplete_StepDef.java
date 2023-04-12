package com.practice.step_definitions;

import com.practice.pages.AutocompletePage;
import com.practice.pages.HomePage;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class Autocomplete_StepDef extends HomePage {

    AutocompletePage autocompletePage = new AutocompletePage();

    @When("user clicks on Autocomplete link")
    public void user_clicks_on_autocomplete_link() {
        autocomplete.click();
    }

    @When("user start typing {string} in the input box")
    public void user_start_typing_in_the_input_box(String input) {
        autocompletePage.inputBox.sendKeys(input);
    }

    @When("user choose Serbia from autocomplete options")
    public void user_choose_serbia_from_autocomplete_options() {
        autocompletePage.serbiaValue.click();
    }

    @When("user click on Submit button")
    public void user_click_on_submit_button() {
        autocompletePage.submitBtn.click();
    }

    @Then("user can see message You selected: Serbia")
    public void user_can_see_message_you_selected_serbia() {
        Assert.assertTrue(autocompletePage.resultMsg.isDisplayed());
    }

}
