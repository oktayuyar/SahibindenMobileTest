package com.oktay.test.page.ios;

import com.oktay.test.base.PageFactory;
import com.oktay.test.page.contracts.IHomePage;
import com.oktay.test.page.contracts.ILoginPage;
import com.oktay.test.util.BasePageUtil;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

/*
 *  Created by oktayuyar on 26.11.2018
 */
public class IOSLoginPage extends BasePageUtil implements ILoginPage {

    public IOSLoginPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public ILoginPage login(String email, String password) {

        return PageFactory.getInstance().createPage(ILoginPage.class);
    }

    public IHomePage checkSuccessfulLogin() {

        return PageFactory.getInstance().createPage(IHomePage.class);
    }

    public IHomePage checkUnsuccessfulLogin() {

        return PageFactory.getInstance().createPage(IHomePage.class);
    }
}
