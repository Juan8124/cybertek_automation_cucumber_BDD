package com.cybertek.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Case7Page extends BasePage {


    @FindBy(xpath = "(//a[@class='test_cases_list']//button[@class='test_cases_list'])")
    public WebElement testCaseBtn;

    @FindBy(xpath = "//button[@class='btn btn-success']")
    public WebElement actualBtn;

    @FindBy(xpath = "//li[@data-target='#slider-carousel'][2]")
    public WebElement slideOne;

@FindBy(xpath = "//b[.='Test Cases']")
    public WebElement text;

}
