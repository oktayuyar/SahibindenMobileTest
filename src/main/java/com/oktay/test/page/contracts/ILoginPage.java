package com.oktay.test.page.contracts;

/*
 *  Created by oktayuyar on 26.11.2018
 */
public interface ILoginPage {

    ILoginPage login(String email, String password);

    IHomePage checkSuccessfulLogin();

    IHomePage checkUnsuccessfulLogin();
}
