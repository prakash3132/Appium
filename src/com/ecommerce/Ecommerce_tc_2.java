package com.ecommerce;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.montecarlo.Basic;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Ecommerce_tc_2 extends Basic{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
	AndroidDriver<AndroidElement>	driver=capability();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//android.widget.EditText[@text='Enter name here']")).sendKeys("Prakash");
	
	driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
	
	driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
	
	driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
	//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Air Jordan 1 Mid SE\"))").click();
	driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
	
	driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
	
	Thread.sleep(5000);
	
	System.out.println("After thread before amount");
	
	
	
String amount1=	driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(0).getText();

System.out.println(amount1);
 
amount1=amount1.substring(1);

double num1=Double.parseDouble(amount1);

Thread.sleep(5000);
String amount2=	driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(1).getText();

amount2=amount2.substring(1);

System.out.println(amount2);

double num2=Double.parseDouble(amount2);

double d=num2+num1;

System.out.println("The sum of the product is ,"+(num1+num2));

Thread.sleep(5000);

String total=driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();

total=total.substring(1);

   double sumtotal=Double.parseDouble(total);
   
   Assert.assertEquals(sumtotal, d);
if (sumtotal==d) {
	
	System.out.println("The total purchese amount is,"+sumtotal);
	
}
    
    driver.closeApp();
		

	}

}
