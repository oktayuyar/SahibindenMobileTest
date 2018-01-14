package com.oktay.test.contants;

import org.openqa.selenium.By;

public interface General_Constants {


    By ACCOUNTBUTTON= By.id("com.sahibinden:id/action_account");
    By LOGINBUTTON = By.id("com.sahibinden:id/action_login");
    By EMAIL_TEXTBOX = By.id("com.sahibinden:id/myaccount_activity_login_username_edittext");
    By PASSWORD_TEXTBOX = By.id("com.sahibinden:id/myaccount_activity_login_password_edittext");
    By LOGINACTIONBUTTON = By.id("com.sahibinden:id/myaccount_activity_login_login_action_button");
    By NAVIGATE = By.xpath("//android.widget.ImageButton[@content-desc='Gezinti bölmesini aç']");
    By ANIMAL =By.xpath("//android.widget.TextView[@text='Hayvanlar Alemi']");
    By ITEMS = By.id("com.sahibinden:id/util_primary_text");
    String TEXT= "Böcekler";

}
