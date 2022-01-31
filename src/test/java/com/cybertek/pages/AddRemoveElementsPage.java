package com.cybertek.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.security.cert.X509Certificate;

public class AddRemoveElementsPage extends BasePage {

    @FindBy(xpath = "//a[.='Add/Remove Elements']")
    public WebElement linkAddRemoveElements;

    @FindBy(xpath = "//button[.='Add Element']")
    public WebElement addElementBtn;

    @FindBy(xpath = "//button[.='Delete']")
    public WebElement deleteBtn;

}
