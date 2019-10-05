package com.montecarlo;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

//import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Browser {

static	AndroidDriver<AndroidElement> driver;
	public static void main(String args[]) throws MalformedURLException
	{
		
		DesiredCapabilities cap=new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		
	     new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		 
	    // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.get("http://google.com");
		
		
		
		
	}


	}


