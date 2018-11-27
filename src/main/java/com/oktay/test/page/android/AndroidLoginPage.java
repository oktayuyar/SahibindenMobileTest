package com.oktay.test.page.android;

import com.oktay.test.base.PageFactory;
import com.oktay.test.page.androidConstants.AndroidLoginPageConstants;
import com.oktay.test.page.contracts.IHomePage;
import com.oktay.test.page.contracts.ILoginPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.junit.Assert;

public class AndroidLoginPage extends AndroidLoginPageConstants implements ILoginPage {

    public AndroidLoginPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public ILoginPage login(String email, String password) {
        Assert.assertTrue("Sahibinden fotoğrafı görüntülenemedi!",
                driver.findElement(COMPANYIMAGEVİEW).isDisplayed());
        setText(EMAIL_TEXTBOX,email);
        setText(PASSWORD_TEXTBOX,password);
        clickElement(LOGINACTIONBUTTON);
        return PageFactory.getInstance().createPage(ILoginPage.class);
    }

    public IHomePage checkSuccessfulLogin() {
        Assert.assertTrue("Çıkış yap butonu görüntülenemedi!",
                getText(LOGOUTBUTTON).equalsIgnoreCase("ÇIKIŞ YAP"));
        return PageFactory.getInstance().createPage(IHomePage.class);
    }

    public IHomePage checkUnsuccessfulLogin() {
        Assert.assertTrue(getText(ERRORMESSAGE).contains("Kimliğiniz doğrulanamadı,"));
        return PageFactory.getInstance().createPage(IHomePage.class);
    }
}
