package com.ecommerce;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.montecarlo.Basic;
import com.sun.java_cup.internal.runtime.Symbol;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Register extends Basic {

	@Test
	public static void test() throws MalformedURLException, InterruptedException {
		
	
		AndroidDriver<AndroidElement>driver=capability();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		/*driver.findElements(By.className("android.widget.Spinner")).get(0).click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"))").click();
		*/
		driver.findElement(By.id("android:id/text1")).click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"))");
		driver.findElement(By.xpath("//*[@text='India']")).click();
		
		
		driver.findElement(By.xpath("//android.widget.EditText[@text='Enter name here']")).sendKeys("Praskash");
		
		driver.findElement(By.xpath("//*[@text='Female']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		
		
		/**************************************************/
		
		//Some times it's working but some time not getting element
	//	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Jordan 6 Rings\"))");
		

		
	//	driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Jordan 6 Rings\"))"));
		
	//	driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();

	//     driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
	//     driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		System.out.println("Scrolll don");
		
		Thread.sleep(5000);
		 driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(new UiSelector().textMatches(\"Jordan 6 Rings\").instance(0))"));	
	int size=	driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();
	
	System.out.println("Thre size of the product is ,"+size);
	
	for(int i=0;i<size;i++)
	{
	String text=driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
	System.out.println("The text is for product "+text);
	
	if(text.equalsIgnoreCase("Jordan 6 Rings"))
	{
		System.out.println("inside the If block");
		
		driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(i).click();
	    break;
	}
	
	
	}
	     
	driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();  
	
	Thread.sleep(5000);
	
           String name=	driver.findElement(By.id("com.androidsample.generalstore:id/productName")).getText();
           System.out.println("The assert block"+name);

      Assert.assertEquals("Jordan 6 Rings", name);
      System.out.println("All Steps has been paas ");
	    driver.closeApp();



	     
	 /*    WebDriverWait wait=new WebDriverWait(driver, 30);
	     wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart"))));*/

	    
	    
	   
	/*Thread.sleep(4000);

	int count=driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).size();

	double sum=0;

	for(int i=0;i<count;i++)

	{

	String amount1= driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(i).getText();

	

	//sum=sum+amount;//280.97+116.97

	}

	System.out.println(sum+"sum of products");



	String total=driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();



	total= total.substring(1);

	double totalValue=Double.parseDouble(total);

	System.out.println(totalValue+"Total value of products");

	 
*/


	}

}
