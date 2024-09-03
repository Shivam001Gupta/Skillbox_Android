package skillbox.ObjectRepository;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class SignupPage {
	AndroidDriver driver;
	
	@AndroidFindBy(id="com.skillbox.dev:id/btnSignUp")
	private WebElement signUpBtn;
	
	@AndroidFindBy(id="com.skillbox.dev:id/etFullName")
	private WebElement fullNameEdt;
	
	@AndroidFindBy(id="com.skillbox.dev:id/etPhoneNumber")
	private WebElement mobileNoEdt;
	
	@AndroidFindBy(id="com.skillbox.dev:id/etEmailId")
	private WebElement emailIdEdt;
	
	@AndroidFindBy(id="com.skillbox.dev:id/etPassword")
	private WebElement passwordEdt;
	
	@AndroidFindBy(id="com.skillbox.dev:id/btnNextSignUp")
	private WebElement signUpNextBtn;
	
	
	public SignupPage(AndroidDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	
	

	public WebElement getSignUpBtn() {
		return signUpBtn;
	}


	public WebElement getFullNameEdt() {
		return fullNameEdt;
	}


	public WebElement getMobieNoEdt() {
		return mobileNoEdt;
	}


	public WebElement getEmailIdEdt() {
		return emailIdEdt;
	}


	public WebElement getPasswordEdt() {
		return passwordEdt;
	}


	public WebElement getSignUpNextBtn() {
		return signUpNextBtn;
	}
	
	public void signUpuser(AndroidDriver driver,String name, String mobile, String password) throws Throwable
	{
		signUpBtn.click();
		Thread.sleep(5000);
		fullNameEdt.sendKeys(name);
		mobileNoEdt.sendKeys(mobile);
		Random random = new Random();
		int number = random.nextInt(1000000);
		emailIdEdt.sendKeys(number+"@gmail.com");
		passwordEdt.sendKeys(password);
		signUpNextBtn.click();
		Thread.sleep(3000);
	}
	
	
		
}
