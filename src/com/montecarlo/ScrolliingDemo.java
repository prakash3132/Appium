package com.montecarlo;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ScrolliingDemo extends Basic {

	public static void main(String[] args) throws MalformedURLException {
		
		  AndroidDriver<AndroidElement>driver=capability();
		  
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  
		  driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
		  
		  //Scroll Untill the WebView option is not present
		  
		  driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));").click();;
		  
		

	}

}
