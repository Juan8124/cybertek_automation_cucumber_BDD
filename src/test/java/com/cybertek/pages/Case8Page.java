package com.cybertek.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.security.cert.X509Certificate;
import java.util.List;

public class Case8Page extends BasePage {

    @FindBy(xpath = "//a[contains(text(), ' Products')]")
    public WebElement productsBtn;

    @FindBy(xpath = "//a[@href='/brand_products/Polo']")
    public WebElement poloBrand;

    @FindBy(xpath =  "//a[@href='/brand_products/H&M']")
    public WebElement hNMBrand;

    @FindBy(xpath = "//a[@href='/brand_products/Madame']")
    public WebElement madameBrand;

    @FindBy(xpath ="//a[@href='/brand_products/Mast & Harbour']" )
    public WebElement mastNHarbourBrand;

    @FindBy(xpath = "//a[@href='/brand_products/Babyhug']")
    public WebElement babyHugBrand;

    @FindBy(xpath = "//a[@href='/brand_products/Allen Solly Junior']" )
    public WebElement allenSollyJuniorBrand;

    @FindBy(xpath = "//a[@href='/brand_products/Kookie Kids']")
    public WebElement kookieKidsBrand;

    @FindBy(xpath = "//a[@href='/brand_products/Biba']")
    public WebElement bibaBrand;

    // (Brand Names)POLO, H&M, Madame, Mast & Harbour,Babyhug,Allen Solly Junior,Kookie Kids,Biba

    @FindBy(xpath = "//a[@href='/product_details/1']")
    public WebElement viewProduct1;

    @FindBy(xpath = "//h2[.='Blue Top']")
    public WebElement productName;
    @FindBy(xpath = "//p[.='Category: Women > Tops']")
    public WebElement category;

    @FindBy(xpath = "//span[.='Rs. 500']")
    public WebElement price;

    @FindBy(xpath = "//p[contains(text(),' In Stock')]")
    public WebElement availability;

    @FindBy(xpath = "//p[contains(text(),' New')]")
    public WebElement condition;

    @FindBy(xpath = "//p[contains(text(),'Polo')]")
    public WebElement brand;

}
