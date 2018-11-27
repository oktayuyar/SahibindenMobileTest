package com.oktay.test.page.android;

import com.oktay.test.base.PageFactory;
import com.oktay.test.page.androidConstants.AndroidHomePageConstants;
import com.oktay.test.page.contracts.IHomePage;
import com.oktay.test.page.contracts.ILoginPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.junit.Assert;

public class AndroidHomePage extends AndroidHomePageConstants implements IHomePage {

    public AndroidHomePage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public ILoginPage callLoginPage() {
        Assert.assertTrue("Kelime veya ilan No. ile ara alanı görüntülenemedi!",
                getText(SEARCHTEXTVIEW).equalsIgnoreCase("Kelime veya ilan No. ile ara"));
        clickElement(ACCOUNTBUTTON);
        Assert.assertTrue(getText(LOGINBUTTON).equalsIgnoreCase("ÜYE OL / GİRİŞ YAP"));
        clickElement(LOGINBUTTON);
        return PageFactory.getInstance().createPage(ILoginPage.class);
    }
}
