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

public class PaidEventBookTest extends BaseClass{
	
	@Test(priority = 0)
	public void eventbook() throws MalformedURLException, InterruptedException
	{
		
		Thread.sleep(5000);	
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Events']")).click();
		Thread.sleep(5000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Skillbox Paid Event KT (INR 100 - 10000)']")).click();
				
		Thread.sleep(10000);
//		wait.until(ExpectedConditions.attributeContains(driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Filters']")), "text", "Filters"));
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Filters']")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Livestream Pass']")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.id("com.skillbox.dev:id/addTicket")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='amount']")).sendKeys("100");
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Proceed']")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.id("com.skillbox.dev:id/etEmailId")).sendKeys("shivam@skillboxes.com");
		driver.findElement(AppiumBy.id("com.skillbox.dev:id/btnNext")).click();
	    Thread.sleep(5000);
		driver.findElement(AppiumBy.id("com.skillbox.dev:id/tvTryWithPassword")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.id("com.skillbox.dev:id/etPassword")).sendKeys("12345678");
		driver.findElement(AppiumBy.id("com.skillbox.dev:id/btnNext")).click();
		Thread.sleep(5000);
//		driver.findElement(AppiumBy.id("com.skillbox.dev:id/imgCross")).click();
//		Thread.sleep(5000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Proceed']")).click();
		Thread.sleep(5000);
		driver.findElement(AppiumBy.id("com.skillbox.dev:id/etPicode")).sendKeys("231001");
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Have a Promo Code ?']")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='Enter Coupon Code']")).sendKeys("COUPONLPP");
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='APPLY']")).click();
		Thread.sleep(5000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='YAY!']")).click();
		Thread.sleep(5000);
		
		driver.findElement(AppiumBy.id("com.skillbox.dev:id/tvChange")).click();
//		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id='com.skillbox.dev:id/tvChange']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15000));
		wait.until(ExpectedConditions.attributeContains(driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Payment Options']")), "text", "Payment Options"));
		Thread.sleep(7000);
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"success@razorpay\"))"));
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='success@razorpay']")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.Button[@text='PAY VIA UPI']")).click();
		Thread.sleep(15000);
			
	    
		
	
				
	}
	
	
	
	@Test(priority = 1)
	public void scancode() throws Throwable {
		
		String success = driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@resource-id='com.skillbox.dev:id/orderNumber'])[2]")).getText();
		System.out.print("Your Order No. is: ");
		Assert.assertTrue(success.contains("SB"));
		System.out.println(success);
		
		
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='More']")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.id("com.skillbox.dev:id/scannerTextView")).click();
		Thread.sleep(5000);
		
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.skillbox.dev:id/eventName\" and @text=\"Skillbox Paid Event KT (INR 100 - 10000)\"]")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.id("com.skillbox.dev:id/scanNowBtn")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")).click();
		Thread.sleep(2000);
		
		driver.findElement(AppiumBy.id("com.skillbox.dev:id/manualQRCodeET")).sendKeys(success);
		Thread.sleep(2000);
		driver.findElement(AppiumBy.id("com.skillbox.dev:id/scanBtn")).click();
		Thread.sleep(5000);
		driver.findElement(AppiumBy.id("com.skillbox.dev:id/addMember")).click();
		
		Thread.sleep(2000);
		
		((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
				"elementId",  	((RemoteWebElement)driver.findElement(AppiumBy.xpath("//android.widget.RelativeLayout[@resource-id=\"com.skillbox.dev:id/checkInButton\"]/android.widget.ImageView"))).getId(), 
		    "endX", 1035,
		    "endY", 2161
		));
		

		
		Thread.sleep(7000);
		
		
		
		
	}
	

}
