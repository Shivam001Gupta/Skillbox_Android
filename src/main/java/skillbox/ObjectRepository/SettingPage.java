package skillbox.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SettingPage {
	
AndroidDriver driver;
	
	@AndroidFindBy(id="com.skillbox.dev:id/logOutIcon")
	private WebElement logoutBtn;
	
	
	
	public SettingPage(AndroidDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}



	public WebElement getLogoutBtn() {
		return logoutBtn;
	}
	
	
	
		

	
}
