package skillbox.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MorePage {
	AndroidDriver driver;
	
	@AndroidFindBy(id="com.skillbox.dev:id/scannerTextView")
	private WebElement scannerClk;
	
	@AndroidFindBy(id="com.skillbox.dev:id/profileLogin")
	private WebElement loginSignupClk;
	
	@AndroidFindBy(id="com.skillbox.dev:id/settingsTv")
	private WebElement settingClk;
	
	@AndroidFindBy(id="com.skillbox.dev:id/layoutManageSales")
	private WebElement managesalesClk;
	
	
	
	
	
	
	
	
	

	public MorePage(AndroidDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	

	
	public WebElement getLoginSignupClk() {
		return loginSignupClk;
	}

	public WebElement getScannerClk() {
		return scannerClk;
	}

	public WebElement getSettingClk() {
		return settingClk;
	}

	public WebElement getManagesalesClk() {
		return managesalesClk;
	}


	
	

	

	
	
	
	
	
	
	
	

}
