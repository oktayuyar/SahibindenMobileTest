package com.oktay.test.base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class BaseTest {

    public AppiumDriver<MobileElement> driver;

    private boolean localAndroid = true;

    @Before
    public void setup() {

        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();

            if (localAndroid) {

                capabilities.setCapability("platformName", "Android");
                capabilities.setCapability("platform", Platform.ANDROID);
                capabilities.setCapability("deviceName", "Test");
                capabilities.setCapability("appPackage", "com.sahibinden");
                capabilities.setCapability("appActivity", "com.sahibinden.ui.supplementary.SplashScreenActivity");
                capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
                capabilities.setCapability(MobileCapabilityType.FULL_RESET, false);
                capabilities.setCapability("unicodeKeyboard", false);
                capabilities.setCapability("resetKeyboard", false);
                capabilities.setCapability("automationName", "uiautomator");
                driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

            } else {

                capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
                capabilities.setCapability("sendKeyStrategy", "setValue");
                capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
                capabilities.setCapability(MobileCapabilityType.FULL_RESET, false);
                capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.3");
                capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "testinium’s iPhone");
                capabilities.setCapability(MobileCapabilityType.UDID, "ec8fa4d8464e1bdf69f877bf66953167417e1ccb");
                capabilities.setCapability("useNewWDA", false);
                capabilities.setCapability("bundleId", "com.intertech.MyIntertech");
                driver = new IOSDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);

            }
            PageFactory.getInstance().setDriver(driver);

        } catch (Exception e) {
            System.err.println("Uygulama açılırken bir hata oluştu." + e.getMessage());
        }
    }

    @After
    public void tearDown() {
        driver.quit();
    }


}
