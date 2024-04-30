package skillbox.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import skillbox.GenericUtilities.WebDriverUtility;

public class EventDetailPage extends WebDriverUtility {
	
	@FindBy(xpath ="//a[@class='btn btn-primary d-block ng-star-inserted']")
	private WebElement bookBtnLnk;	
	
	
	
	
	public EventDetailPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getBookBtnLnk() {
		return bookBtnLnk;
	}
	
	public void clickbooknowbtn(WebDriver driver) throws InterruptedException
	{
		waitForElementToBeVisible(driver, bookBtnLnk);
		bookBtnLnk.click();
		Thread.sleep(5000);
	}
	
	
	
	
	
	

}
