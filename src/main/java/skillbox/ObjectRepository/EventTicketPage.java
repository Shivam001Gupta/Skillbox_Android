package skillbox.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import skillbox.GenericUtilities.WebDriverUtility;

public class EventTicketPage extends WebDriverUtility {
	
	
	

	@FindBy(xpath="//div[@class='list-group']/a")
	private WebElement passSelect;
	
	@FindBy(xpath="//div[@class='qty qty_active']/select")
	private WebElement ticketQty;
	
	@FindBy(xpath="//input[@placeholder='Enter amount']")
	private WebElement artistDonation;
	
	@FindBy(xpath="//*[text()='Checkout']")
	private WebElement ticketCheckout;
	
	@FindBy(xpath="//input[@placeholder='Enter amount']")
	private WebElement donationAmountEdt;
	
	@FindBy(xpath="//input[@placeholder='Paste Entry code']")
	private WebElement entryCouponPaste;
	
	@FindBy(xpath="//button[@class='supersonic-right btn']")
	private WebElement goBtn;
	
	public EventTicketPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getPassSelect() {
		return passSelect;
	}

	public WebElement getTicketQty() {
		return ticketQty;
	}

	public WebElement getArtistDonation() {
		return artistDonation;
	}

	public WebElement getTicketCheckout() {
		return ticketCheckout;
	}
	
	public WebElement getDonationAmountEdt() {
		return donationAmountEdt;
	}
	
	public WebElement getEntryCouponPaste() {
		return entryCouponPaste;
	}
	public WebElement getGoBtn() {
		return goBtn;
	}
	
	
	
	public void selectTicket(String text) throws Throwable
	{
		passSelect.click();
		Thread.sleep(3000);
		handleDropDown(text, ticketQty);
		artistDonation.sendKeys("300");
		ticketCheckout.click();
		
	}
	
	public void selectFreeTicket(String text)
	{
		handleDropDown(text, ticketQty);
		ticketCheckout.click();
	}
	
	public void selectDonationTicket(String text)
	{
		donationAmountEdt.sendKeys(text);
		ticketCheckout.click();
	}
	
	public void selectTicketsupersonicwidget(String text) throws Throwable
	{		
		passSelect.click();
		Thread.sleep(2000);
		entryCouponPaste.sendKeys("ENTER1234");
		goBtn.click();
		Thread.sleep(3000);
		ticketCheckout.click();
		
	}

	
	

}
