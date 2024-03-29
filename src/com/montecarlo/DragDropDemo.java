package com.montecarlo;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import static io.appium.java_client.touch.offset.ElementOption.element;


public class DragDropDemo extends Basic {

	public static void main(String[] args) throws MalformedURLException {

                AndroidDriver <AndroidElement>driver=capability();
                
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                
                driver.findElementByAndroidUIAutomator("text(\"Views\")").click(); 
                
                driver.findElementByAndroidUIAutomator("text(\"Drag and Drop\")").click();    
                
               WebElement src =driver.findElements(By.className("android.view.View")).get(0);
               WebElement destination=driver.findElements(By.className("android.view.View")).get(1);
                
                
                TouchAction t=new TouchAction(driver);
                
                t.longPress(element(src)).moveTo(element(destination)).release().perform();           
                
                
	}

}
