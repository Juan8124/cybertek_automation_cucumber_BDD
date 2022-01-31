package com.cybertek.step_defs;

import com.cybertek.pages.AutoCompletesPage;
import com.cybertek.utils.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.*;

import java.util.List;

public class AutoCompletesStepDefs {
    AutoCompletesPage autoCompletesPage = new AutoCompletesPage();

    @Given("user clicks on Autocomplete")
    public void user_clicks_on_autocomplete() {
        autoCompletesPage.linkToAutoCompletes.click();
    }


    @Then("User should be able input {string}")
    public void user_should_be_able_input(String string) {
        autoCompletesPage.countryTab.sendKeys(string);


    }

    @And("Verify all countries are being displayed:")
    public void verifyAllCountriesAreBeingDisplayed(List<String> countries) {
List<String> names = BrowserUtils.getElementsTextFes(autoCompletesPage.listOf);
assertEquals(countries,names);
/*
        try {
            List<String> listss = BrowserUtils.getElementsText(autoCompletesPage.listOf);
            assertEquals(countries, listss);
        } catch (AssertionError e) {
            System.out.println(e.getMessage());
        }


 */
    }


    @Then("select United States Of America and click submit")
    public void select_united_states_of_america_and_click_submit() {
        autoCompletesPage.unitedStatesOption.click();
    }


    @Then("User should get {string}")
    public void user_should_get(String string) {
        autoCompletesPage.submitBtn.click();
        assertEquals(string, autoCompletesPage.result.getText());

    }


}
