package com.ecommerce;

import java.net.MalformedURLException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import com.montecarlo.Basic;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class ecommerce_tc_4 extends Basic {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		AndroidDriver<AndroidElement>	driver=capability();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		/*driver.findElements(By.className("android.widget.Spinner")).get(0).click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"))").click();
		
		*/driver.findElement(By.xpath("//android.widget.EditText[@text='Enter name here']")).sendKeys("Prakash");
		
		driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
		
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		
		driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Air Jordan 1 Mid SE\"))").click();
		//driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
		
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		
		Thread.sleep(5000);
		
		System.out.println("After thread before amount");
		
		
		
	String amount1=	driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(0).getText();

	
	
   double  am2= getAmount(amount1);
   
   System.out.println("The Product is return from method"+am2);

	//String amount2=	driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(1).getText();


//	double am1=getAmount(amount2);
	//System.out.println("The value return from the return method"+am1);


	String total=driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
	
	double total1=getAmount(total);
	
	System.out.println("The total amount return from return methis is,"+total1);
	
	
	
	driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
	
	Thread.sleep(7000);
	Set<String> str=driver.getContextHandles();
	
	for (String contextName : str) {
		System.out.println(contextName);
		
	}
	driver.context("WEBVIEW_com.androidsample.generalstore");
	Thread.sleep(10000);
	
	System.out.println("Last step is remaing ");
	try {
	//driver.get("https://www.google.com/");
	Thread.sleep(5000);
	driver.findElement(By.name("q")).sendKeys("Hello");
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}
	catch(Exception e)
	{
		System.out.println("Not found "+e);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}

	}
	
	public static double getAmount(String amount1)
	{
		amount1=amount1.substring(1);

		double convertedamount=Double.parseDouble(amount1);
		
		return convertedamount;
		
	}

}
