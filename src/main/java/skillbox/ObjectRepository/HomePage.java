package skillbox.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage {
	AndroidDriver driver;
	
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='More']")
	private WebElement homeClk;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Events']")
	private WebElement eventClk;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='More']")
	private WebElement moreClk;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Search']")
	private WebElement searchClk;
	
	
	
	public HomePage(AndroidDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}



	public WebElement getHomeClk() {
		return homeClk;
	}

	public WebElement getEvenClk() {
		return eventClk;
	}

	public WebElement getMoreClk() {
		return moreClk;
	}

	public WebElement getSearchClk() {
		return searchClk;
	}

	
	
	
	

	
	
	
	
	

}
