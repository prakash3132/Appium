import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import net.bytebuddy.asm.Advice.Enter;

public class browse extends baseChrome {

public static void main(String[] args) throws MalformedURLException, InterruptedException {
// TODO Auto-generated method stub
AndroidDriver<AndroidElement> driver=capabilities();

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

driver.get("http://facebook.com");

System.out.println("working fine as expected");

driver.findElement(By.id("m_login_email")).sendKeys("pkpatel020@gmail.com");
driver.findElement(By.id("m_login_password")).sendKeys("9770010350");

driver.findElement(By.name("login")).click();
driver.findElement(By.xpath("//*[@id='rootcontainer']/div/div/div/div/div[3]/div/div/div/a")).click();

JavascriptExecutor jse=(JavascriptExecutor) driver;
jse.executeScript("window.scrollBy(0,480)", "Top Stories");

   



}

}