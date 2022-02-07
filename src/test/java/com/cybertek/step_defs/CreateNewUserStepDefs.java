package com.cybertek.step_defs;

import com.cybertek.pages.CreateNewUserPage;
import com.cybertek.utils.ConfigurationReader;
import com.cybertek.utils.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class CreateNewUserStepDefs {
    CreateNewUserPage page = new CreateNewUserPage();

    @Given("User is on automation exercise website")
    public void user_is_on_automation_exercise_website() {
        Driver.getDriver().get(ConfigurationReader.getProperty("AutomationExercise.url"));
    }

    @Then("verify User is on homepage")
    public void verify_user_is_on_homepage() {
        Assert.assertEquals("Automation Exercise", Driver.getDriver().getTitle());
    }

    @And("click on Signup\\/Login button")
    public void clickOnSignupLoginButton() {
        page.signupLoginBtn.click();
    }
    @Then("verify {string} is visible")
    public void verify_is_visible(String newUser) {
        Assert.assertEquals(newUser,page.newUserSignupText.getText());
    }

    @Then("Enter name and email address")
    public void enter_name_and_email_address() {
        page.newUserNameBox.sendKeys("JuanTiffanie");
        page.newUserEmailBox.sendKeys("JuanTiffanie@hotmail.com");
    }

    @Then("click signup button")
    public void click_signup_button() {
        page.signupBtn.click();
    }

    @Then("verify that {string} is visible")
    public void verify_that_is_visible(String enterInfo) {
        Assert.assertEquals(enterInfo, page.enterAccountInfoText.getText());
    }

    @Then("fill details Title, Password, Date of birth")
    public void fill_details_title_name_email_password_date_of_birth() {
        page.mrRadioBtn.click();
        page.passwordBox.sendKeys("JuanTif");
        page.fillInBirthday();
    }

    @Then("select checkbox Sign up for our newsletter!")
    public void selectCheckboxSignUpForOurNewsletter() {
        page.signupNewsletter.click();
    }
    @Then("Select checkbox Receive special offers from our partners!")
    public void selectCheckboxReceiveSpecialOffersFromOurPartners() {
        page.optIn.click();
    }

    @Then("Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number")
    public void fill_details_first_name_last_name_company_address_address2_country_state_city_zipcode_mobile_number() {
        page.fillInInfo();
    }

    @And("Click create account button")
    public void clickCreateAccountButton() {
        page.createAccountBtn.click();
    }

    @Then("verify that ACCOUNT CREATED! is visible")
    public void verifyThatACCOUNTCREATEDIsVisible() {
        Assert.assertEquals("ACCOUNT CREATED!",page.accountcreatedMsg.getText());
    }
    @Then("Click continue button")
    public void click_continue_button() {
        page.continueBtn.click();
    }


    @Then("verify that {string} text is visible")
    public void verifyThatTextIsVisible(String username) {
        Assert.assertEquals(username, page.loggedInAsMsg.getText());
    }



}
