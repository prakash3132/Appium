package com.montecarlo;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Checking {

	public static void main(String[] args) throws MalformedURLException {
		
		System.out.println("Line 1");
		File f=new File("src");
		File fs=new File(f,"ApiDemos-debug.apk");
		
	DesiredCapabilities cap=new DesiredCapabilities();
	System.out.println("Line 2");
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "PrakashPixel2");
	System.out.println("Line 3");
	cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
	System.out.println("Line 4");
	
		AndroidDriver<AndroidElement> driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		
	

	}

}
