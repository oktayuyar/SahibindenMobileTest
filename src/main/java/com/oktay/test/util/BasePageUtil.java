package com.oktay.test.util;

import com.oktay.test.contants.General_Constants;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePageUtil implements General_Constants{

    protected AndroidDriver <MobileElement> driver;

    public BasePageUtil(AndroidDriver<MobileElement> driver){
        this.driver=driver;
    }

    public void clickElement(By selector){
        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.presenceOfElementLocated(selector)).click();
        //driver.findElement((selector)).click();
    }

    public void setText(By selector,String text){

        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.presenceOfElementLocated(selector)).sendKeys(text);
        // driver.findElement(By.id(id)).sendKeys(text);
        try {
            driver.hideKeyboard();
        }catch (Exception e){

        }
    }

    // ekranı aşağıdan yukarı kaydırmak için
    public void swipeUp(){
        // telefonun en boy oranını getiriyor
        Dimension d= driver.manage().window().getSize();
        int height = d.getHeight();
        int width = d.getWidth();

        driver.swipe(width/4, (height*90)/100, width/4,(height*10)/100,1000);
    }

    // uygulamada farklı bir tıklama yapmak için uzun tıklama gibi, elementi sağdan sola taşımak gibi
    public void tap(){
        TouchAction action = new TouchAction(driver);
        // x 100 y 200 lokasyonuna tıklıyor
        action.tap(100,200).perform();
        driver.navigate().back(); // geri tuşuna basmış gibi davranır

    }

    public void clickEnter(){
        driver.pressKeyCode(AndroidKeyCode.ENTER);
    }

    public void sleep(int second){
        try {
            Thread.sleep(second*1000);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }

    public List<MobileElement> getItems(){
        List<MobileElement> items=driver.findElements(ITEMS);
        return items;
    }


    public void selectAnimalWithContentText(List<MobileElement> items){
        for (MobileElement mobileElement: items) {
            if(mobileElement.getText().contains(TEXT)){
                mobileElement.click();
                break;
            }
        }

    }
}
