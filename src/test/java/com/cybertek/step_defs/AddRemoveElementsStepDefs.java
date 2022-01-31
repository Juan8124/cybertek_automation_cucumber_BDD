package com.cybertek.step_defs;

import com.cybertek.pages.AddRemoveElementsPage;
import com.cybertek.utils.BrowserUtils;
import com.cybertek.utils.ConfigurationReader;
import com.cybertek.utils.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static org.junit.Assert.*;

public class AddRemoveElementsStepDefs {
    AddRemoveElementsPage addRemoveElementsPage = new AddRemoveElementsPage();

    @Given("User is on Cybertek Practice Home Page")
    public void user_is_on_cybertek_practice_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("cybertekPractice.url"));
        assertEquals("Practice", Driver.getDriver().getTitle());
    }

    @Then("User should click on addRemoveElements")
    public void userShouldClickOnAddRemoveElements() {
        addRemoveElementsPage.linkAddRemoveElements.click();
    }

    @Then("User should be able to click on AddRemove Elements and verify text match {string}")
    public void userShouldBeAbleToClickOnAddRemoveElementsAndVerifyTextMatch(String nameOfText) {
        addRemoveElementsPage.addElementBtn.click();
        assertEquals(nameOfText, addRemoveElementsPage.addElementBtn.getText());

    }



    @Then("User should be able to verify {string} button is there and should be able to click on it")
    public void userShouldBeAbleToVerifyButtonIsThereAndShouldBeAbleToClickOnIt(String nameOFText) {
        assertEquals(nameOFText,addRemoveElementsPage.deleteBtn.getText());
        addRemoveElementsPage.deleteBtn.click();
        BrowserUtils.sleep(2);
    }


}
