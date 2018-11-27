package com.oktay.test.page.androidConstants;

import com.oktay.test.util.BasePageUtil;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

/*
 *  Created by oktayuyar on 26.11.2018
 */
public class AndroidLoginPageConstants extends BasePageUtil {

    public AndroidLoginPageConstants(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    protected final By EMAIL_TEXTBOX = By.id("com.sahibinden:id/myaccount_activity_login_username_edittext");
    protected final By PASSWORD_TEXTBOX = By.id("com.sahibinden:id/myaccount_activity_login_password_edittext");
    protected final By LOGINACTIONBUTTON = By.id("com.sahibinden:id/myaccount_activity_login_login_action_button");
    protected final By COMPANYIMAGEVİEW = By.id("com.sahibinden:id/login_sahibinden_object_frame_layout");
    protected final By LOGOUTBUTTON = By.id("com.sahibinden:id/login_logout_action");
    protected final By ERRORMESSAGE = By.id("android:id/message");
}
