package com.cybertek.pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CreateNewUserPage extends BasePage {

    @FindBy(xpath = "//a[.=' Signup / Login']")
    public WebElement signupLoginBtn;

    @FindBy(xpath = "//h2[.='New User Signup!']")
    public WebElement newUserSignupText;

    @FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement newUserNameBox;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    public WebElement newUserEmailBox;

    @FindBy(xpath = "//button[.='Signup']")
    public WebElement signupBtn;

    @FindBy(xpath = "//h2[.='Enter Account Information']")
    public WebElement enterAccountInfoText;

    @FindBy(xpath = "//label[@for='id_gender1']")
    public WebElement mrRadioBtn;

    @FindBy(id="password")
    public WebElement passwordBox;

    @FindBy(xpath = "//select[@id='days']")
    public WebElement dayDropDown;

    @FindBy(xpath = "//select[@id='months']")
    public WebElement monthDropDown;

    @FindBy(xpath = "//select[@id='years']")
    public WebElement yearDropDown;

    @FindBy(id = "newsletter")
    public WebElement signupNewsletter;

    @FindBy(id = "optin")
    public WebElement optIn;

    @FindBy(id = "first_name")
    public WebElement firstNameBox;

    @FindBy(id = "last_name")
    public WebElement lastNameBox;

    @FindBy(id = "company")
    public WebElement companyBox;

    @FindBy(id = "address1")
    public WebElement addressOneBox;

    @FindBy(id = "address2")
    public WebElement addressTwoBox;

    @FindBy(xpath = "//select[@id='country']")
    public WebElement countryDropDown;

    @FindBy(id = "state")
    public WebElement stateBox;

    @FindBy(id = "city")
    public WebElement cityBox;

    @FindBy(id = "zipcode")
    public WebElement zipcodeBox;

    @FindBy(id = "mobile_number")
    public WebElement phoneNumberBox;

    @FindBy(xpath = "//button[.='Create Account']")
    public WebElement createAccountBtn;

    @FindBy(xpath = "//h2[.='Account Created!']")
    public WebElement accountcreatedMsg;

    @FindBy(xpath = "//a[@data-qa='continue-button']")
    public WebElement continueBtn;

    @FindBy(xpath = "//i[@class='fa fa-user']")
    public WebElement loggedInAsMsg;




    public void fillInBirthday(){
        Select day = new Select(dayDropDown);
        day.selectByVisibleText("1");
        Select month = new Select(monthDropDown);
        month.selectByVisibleText("January");
        Select year = new Select(yearDropDown);
        year.selectByVisibleText("2000");
    }

    public void fillInInfo(){
        Faker faker = new Faker();
        firstNameBox.sendKeys(faker.name().firstName());
        lastNameBox.sendKeys(faker.name().lastName());
        companyBox.sendKeys(faker.company().name());
        addressOneBox.sendKeys(faker.address().streetAddressNumber());
        addressTwoBox.sendKeys(faker.address().buildingNumber());
        Select select = new Select(countryDropDown);
        select.selectByVisibleText("United States");
        stateBox.sendKeys(faker.address().stateAbbr());
        cityBox.sendKeys(faker.address().city());
        zipcodeBox.sendKeys(faker.address().zipCode());
        phoneNumberBox.sendKeys(faker.phoneNumber().cellPhone());
    }




}
