package com.montecarlo;

import static java.time.Duration.ofSeconds;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;



public class Swaipedemo extends Basic {

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement>driver=capability();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Date Widgets']")).click();
		driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
		driver.findElement(By.xpath("//*[@content-desc='9']")).click();
		
		TouchAction t=new TouchAction(driver);
	
	WebElement	first=driver.findElement(By.xpath("//*[@content-desc='15']"));
	WebElement	second=driver.findElement(By.xpath("//*[@content-desc='45']"));
	 t.longPress(longPressOptions().withElement(element(first)).withDuration(ofSeconds(3))).moveTo(element(second)).release().perform();
			
			
		
		
		

	}

}
