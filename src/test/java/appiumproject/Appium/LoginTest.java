package appiumproject.Appium;

import java.net.MalformedURLException;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class LoginTest extends BaseClass{
	
	@Test
	public void AppiumTest() throws MalformedURLException, InterruptedException
	{
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='More']")).click();
		driver.findElement(AppiumBy.id("com.skillbox.dev:id/profileTv")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.id("com.skillbox.dev:id/etEmailId")).sendKeys("guptashivam1711@gmail.com");
		driver.findElement(AppiumBy.id("com.skillbox.dev:id/btnNext")).click();
	    Thread.sleep(5000);
		driver.findElement(AppiumBy.id("com.skillbox.dev:id/tvTryWithPassword")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.id("com.skillbox.dev:id/etPassword")).sendKeys("12345678");
		driver.findElement(AppiumBy.id("com.skillbox.dev:id/btnNext")).click();

		
		

		

		
		
		
		
		
		
		
		
	}
	

}
