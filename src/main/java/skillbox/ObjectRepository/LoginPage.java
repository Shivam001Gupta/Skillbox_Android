package skillbox.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage {
	
AndroidDriver driver;
	
	
	@AndroidFindBy(id="com.skillbox.dev:id/etEmailId")
	private WebElement emailEdt;
	
	@AndroidFindBy(id="com.skillbox.dev:id/btnNext")
	private WebElement nextBtn;
	
	@AndroidFindBy(id="com.skillbox.dev:id/tvTryWithPassword")
	private WebElement tryWithPasswordClk;
	
	@AndroidFindBy(id="com.skillbox.dev:id/etPassword")
	private WebElement passwordEdt;
	
	
	
	public LoginPage(AndroidDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	

	public void loginUser(AndroidDriver driver, String email, String password) throws Throwable
	{
		emailEdt.sendKeys(email);
		nextBtn.click();
		Thread.sleep(5000);
		tryWithPasswordClk.click();
		Thread.sleep(2000);
		passwordEdt.sendKeys(password);
		nextBtn.click();
		Thread.sleep(5000);
		
	}
	
	


	
	
	
}
