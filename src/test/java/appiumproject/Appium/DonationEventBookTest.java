package appiumproject.Appium;

import java.net.MalformedURLException;
import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class DonationEventBookTest extends BaseClass{
	
	@Test
	public void AppiumTest() throws MalformedURLException, InterruptedException
	{
		
		Thread.sleep(5000);			
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Search']")).click();
		Thread.sleep(5000);
		driver.findElement(AppiumBy.id("com.skillbox.dev:id/etSearchText")).click();
		driver.findElement(AppiumBy.id("com.skillbox.dev:id/etSearchText")).sendKeys("Skillbox Donation Event KT ");
		Thread.sleep(5000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Skillbox Donation Event KT']")).click();		
		Thread.sleep(5000);													
		driver.findElement(AppiumBy.xpath("//android.widget.Button[@text='Donate']")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.id("com.skillbox.dev:id/donationAmountET")).sendKeys("400");
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
		
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Change ']")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.attributeContains(driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Payment Options']")), "text", "Payment Options"));
		Thread.sleep(7000);
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"success@razorpay\"))"));
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='success@razorpay']")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.Button[@text='PAY VIA UPI']")).click();
		Thread.sleep(15000);
		
		
	    
		String success = driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@resource-id='com.skillbox.dev:id/orderNumber'])[2]")).getText();
		System.out.print("Your Order No. is: ");
		Assert.assertTrue(success.contains("SB"));
		System.out.println(success);
		

		
				
	}
	

}
