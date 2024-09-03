package skillbox.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class EventDetailPage {
	AndroidDriver driver;


	@AndroidFindBy(xpath="(//android.widget.Button[@resource-id='com.skillbox.dev:id/event_bt_book_tickets'])[1]")
	private WebElement bookNowBtn;
		
		
	
	public EventDetailPage(AndroidDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}



	public WebElement getBookNowBtn() {
		return bookNowBtn;
	}

	
	
	

}
