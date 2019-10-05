package com.montecarlo;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Basics extends Basic {

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver =capability();
		
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		//driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click();
		
		

	
		System.out.println("Programme is loaded fine as expected");
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='3. Preference dependencies']")).click();
		
		driver.findElement(By.id("android:id/checkbox")).click();
	//	driver.findElement(By.id("WiFi settings")).click();
		
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		
		driver.findElement(By.className("android.widget.EditText")).sendKeys("9770010350");
		
      //  driver.findElement(By.id("android:id/button1")).click();
        
        driver.findElements(By.className("android.widget.Button")).get(1).click();
        
        
        
	}

}
