package com.oktay.test.page;

import com.oktay.test.contants.General_Constants;
import com.oktay.test.util.BasePageUtil;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class LoginPage extends BasePageUtil implements General_Constants{

    public LoginPage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    public HomePage login(String email, String password) {
        setText(EMAIL_TEXTBOX,email);
        setText(PASSWORD_TEXTBOX,password);
        clickElement(LOGINACTIONBUTTON);

        sleep(2);
        return new HomePage(driver);
    }
}
