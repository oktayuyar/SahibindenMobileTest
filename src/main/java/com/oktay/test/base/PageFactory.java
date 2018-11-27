package com.oktay.test.base;

import com.oktay.test.page.android.AndroidHomePage;
import com.oktay.test.page.android.AndroidLoginPage;
import com.oktay.test.page.contracts.IHomePage;
import com.oktay.test.page.contracts.ILoginPage;
import com.oktay.test.page.ios.IOSHomePage;
import com.oktay.test.page.ios.IOSLoginPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

/*
 *  Created by oktayuyar on 26.11.2018
 */
public class PageFactory {
	
	private static PageFactory instance = null;
	private ThreadLocal<AppiumDriver<MobileElement>> driver = new ThreadLocal<AppiumDriver<MobileElement>>();

	private PageFactory() {
		
	}
	
	@SuppressWarnings("unchecked")
	public <T> T createPage(Class<T> pageType)
	{
		AppiumDriver<MobileElement> appiumDriver = driver.get();
		
		if (appiumDriver instanceof AndroidDriver)
		{
			AndroidDriver<MobileElement> androidDriver= (AndroidDriver<MobileElement>) appiumDriver;

			if(pageType.isAssignableFrom(IHomePage.class))
			{
				return (T) new AndroidHomePage(androidDriver);
			}
			else if(pageType.isAssignableFrom(ILoginPage.class))
			{
				return (T) new AndroidLoginPage(androidDriver);
			}
		}
		else
		{
			IOSDriver<MobileElement> iosDriver= (IOSDriver<MobileElement>) appiumDriver;

			if(pageType.isAssignableFrom(IHomePage.class))
			{
				return (T) new IOSHomePage(iosDriver);
			}
			else if(pageType.isAssignableFrom(ILoginPage.class))
			{
				return (T) new IOSLoginPage(iosDriver);
			}
		}
		return null;
	}
	
	public void setDriver(AppiumDriver<MobileElement> driver) {

		this.driver.set(driver);
	}
	
	public static PageFactory getInstance() 
	{
		if (instance == null) {
			instance = new PageFactory();
		}
		return instance;
	}
}
