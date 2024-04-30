package appiumproject.Appium;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;

public class EventListTest extends BaseClass{
	
		
		
		@Test(priority = 1)
		public void category() throws Throwable {
			
			
			Thread.sleep(5000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Events']")).click();
			Thread.sleep(2000);			
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.skillbox.dev:id/dayItem\" and @text=\"Music Events\"]")).click();
			Thread.sleep(5000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.skillbox.dev:id/dayItem\" and @text=\"Music Events\"]")).click();
			Thread.sleep(5000);
		
			
		}
		
		@Test(priority = 2)
		public void filter() throws Throwable {
			
			
			driver.findElement(AppiumBy.id("com.skillbox.dev:id/ll_Filter")).click();
			Thread.sleep(2000);			
			driver.findElement(AppiumBy.id("com.skillbox.dev:id/tvSort_By")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Price: High - Low']")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.id("com.skillbox.dev:id/tvFilter")).click();
			Thread.sleep(5000);
			driver.findElement(AppiumBy.id("com.skillbox.dev:id/ll_Filter")).click();
			Thread.sleep(2000);			
			driver.findElement(AppiumBy.id("com.skillbox.dev:id/tvDay")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Today']")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.id("com.skillbox.dev:id/tvFilter")).click();
			Thread.sleep(5000);
			driver.findElement(AppiumBy.id("com.skillbox.dev:id/ll_Filter")).click();
			Thread.sleep(2000);			
			driver.findElement(AppiumBy.id("com.skillbox.dev:id/tvSearchbyyourcity")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.id("com.skillbox.dev:id/etSearchBox1")).sendKeys("New Delhi");
			Thread.sleep(2000);
			driver.findElement(AppiumBy.id("com.skillbox.dev:id/textName")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.id("com.skillbox.dev:id/tvFilter")).click();
			Thread.sleep(5000);
			driver.findElement(AppiumBy.id("com.skillbox.dev:id/ll_Filter")).click();
			Thread.sleep(2000);			
			driver.findElement(AppiumBy.id("com.skillbox.dev:id/tvPrice")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Free']")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.id("com.skillbox.dev:id/tvFilter")).click();
			Thread.sleep(5000);
			driver.findElement(AppiumBy.id("com.skillbox.dev:id/ll_Filter")).click();
			Thread.sleep(2000);			
			driver.findElement(AppiumBy.id("com.skillbox.dev:id/tvMoreFilters")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Past Events']")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.id("com.skillbox.dev:id/tvFilter")).click();
			Thread.sleep(5000);
			driver.findElement(AppiumBy.id("com.skillbox.dev:id/ll_Filter")).click();
			Thread.sleep(2000);			
			driver.findElement(AppiumBy.id("com.skillbox.dev:id/reset")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.id("com.skillbox.dev:id/tvFilter")).click();
			Thread.sleep(5000);
			
		
		}
		
				
		@Test(priority = 3)
		public void eventListing() throws Throwable {
			
			int i;
			for(i=0; i<=30;i++)
		    	
		    {	  
				// Java
				((JavascriptExecutor) driver).executeScript("mobile: flingGesture", ImmutableMap.of(
						"elementId",  	((RemoteWebElement)driver.findElement(AppiumBy.id("com.skillbox.dev:id/event_name"))).getId(), 
				    "direction", "down",
				    "speed", 750
				));
				
				Thread.sleep(1000);    
				System.out.print(driver.findElement(AppiumBy.id("com.skillbox.dev:id/event_name")).getText());
		    {
		   }} 
			
		}
		
}
