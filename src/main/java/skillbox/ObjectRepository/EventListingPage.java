package skillbox.ObjectRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import skillbox.GenericUtilities.WebDriverUtility;

public class EventListingPage extends WebDriverUtility {
	
	@FindBy(xpath="//div[@class='col-lg-4 col-sm-6 col-12 ng-star-inserted']")
	private WebElement eventListFind;
	
	@FindBy(xpath="//div[@class='event-result-box']/div[2]/h2")
	private List<WebElement> eventName;
		
	public EventListingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getEventListFind() {
		return eventListFind;
	}

	public List<WebElement> getEventName() {
		return eventName;
	}
	
	public void selectEventFromList(WebDriver driver, String eventname)
	{
		waitForElementToBeVisible(driver, eventListFind);
		selectItemFromList(driver, eventname , eventName);
		
	}
	

	
	
}
