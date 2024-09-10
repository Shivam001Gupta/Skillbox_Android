package skillbox.ObjectRepository;

import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;

public class FilterPage {
	
	@AndroidFindBy(id="com.skillbox.dev:id/tvSort_By")
	private WebElement sortbyClk;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Price: High - Low']")
	private WebElement hightolowClk;
	
	
	
	

}
