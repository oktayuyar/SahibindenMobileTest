package com.oktay.test.util;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePageUtil {

    public AppiumDriver<MobileElement> driver;

    public BasePageUtil(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
    }

    public void clickElement(By selector) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.presenceOfElementLocated(selector)).click();
    }

    public void setText(By selector, String text) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.presenceOfElementLocated(selector)).sendKeys(text);
    }

    public String getText(By selector) {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        return wait.until(ExpectedConditions.presenceOfElementLocated(selector)).getText();
    }

    public void tapWithCoordinates(int x, int y) {
        TouchAction action = new TouchAction(driver);
        action.tap(x, y).perform();
    }

    public void sleep(int second) {
        try {
            Thread.sleep(second * 1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

}
