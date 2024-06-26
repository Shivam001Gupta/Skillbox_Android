package appiumproject.Appium;
import java.net.MalformedURLException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumBy;

public class AddOnEventBookSliderTest extends BaseClass{
	
	@Test
	public void AppiumTest() throws MalformedURLException, InterruptedException
	{
		
		Thread.sleep(5000);			
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Search']")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.id("com.skillbox.dev:id/etSearchText")).click();
		driver.findElement(AppiumBy.id("com.skillbox.dev:id/etSearchText")).sendKeys("Add-on Test Slider");
		Thread.sleep(5000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Add-on Test Slider']")).click();		
		Thread.sleep(5000);													
		driver.findElement(AppiumBy.xpath("//android.widget.Button[@text='Book Now']")).click();
		Thread.sleep(2000);
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
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Select Delivery']")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Home Delivery']")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@resource-id=\"com.skillbox.dev:id/imgSelect\"]")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Select Topup']")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Wrist Band -Topup']")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Pay INR  690']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.skillbox.dev:id/etPinCode")).sendKeys("231001");
		driver.findElement(By.id("com.skillbox.dev:id/etCityadd")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='New Delhi']")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.skillbox.dev:id/shippingAddress")).sendKeys("Trimohani Ramlila Maidan ke samne");
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Pay INR  690']")).click();
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
