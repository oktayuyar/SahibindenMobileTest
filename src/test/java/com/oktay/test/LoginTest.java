package com.oktay.test;

import com.oktay.test.base.PageFactory;
import com.oktay.test.page.contracts.IHomePage;
import org.junit.Test;

import com.oktay.test.base.BaseTest;

public class LoginTest extends BaseTest {

    @Test
    public void successLogin(){
        createPage(IHomePage.class)
                .callLoginPage()
                .login("oktyuyar@gmail.com","123")
                .checkSuccessfulLogin();
    }

    @Test
    public void unsuccessLogin(){
        createPage(IHomePage.class)
                .callLoginPage()
                .login("oktyuyar@gmail.com","asd")
                .checkUnsuccessfulLogin();
    }

    private <T> T createPage(Class<T> pageType) {
        return PageFactory.getInstance().createPage(pageType);
    }

}
