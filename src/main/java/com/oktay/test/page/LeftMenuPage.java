package com.oktay.test.page;

import com.oktay.test.contants.General_Constants;
import com.oktay.test.util.BasePageUtil;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class LeftMenuPage extends BasePageUtil implements General_Constants{

    public LeftMenuPage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    public void leftMenuSelectAnimal(){
        sleep(3);
        clickElement(NAVIGATE);
        sleep(3);
        clickElement(ANIMAL);
        sleep(3);
        selectAnimalWithContentText(getItems());
        sleep(100);

    }

}
