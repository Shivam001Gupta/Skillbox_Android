package skillbox.ObjectRepository;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PaymentPage {
	AndroidDriver driver;


	@AndroidFindBy(xpath="//android.widget.TextView[@text='Wallets']")
	private WebElement walletsClk;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='airtelmoney']")
	private WebElement airtelMoneyClk;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Success']")
	private WebElement successBtn;
	

		
		
	
	public PaymentPage(AndroidDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	
	public WebElement getWalletsClk() {
		return walletsClk;
	}

	public WebElement getAirtelMoneyClk() {
		return airtelMoneyClk;
	}

	public WebElement getSuccessBtn() {
		return successBtn;
	}


	
	public void paymentSuccess(AndroidDriver driver) throws Throwable
	{
		Thread.sleep(7000);
		walletsClk.click();
		Thread.sleep(2000);
		airtelMoneyClk.click();
		Thread.sleep(8000);
		successBtn.click();
		Thread.sleep(15000);
		
	}





}
