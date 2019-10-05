package com.ecommerce;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.montecarlo.Basic;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ecommerce_tc_1 extends Basic {

	public static void main(String args[]) throws MalformedURLException
	{
	AndroidDriver<AndroidElement>driver=capability();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	//It will click the DropDown table 
	//driver.findElements(By.className("android.widget.Spinner")).get(0).click();
	
	// Now this line will scroll to the till desination
	//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"))").click();

	driver.findElement(By.id("android:id/text1")).click();
	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"))");
	driver.findElement(By.xpath("//*[@text='India']")).click();
	

	
	//driver.findElementByAndroidUIAutomator("new UiScrollable(newUiSelector()).scrollIntoView(new UiSelector().text(\"India\"));");
	
	//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"));").click();
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Enter name here']")).sendKeys("Praskash");
	
	driver.findElement(By.xpath("//*[@text='Female']")).click();
	driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
	
	//driver.findElement(By.xpath("//android.widget.EditText[@text='Enter name here']")).click();
	
	String result=	driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");
    

  
									
		
		
	}
}
