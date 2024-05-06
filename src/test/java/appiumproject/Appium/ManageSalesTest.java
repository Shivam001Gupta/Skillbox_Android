package appiumproject.Appium;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.KeyEvent;

public class ManageSalesTest extends BaseClass{
	
		
		
		@Test
		public void managesales() throws Throwable {
			
			
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
			Thread.sleep(10000);
			driver.findElement(AppiumBy.id("com.skillbox.dev:id/layoutManageSales")).click();
			Thread.sleep(7000);
			
			List<WebElement> eventName = driver.findElements(AppiumBy.xpath("//android.widget.TextView[@resource-id='com.skillbox.dev:id/tvEventName']"));
			
			 for(WebElement i : eventName)
			    	
			    {	    	
				   
				 	
					System.out.println(i.getText());
					Thread.sleep(1000);
			    }
			    		
			   
			Thread.sleep(5000);
			driver.findElement(AppiumBy.id("com.skillbox.dev:id/etSearchBox")).click();
			driver.findElement(AppiumBy.id("com.skillbox.dev:id/etSearchBox")).sendKeys("Skillbox Paid Event KT (INR 100 - 10000)");
		
			Thread.sleep(5000);
	        
			
			driver.findElement(AppiumBy.id("com.skillbox.dev:id/btnViewDetails")).click();
			Thread.sleep(10000);
			
			String event =  driver.findElement(AppiumBy.id("com.skillbox.dev:id/tvEventTitle")).getText();
			
			String sale =  driver.findElement(AppiumBy.id("com.skillbox.dev:id/tvTotalSales")).getText();
			
			System.out.print(event+"\n");
			Assert.assertTrue(sale.contains("Total"));
			System.out.println(sale);
			   
			    
			
			
		}
		
	
		
}
