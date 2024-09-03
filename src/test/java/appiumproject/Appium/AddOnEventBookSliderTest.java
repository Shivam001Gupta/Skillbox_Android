package appiumproject.Appium;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumBy;
import skillbox.GenericUtilities.BaseClass;
import skillbox.ObjectRepository.AddonPage;
import skillbox.ObjectRepository.EventBookingPage;
import skillbox.ObjectRepository.EventDetailPage;
import skillbox.ObjectRepository.HomePage;
import skillbox.ObjectRepository.LoginPage;
import skillbox.ObjectRepository.PaymentPage;
import skillbox.ObjectRepository.SearchPage;
import skillbox.ObjectRepository.TicketPage;

public class AddOnEventBookSliderTest extends BaseClass{
	
	@Test
	public void AppiumTest() throws Throwable
	{
		
		Thread.sleep(5000);	
		
		HomePage hp = new HomePage(driver);
		hp.getSearchClk().click();
		Thread.sleep(5000);	
		
		SearchPage sp = new SearchPage(driver);
		sp.eventSearch(driver, "Add-on Test Slider");						
		Thread.sleep(10000);
		
		EventDetailPage edp = new EventDetailPage(driver);
		edp.getBookNowBtn().click();
		Thread.sleep(2000);
						
		TicketPage tp = new TicketPage(driver);
		tp.eventTicketSelect(driver);

		
		LoginPage lp = new LoginPage(driver);
		lp.loginUser(driver, "shivam@skillboxes.com", "12345678");
		
		tp.getProceedBtn().click();
		Thread.sleep(5000);
		
		AddonPage ap = new AddonPage(driver);
		ap.addonSelect(driver, "231001", "Trimohani Mirzapur");
		
		EventBookingPage ebp = new EventBookingPage(driver);
		ebp.pinAndPay(driver, "231001");
		
		PaymentPage pp = new PaymentPage(driver);
		pp.paymentSuccess(driver);
		
		String success = driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@resource-id='com.skillbox.dev:id/orderNumber'])[2]")).getText();
		System.out.print("Your Order No. is: ");
		Assert.assertTrue(success.contains("SB"));
		System.out.println(success);

				
	}
	

}
