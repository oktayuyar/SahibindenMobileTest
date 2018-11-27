package com.oktay.test.page.androidConstants;

import com.oktay.test.util.BasePageUtil;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

/*
 *  Created by oktayuyar on 26.11.2018
 */
public class AndroidHomePageConstants extends BasePageUtil {

    public AndroidHomePageConstants(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    protected final By SEARCHTEXTVIEW= By.id("com.sahibinden:id/browsing_activity_featured_classifieds_text_view_search");
    protected final By ACCOUNTBUTTON= By.id("com.sahibinden:id/action_account");
    protected final By LOGINBUTTON = By.id("com.sahibinden:id/login_logout_action");


}
