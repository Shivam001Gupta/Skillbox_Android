package skillbox.ObjectRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ManageSalesPage {
AndroidDriver driver;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.skillbox.dev:id/tvEventName']")
	private List<WebElement> eventName;
	
	@AndroidFindBy(id="com.skillbox.dev:id/etSearchBox")
	private WebElement eventSearchEdt;
	
	@AndroidFindBy(id="com.skillbox.dev:id/btnViewDetails")
	private WebElement viewDetailsSalesClk;
	
	
	
	
	public ManageSalesPage(AndroidDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public List<WebElement> getEventName() {
		return eventName;
	}

	public WebElement getEventSearchEdt() {
		return eventSearchEdt;
	}

	public WebElement getViewDetailsSalesClk() {
		return viewDetailsSalesClk;
	}
	
	

	
	public void manageSales(AndroidDriver driver, String event) throws Throwable
	{
		
	 for(WebElement i : eventName)
	    	
	    {	    	
		   
		 	
			System.out.println(i.getText());
			Thread.sleep(1000);
	    }
	 Thread.sleep(5000);
	 eventSearchEdt.sendKeys(event);
	 Thread.sleep(5000);
	 viewDetailsSalesClk.click();
	 Thread.sleep(10000);	
		
	}




	

}
