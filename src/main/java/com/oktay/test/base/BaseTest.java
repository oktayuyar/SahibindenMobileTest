package com.oktay.test.base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

    public AndroidDriver<MobileElement> driver;

    @Before
    public void setup() throws MalformedURLException{
        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("platform", Platform.ANDROID);
        capabilities.setCapability("deviceName","Test");
        capabilities.setCapability("appPackage","com.sahibinden");
        capabilities.setCapability("appActivity","com.sahibinden.ui.supplementary.SplashScreenActivity");
        //capabilities.setCapability("automationName","uiautomator2");
        //capabilities.setCapability("udid","device id si terminalden adb devices ile buluyorsun");

        driver= new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
    }

    @After
    public void close(){
        driver.quit();
    }

}
