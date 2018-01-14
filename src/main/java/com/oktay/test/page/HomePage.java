package com.oktay.test.page;

import com.oktay.test.contants.General_Constants;
import com.oktay.test.util.BasePageUtil;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class HomePage extends BasePageUtil implements  General_Constants{

    public HomePage(AndroidDriver<MobileElement> driver){
        super(driver);
    }

    public LoginPage callLoginPage() {
        sleep(3);
        clickElement(ACCOUNTBUTTON);

        sleep(3);
        clickElement(LOGINBUTTON);
        return new LoginPage(driver);
    }

    public void swipeTest() {
        sleep(3);
        swipeUp();
        sleep(3);
    }
}
