package com.oktay.test.test;

import com.oktay.test.page.HomePage;
import com.oktay.test.page.LeftMenuPage;
import org.junit.Assert;
import org.junit.Test;

import com.oktay.test.base.BaseTest;

public class LoginTest extends BaseTest{

    @Test
    public void successLogin(){
        new HomePage(driver).callLoginPage().login("oktyuyar@gmail.com","123");
    }

    @Test
    public void failLogin(){
        new HomePage(driver).callLoginPage().login("oktyuyar@gmail.com","asd");
        Assert.assertTrue("Hata!",driver.getPageSource().contains("Kimliğiniz doğrulanamadı, kontrol edip tekrar deneyin"));
    }

    @Test
    public void  leftMenuSelectAnimalTest(){
        new LeftMenuPage(driver).leftMenuSelectAnimal();
    }

    @Test
    public void  homePageSwipeTest(){
        new HomePage(driver).swipeTest();
    }
}
