package appiumproject.Appium;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import skillbox.GenericUtilities.BaseClass;
import skillbox.ObjectRepository.EventListingPage;
import skillbox.ObjectRepository.HomePage;

public class EventListTest extends BaseClass{
	
		
		
		@Test(priority = 1)
		public void category() throws Throwable {
			
			Thread.sleep(5000);	
			HomePage hp = new HomePage(driver);
			hp.getEvenClk().click();
			Thread.sleep(2000);	
			
			EventListingPage elp = new EventListingPage(driver);
			elp.getMusicEventClk().click();
			Thread.sleep(5000);
			elp.getMusicEventClk().click();
			Thread.sleep(5000);
		
		}
		
		@Test(priority = 2)
		public void filter() throws Throwable {
			
			EventListingPage elp = new EventListingPage(driver);
			
			// Sort By Filter
			elp.sortByFilter(driver);
			System.out.println("Sort By Filter Working");
	
			// Day By Filter
			elp.dayByFilter(driver);
			System.out.println("Day By Filter Working");
			
			// Filter By City
			elp.filterByCity(driver, "New Delhi");
			System.out.println("Cit By Filter Working");
			
			// Filter By Price
			elp.filterByPrice(driver);
			System.out.println("Price By Filter Working");
			
			// More Filter
			elp.moreFilter(driver);
			System.out.println("More Filter Working");
			
			
			
			
			
			
			
//			driver.findElement(AppiumBy.id("com.skillbox.dev:id/ll_Filter")).click();
//			Thread.sleep(2000);			
//			driver.findElement(AppiumBy.id("com.skillbox.dev:id/tvSort_By")).click();
//			Thread.sleep(2000);
//			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Price: High - Low']")).click();
//			Thread.sleep(2000);
//			driver.findElement(AppiumBy.id("com.skillbox.dev:id/tvFilter")).click();
//			Thread.sleep(5000);
//			driver.findElement(AppiumBy.id("com.skillbox.dev:id/ll_Filter")).click();
//			Thread.sleep(2000);			
//			driver.findElement(AppiumBy.id("com.skillbox.dev:id/tvDay")).click();
//			Thread.sleep(2000);
//			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Today']")).click();
//			Thread.sleep(2000);
//			driver.findElement(AppiumBy.id("com.skillbox.dev:id/tvFilter")).click();
//			Thread.sleep(5000);
//			driver.findElement(AppiumBy.id("com.skillbox.dev:id/ll_Filter")).click();
//			Thread.sleep(2000);			
//			driver.findElement(AppiumBy.id("com.skillbox.dev:id/tvSearchbyyourcity")).click();
//			Thread.sleep(2000);
//			driver.findElement(AppiumBy.id("com.skillbox.dev:id/etSearchBox1")).sendKeys("New Delhi");
//			Thread.sleep(2000);
//			driver.findElement(AppiumBy.id("com.skillbox.dev:id/textName")).click();
//			Thread.sleep(2000);
//			driver.findElement(AppiumBy.id("com.skillbox.dev:id/tvFilter")).click();
//			Thread.sleep(5000);
//			driver.findElement(AppiumBy.id("com.skillbox.dev:id/ll_Filter")).click();
//			Thread.sleep(2000);			
//			driver.findElement(AppiumBy.id("com.skillbox.dev:id/tvPrice")).click();
//			Thread.sleep(2000);
//			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Free']")).click();
//			Thread.sleep(2000);
//			driver.findElement(AppiumBy.id("com.skillbox.dev:id/tvFilter")).click();
//			Thread.sleep(5000);
//			driver.findElement(AppiumBy.id("com.skillbox.dev:id/ll_Filter")).click();
//			Thread.sleep(2000);			
//			driver.findElement(AppiumBy.id("com.skillbox.dev:id/tvMoreFilters")).click();
//			Thread.sleep(2000);
//			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Past Events']")).click();
//			Thread.sleep(2000);
//			driver.findElement(AppiumBy.id("com.skillbox.dev:id/tvFilter")).click();
//			Thread.sleep(5000);
//			driver.findElement(AppiumBy.id("com.skillbox.dev:id/ll_Filter")).click();
//			Thread.sleep(2000);			
//			driver.findElement(AppiumBy.id("com.skillbox.dev:id/reset")).click();
//			Thread.sleep(2000);
//			driver.findElement(AppiumBy.id("com.skillbox.dev:id/tvFilter")).click();
//			Thread.sleep(5000);
			
		
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
