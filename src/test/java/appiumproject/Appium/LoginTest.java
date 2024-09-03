package appiumproject.Appium;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import skillbox.GenericUtilities.BaseClass;
import skillbox.ObjectRepository.HomePage;
import skillbox.ObjectRepository.LoginPage;
import skillbox.ObjectRepository.MorePage;
import skillbox.ObjectRepository.SettingPage;

public class LoginTest extends BaseClass{
	
	@Test
	public void loginLogout() throws Throwable
	{
		HomePage hp = new HomePage(driver);
		hp.getMoreClk().click();
		
		MorePage mp = new MorePage(driver);
		
		mp.getLoginSignupClk().click();
		Thread.sleep(10000);
		
		LoginPage lp = new LoginPage(driver);
		lp.loginUser(driver, "guptashivam1711@gmail.com", "12345678");
		
		hp.getMoreClk().click();
		Thread.sleep(2000);
		mp.getSettingClk().click();
		
		SettingPage sp = new SettingPage(driver);
		sp.getLogoutBtn().click();
		Thread.sleep(2000);
		
						
		String success = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Welcome!']")).getText();
		System.out.print("You Are Logout Successfully!\n");
		Assert.assertTrue(success.contains("We"));
		System.out.println(success);
		

		
		
	}
	
	
	

}
