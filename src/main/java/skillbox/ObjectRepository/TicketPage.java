package skillbox.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class TicketPage {
AndroidDriver driver;
	
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Livestream Pass']")
	private WebElement liveStreamPassClk;
	
	@AndroidFindBy(id="com.skillbox.dev:id/addTicket")
	private WebElement addTicketClk;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='amount']")
	private WebElement artistDonationAmountEdt;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Proceed']")
	private WebElement proceedBtn;
	
	@AndroidFindBy(id="com.skillbox.dev:id/donationAmountET")
	private WebElement donationAmountEdt;
		
	
	
	public TicketPage(AndroidDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	
	public WebElement getLiveStreamPasClk() {
		return liveStreamPassClk;
	}

	public WebElement getAddTicketClk() {
		return addTicketClk;
	}

	public WebElement getArtistDonationAmountEdt() {
		return artistDonationAmountEdt;
	}

	public WebElement getProceedBtn() {
		return proceedBtn;
	}
	

	public WebElement getDonationAmountEdt() {
		return donationAmountEdt;
	}

	public void eventTicketSelect(AndroidDriver driver) throws Throwable
	{
		
		Thread.sleep(2000);
		addTicketClk.click();
		Thread.sleep(2000);
		proceedBtn.click();
		Thread.sleep(2000);
		
	}
	

	public void eventTicketSelectWithDonation(AndroidDriver driver) throws Throwable
	{
		liveStreamPassClk.click();
		Thread.sleep(2000);
		addTicketClk.click();
		Thread.sleep(2000);
		artistDonationAmountEdt.sendKeys("300");
		Thread.sleep(2000);
		proceedBtn.click();
		Thread.sleep(2000);
		
	}
	
	public void eventDonationAmount(AndroidDriver driver, String amount) throws Throwable
	{
		
		Thread.sleep(2000);
		donationAmountEdt.sendKeys(amount);
		Thread.sleep(2000);
		proceedBtn.click();
		Thread.sleep(2000);
		
	}
	
	
	



}
