package skillbox.ObjectRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import skillbox.GenericUtilities.WebDriverUtility;

public class AddOnPage extends WebDriverUtility {
	
	
	@FindBy(xpath="//input[@name='addOns']/..")
	private WebElement addOnSelectCheck;
	
	@FindBy(xpath="//div[@class='mr-3 ng-star-inserted']/select")
	private WebElement addOnCategory;
	
	@FindBy(xpath="//div[@class='ng-star-inserted']/select")
	private WebElement addOnQuantity;
	
	@FindBy(xpath="//textarea[@placeholder='Enter your shipping address..']")
	private WebElement shippingAddressEdt;
	
	@FindBy(xpath="//button[text()='Checkout']")
	private WebElement addOnCheckOutBtn;
	
	@FindBy(xpath="//div[@unselectable='unselectable']")
	private WebElement cityClk;
	
	@FindBy(xpath="//nz-select[@nzplaceholder='City*']/div/div/div[2]/div/input")   // "//nz-select[@nzplaceholder='City*']"
	private WebElement cityEdt;
	
	@FindBy(xpath="//li[@unselectable='unselectable']")
	private List<WebElement> listItems;
	
	@FindBy(xpath="//input[@placeholder='Pincode*']")
	private WebElement pincodeEdt;
	
	
	
	
	public AddOnPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddOnSelectCheck() {
		return addOnSelectCheck;
	}

	public WebElement getAddOnCategory() {
		return addOnCategory;
	}

	public WebElement getAddOnQuantity() {
		return addOnQuantity;
	}

	public WebElement getShippingAddressEdt() {
		return shippingAddressEdt;
	}

	public WebElement getAddOnCheckOutBtn() {
		return addOnCheckOutBtn;
	}
	
	public WebElement getCityClk() {
		return cityClk;
	}

	public List<WebElement> getListItems() {
		return listItems;
	}

	public WebElement getPincodeEdt() {
		return pincodeEdt;
	}
	
	public WebElement getCityEdt() {
		return cityEdt;
	}

	
	public void addOnData(WebDriver driver, String category, String quantity, String Address) throws Throwable
	{
	    waitForElementToBeVisible(driver, addOnCheckOutBtn);
		Thread.sleep(3000);
		addOnSelectCheck.click();
		handleDropDown(category, addOnCategory);
		handleDropDown(quantity, addOnQuantity);
		shippingAddressEdt.sendKeys(Address);
		addOnCheckOutBtn.click();
				
	}

	public void addOnDataSupersonic(WebDriver driver, String city, String pincode, String Address)throws Throwable
	{
		{
		    waitForElementToBeVisible(driver, addOnCheckOutBtn);
			Thread.sleep(3000);
			shippingAddressEdt.sendKeys(Address);
			cityClk.click();
			Thread.sleep(3000);
			cityEdt.sendKeys(city);
			Thread.sleep(3000);
			selectItemFromList(driver, city, listItems);
			Thread.sleep(5000);
//			escapeClickAction(driver);
			pincodeEdt.sendKeys(pincode);
			addOnCheckOutBtn.click();
					
		}
	}

	
	
	
	
	
	
	

	

}
