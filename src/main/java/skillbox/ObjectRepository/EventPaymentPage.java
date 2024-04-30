package skillbox.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import skillbox.GenericUtilities.WebDriverUtility;

public class EventPaymentPage extends WebDriverUtility {
	
	@FindBy(xpath="//label[text()='Wallet']")
	private WebElement walletPaymentMethod;
	
	@FindBy(xpath="(//div[@class='check'])[1]")
	private WebElement phonePePaymentMethod;
	
	@FindBy(id="paymentButton")
	private WebElement payButton;
	
	@FindBy(xpath="//button[text()='Success']")
	private WebElement successBtn;
	
	@FindBy(xpath="//h6[@class='text-dark mb-2']")
	private WebElement eventSBCode;
	
	@FindBy(xpath="//input[@placeholder='Email Id']")
	private WebElement emailIdEdt;
	
	

	public EventPaymentPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getWalletPaymentMethod() {
		return walletPaymentMethod;
	}

	public WebElement getPhonePePaymentMethod() {
		return phonePePaymentMethod;
	}

	public WebElement getPayButton() {
		return payButton;
	}

	public WebElement getSuccessBtn() {
		return successBtn;
	}
	
	public WebElement getEventSBCode() {
		return eventSBCode;
	}

	public void payAmountSuccess(WebDriver driver) throws Throwable
	{
		waitForElementToBeVisible(driver, walletPaymentMethod);
		walletPaymentMethod.click();
		Thread.sleep(2000);
		phonePePaymentMethod.click();
		Thread.sleep(2000);
		payButton.click();
		Thread.sleep(3000);
		swtichToWindow(driver, "razorpay");
		successBtn.click();
		swtichToWindow(driver, "sbmailer.com");
		waitForElementToBeVisible(driver, eventSBCode);
		Thread.sleep(2000);
		
			
	}
	
	public void payAmountSuccesspopup(WebDriver driver) throws Throwable
	{
//		waitForElementToBeVisible(driver, walletPaymentMethod);
		swtichToWindow(driver, "razorpay");
		phonePePaymentMethod.click();
		Thread.sleep(2000);
		payButton.click();
		Thread.sleep(3000);
		swtichToWindow(driver, "razorpay");
		successBtn.click();
		swtichToWindow(driver, "sbmailer.com");
		waitForElementToBeVisible(driver, eventSBCode);
		Thread.sleep(2000);
		
			
	}
	
	
	

	  
    	
}
