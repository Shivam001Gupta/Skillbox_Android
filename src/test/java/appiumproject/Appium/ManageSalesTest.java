package appiumproject.Appium;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.KeyEvent;
import skillbox.GenericUtilities.BaseClass;
import skillbox.ObjectRepository.HomePage;
import skillbox.ObjectRepository.LoginPage;
import skillbox.ObjectRepository.ManageSalesPage;
import skillbox.ObjectRepository.MorePage;

@SuppressWarnings("unused")
public class ManageSalesTest extends BaseClass{
			
	@Test
	public void managesales() throws Throwable {
		
		HomePage hp = new HomePage(driver);
		hp.getMoreClk().click();
		
		MorePage mp = new MorePage(driver);
		
		mp.getLoginSignupClk().click();
		Thread.sleep(10000);
		
		LoginPage lp = new LoginPage(driver);
		lp.loginUser(driver, "guptashivam1711@gmail.com", "12345678");
		
		hp.getMoreClk().click();
		Thread.sleep(5000);
	
		mp.getManagesalesClk().click();
		
		Thread.sleep(10000);
		
		ManageSalesPage msp = new ManageSalesPage(driver);
		msp.manageSales(driver, "Skillbox Paid Event kt");
	
		
		String event =  driver.findElement(AppiumBy.id("com.skillbox.dev:id/tvEventTitle")).getText();
		
		String sale =  driver.findElement(AppiumBy.id("com.skillbox.dev:id/tvTotalSales")).getText();
		
		System.out.print(event+"\n");
		Assert.assertTrue(sale.contains("Total"));
		System.out.println(sale);
		   
		    
		
		
	}
		
	
		
}
