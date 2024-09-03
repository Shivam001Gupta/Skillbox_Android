package skillbox.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SearchPage {
AndroidDriver driver;
	
	
	@AndroidFindBy(id="com.skillbox.dev:id/etSearchText")
	private WebElement searchEdt;
	
	@AndroidFindBy(xpath="(//android.widget.ImageView[@resource-id='com.skillbox.dev:id/imgSearchItem'])[1]")
	private WebElement eventClk;
	
	
	
	
	
	
	
	public SearchPage(AndroidDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}




	public WebElement getSearchEdt() {
		return searchEdt;
	}
	
	public void eventSearch(AndroidDriver driver,String name) throws Throwable
	{
		searchEdt.sendKeys(name);
		Thread.sleep(5000);
		eventClk.click();
		
		
	}



}
