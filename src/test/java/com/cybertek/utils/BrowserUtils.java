package com.cybertek.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class BrowserUtils {
    /*
   This method is used to pause the code for given seconds
   it is stati method so we can call
   BrowserUtil.sleep(5)
    */
    public static void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Exception happened in sleep method");
        }

    }
    /*
    This method will scroll down on any page
     */
    public static void scrollDown(int scrollNumber) {

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0," + scrollNumber + ")");
    }

    public static List<String> getElementsText(List<WebElement> webElementList) {
        // Create place holder list<String>
        List<String> actualAsString = new ArrayList<>();

        for (WebElement each : webElementList) {
            actualAsString.add(each.getText());
        }
        return actualAsString;
    }
    public static List<String> getElementsTextFes(List<WebElement> webElementList) {

        List<String> actualAsString = new ArrayList<>();

        for (WebElement each : webElementList) {
            for (String item : each.getText().split("\r?\n")) {
                actualAsString.add(item );
            }
        }
        return actualAsString;
    }


}
