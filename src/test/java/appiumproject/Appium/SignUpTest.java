package appiumproject.Appium;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import skillbox.GenericUtilities.BaseClass;
import skillbox.ObjectRepository.HomePage;
import skillbox.ObjectRepository.MorePage;
import skillbox.ObjectRepository.SignupPage;

public class SignUpTest extends BaseClass{
	
	@Test
	public void AppiumTest() throws Throwable
	{
		
		HomePage hp = new HomePage(driver);
		hp.getMoreClk().click();
		
		MorePage mp = new MorePage(driver);
		
		mp.getLoginSignupClk().click();
		Thread.sleep(10000);
		
		SignupPage sp = new SignupPage(driver);
		sp.signUpuser(driver, "Tena","9090901010" ,"12345678");
	    
		
			
		    
//	    String success = driver.findElement(AppiumBy.className("android.widget.Toast")).getText();
//	    
//		Assert.assertTrue(success.contains("successfully"));
//		System.out.println(success);
//	    
		
		
	}
	

}
