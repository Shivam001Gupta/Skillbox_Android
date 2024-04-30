package appiumproject.Appium;

import java.net.MalformedURLException;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class SignUpTest extends BaseClass{
	
	@Test
	public void AppiumTest() throws MalformedURLException, InterruptedException
	{
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='More']")).click();
		driver.findElement(AppiumBy.id("com.skillbox.dev:id/profileTv")).click();
		Thread.sleep(3000);
		driver.findElement(AppiumBy.id("com.skillbox.dev:id/btnSignUp")).click();
		Thread.sleep(5000);
		driver.findElement(AppiumBy.id("com.skillbox.dev:id/etFullName")).sendKeys("Test Profile");
		driver.findElement(AppiumBy.id("com.skillbox.dev:id/etPhoneNumber")).sendKeys("8790192817");
		String c = RandomStringUtils.randomAlphabetic(7);
		driver.findElement(AppiumBy.id("com.skillbox.dev:id/etEmailId")).sendKeys(c+"@gmail.com");
		driver.findElement(AppiumBy.id("com.skillbox.dev:id/etPassword")).sendKeys("12345678");
		driver.findElement(AppiumBy.id("com.skillbox.dev:id/btnNextSignUp")).click();
	    
		
			
		
	    
//	    String success = driver.findElement(AppiumBy.className("android.widget.Toast")).getText();
//	    
//		Assert.assertTrue(success.contains("successfully"));
//		System.out.println(success);
//	    

	    
		
		

		

		
		
		
		
		
		
		
		
	}
	

}
