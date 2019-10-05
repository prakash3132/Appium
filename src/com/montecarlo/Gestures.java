package com.montecarlo;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import static java.time.Duration.ofSeconds;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
//import io.appium.java_client.touch.TapOptions;

public class Gestures extends Basic {

	public static void main(String[] args) throws MalformedURLException {
		
		
		AndroidDriver<AndroidElement> driver=capability();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		 driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
		 
		 TouchAction t=new TouchAction<>(driver);
		 
		 WebElement	expandlist=driver.findElement(By.xpath("//android.widget.TextView[@text='Expandable Lists']"));
		 
	
		 t.tap(tapOptions().withElement(element(expandlist))).perform();
		 
		 driver.findElement(By.xpath("//android.widget.TextView[@text='1. Custom Adapter']")).click();
		 
		WebElement pn= driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
		 
		 t.longPress(longPressOptions().withElement(element(pn)).withDuration(ofSeconds(3))).release().perform();
		driver.findElement(By.id("android:id/title")).isDisplayed();
		
		 
		
		 
		 
		

	}

}
