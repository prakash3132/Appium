package com.paytm;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class PaytmApp {
	
	
	public static void main(String args[]) throws MalformedURLException
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "25");
		cap.setCapability("appPackage", "net.one97.paytm");
		//cap.setCapability("appActivity","com.android.packageinstaller.permission.ui.GrantPermissionsActivity");
		
		cap.setCapability("appActivity","net.one97.paytm.oauth.activity.OAuthMainActivity");
		new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
		
		
		
		
	/*	DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		//caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "25");
		caps.setCapability("appPackage", "net.one97.paytm");
		caps.setCapability("appActivity", "net.one97.paytm.oauth.activity.OAuthMainActivity");
		caps.setCapability("noReset", "true");
		new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		*/
		
	}
	

}
