package skillbox.ObjectRepository;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import skillbox.GenericUtilities.WebDriverUtility;

public class HomePage extends WebDriverUtility {
	

	@FindBy(xpath ="//android.widget.TextView[@text='More']")
	private WebElement eventsLnk;
	
	
	

	

	
	
	

}
