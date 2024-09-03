package appiumproject.Appium;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumBy;
import skillbox.GenericUtilities.BaseClass;
import skillbox.ObjectRepository.EventBookingPage;
import skillbox.ObjectRepository.EventDetailPage;
import skillbox.ObjectRepository.HomePage;
import skillbox.ObjectRepository.LoginPage;
import skillbox.ObjectRepository.MorePage;
import skillbox.ObjectRepository.PaymentPage;
import skillbox.ObjectRepository.ScannerPage;
import skillbox.ObjectRepository.SearchPage;
import skillbox.ObjectRepository.TicketPage;

public class PaidEventBookTest extends BaseClass{
	
	@Test(priority = 0)
	public void eventbook() throws Throwable
	{
		
		Thread.sleep(5000);	

		
		HomePage hp = new HomePage(driver);
		hp.getSearchClk().click();
		Thread.sleep(5000);	
		
		SearchPage sp = new SearchPage(driver);
		sp.eventSearch(driver, "Skillbox Paid Event kt");						
		Thread.sleep(10000);
		
		EventDetailPage edp = new EventDetailPage(driver);
		edp.getBookNowBtn().click();
		Thread.sleep(2000);
						
		TicketPage tp = new TicketPage(driver);
		tp.eventTicketSelectWithDonation(driver);

		
		LoginPage lp = new LoginPage(driver);
		lp.loginUser(driver, "shivam@skillboxes.com", "12345678");
		
		tp.getProceedBtn().click();
		Thread.sleep(5000);
	
		EventBookingPage ebp = new EventBookingPage(driver);
		ebp.couponApply(driver, "COUPONLPP");
		ebp.pinAndPay(driver, "231001");
		
		
		PaymentPage pp = new PaymentPage(driver);
		pp.paymentSuccess(driver);
		 					
	
				
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
		
		HomePage hp = new HomePage(driver);
		hp.getMoreClk().click();
		Thread.sleep(2000);
		
		MorePage mp = new MorePage(driver);
		mp.getScannerClk().click();
		Thread.sleep(5000);
		
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.skillbox.dev:id/eventName\" and @text=\"Skillbox Paid Event KT (INR 100 - 10000)\"]")).click();
		Thread.sleep(2000);
		
		ScannerPage sp = new ScannerPage(driver);
		sp.scanCode(driver, success);
		
	
		
		
	}
	

}
