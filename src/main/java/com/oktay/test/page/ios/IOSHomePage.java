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
public class IOSHomePage extends BasePageUtil implements IHomePage {

    public IOSHomePage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public ILoginPage callLoginPage() {

        return PageFactory.getInstance().createPage(ILoginPage.class);
    }
}
