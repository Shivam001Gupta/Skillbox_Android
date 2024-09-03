package skillbox.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class EventListingPage {
	AndroidDriver driver;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.skillbox.dev:id/dayItem' and @text='Music Events']")
	private WebElement musicEventClk;
	
	@AndroidFindBy(id="com.skillbox.dev:id/ll_Filter")
	private WebElement filterClk;
	
	public EventListingPage(AndroidDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	

}
