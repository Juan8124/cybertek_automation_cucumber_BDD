package com.cybertek.step_defs;

import com.cybertek.pages.Case7Page;
import com.cybertek.utils.ConfigurationReader;
import com.cybertek.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;


public class Case7StepDefs {
    Case7Page case7Page = new Case7Page();

    @Given("User launches browser and navigates to the url")
    public void user_launches_browser_and_navigates_to_the_url() {
        Driver.getDriver().get(ConfigurationReader.getProperty("AutomationExercise.url"));
    }

    @Then("Verifies that the home page message {string} is visible successfully")
    public void verifies_that_the_home_page_message_is_visible_successfully(String string) {
        Assert.assertEquals(string, Driver.getDriver().getTitle());
    }

    @Then("Click on Test Cases button")
    public void click_on_button() {
        case7Page.slideOne.click();
        case7Page.actualBtn.click();

    }

    @Then("Verify User navigated to {string} cases page successfully")
    public void verify_user_navigated_to_cases_page_successfully(String string) {
        Assert.assertEquals(string, case7Page.text.getText());
    }

}
