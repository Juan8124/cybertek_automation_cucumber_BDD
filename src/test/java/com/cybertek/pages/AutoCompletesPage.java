package com.cybertek.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class AutoCompletesPage extends BasePage{

@FindBy(xpath = "//a[.='Autocomplete']")
    public WebElement linkToAutoCompletes;

@FindBy(id = "myCountry")
    public WebElement countryTab;

@FindBy(xpath = "//div[@id='myCountryautocomplete-list']")
    public List<WebElement> listOf;

@FindBy(xpath = "//div[@id='myCountryautocomplete-list']//div[5]")
    public WebElement unitedStatesOption;

@FindBy(xpath = "//p[@id='result']")
    public WebElement result;

@FindBy(xpath = "//input[@type='button']")
    public WebElement submitBtn;













}
