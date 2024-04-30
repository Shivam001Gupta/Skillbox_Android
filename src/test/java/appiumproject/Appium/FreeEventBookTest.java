package appiumproject.Appium;
import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;


public class FreeEventBookTest extends BaseClass{
	
	@Test
	public void AppiumTest() throws MalformedURLException, InterruptedException
	{
		Thread.sleep(5000);	
		
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Search']")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.id("com.skillbox.dev:id/etSearchText")).click();
		driver.findElement(AppiumBy.id("com.skillbox.dev:id/etSearchText")).sendKeys("free event kt");
		Thread.sleep(5000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Free Event KT']")).click();		
		Thread.sleep(5000);													
		driver.findElement(AppiumBy.xpath("//android.widget.Button[@text='Book Now']")).click();
		Thread.sleep(5000);
		driver.findElement(AppiumBy.id("com.skillbox.dev:id/addTicket")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Proceed']")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.id("com.skillbox.dev:id/etEmailId")).sendKeys("guptashivam1711@gmail.com");
		driver.findElement(AppiumBy.id("com.skillbox.dev:id/btnNext")).click();
	    Thread.sleep(5000);
		driver.findElement(AppiumBy.id("com.skillbox.dev:id/tvTryWithPassword")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.id("com.skillbox.dev:id/etPassword")).sendKeys("12345678");
		driver.findElement(AppiumBy.id("com.skillbox.dev:id/btnNext")).click();
		Thread.sleep(5000);
//		driver.findElement(AppiumBy.id("com.skillbox.dev:id/imgCross")).click();
		Thread.sleep(5000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Proceed']")).click();
		Thread.sleep(5000);
		driver.findElement(AppiumBy.id("com.skillbox.dev:id/etPicode")).sendKeys("231001");
		Thread.sleep(2000);

			
		((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
				"elementId",  	((RemoteWebElement)driver.findElement(AppiumBy.xpath("//android.widget.RelativeLayout[@resource-id=\"com.skillbox.dev:id/checkInButton1\"]/android.widget.ImageView"))).getId(), 
		    "endX", 1035,
		    "endY", 2161
		));
		

		
		Thread.sleep(7000);
		

	    String success = driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@resource-id='com.skillbox.dev:id/orderNumber'])[2]")).getText();
	    System.out.print("Your Order No. is: ");
		Assert.assertTrue(success.contains("SB"));
		System.out.println(success);
		
		
    
	}
}
