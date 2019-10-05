package com.montecarlo;

import java.net.MalformedURLException;
import java.util.List;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class UIAutomation extends Basic {

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement>driver=capability();
		
		System.out.println("The driver is "+driver);
		
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		
		
		driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size();
	List<AndroidElement> list=driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)");
	
	
	  for(AndroidElement i:list)
	  {
		 System.out.println(i.getText());
		 
		 
		 
		 
	 }
		
        
        

		
	}

}
