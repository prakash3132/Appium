package com.montecarlo;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Basic {

	
	public static AndroidDriver<AndroidElement> capability() throws MalformedURLException {
		AndroidDriver<AndroidElement> driver;
		File f=new File("src");
		//File fs=new File(f,"ApiDemos-debug.apk");
		
		File fs=new File(f,"General-Store.apk");
		
	DesiredCapabilities cap=new DesiredCapabilities();
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "PrakashPixel2");
	//cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
	cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
	 driver= new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
	
     return driver;
	
	
	
		
		
	}

}
