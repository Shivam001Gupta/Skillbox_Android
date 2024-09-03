package skillbox.ObjectRepository;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AddonPage {
AndroidDriver driver;
	
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Select Delivery']")
	private WebElement selectDeliveryClk;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Home Delivery']")
	private WebElement homeDeliveryClk;
	
	@AndroidFindBy(xpath="//android.widget.ImageView[@resource-id='com.skillbox.dev:id/imgSelect']")
	private WebElement imgSelectClk;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Select Topup']")
	private WebElement selectTopupClk;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Wrist Band -Topup']")
	private WebElement selectwristBandTopupClk;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Pay INR  690']")
	private WebElement payAddonClk;
	
	@AndroidFindBy(id="com.skillbox.dev:id/etPinCode")
	private WebElement pinCodeEdt;
	
	@AndroidFindBy(id="com.skillbox.dev:id/etCityadd")
	private WebElement addCityClk;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='New Delhi']")
	private WebElement selectCityClk;
	
	@AndroidFindBy(id="com.skillbox.dev:id/shippingAddress")
	private WebElement addressEdt;
	
	

	public AddonPage(AndroidDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	
	public WebElement getSelectDeliveryClk() {
		return selectDeliveryClk;
	}

	public WebElement getHomeDeliveryClk() {
		return homeDeliveryClk;
	}

	public WebElement getImgSelectClk() {
		return imgSelectClk;
	}

	public WebElement getSelectTopupClk() {
		return selectTopupClk;
	}

	public WebElement getSelectwristBandTopupClk() {
		return selectwristBandTopupClk;
	}

	public WebElement getPayAddonClk() {
		return payAddonClk;
	}

	public WebElement getPinCodeEdt() {
		return pinCodeEdt;
	}

	public WebElement getAddCityClk() {
		return addCityClk;
	}

	public WebElement getSelectCityClk() {
		return selectCityClk;
	}

	public WebElement getAddressEdt() {
		return addressEdt;
	}

	public void addonSelect(AndroidDriver driver, String pincode, String address) throws Throwable
	{
		selectDeliveryClk.click();
		Thread.sleep(2000);
		homeDeliveryClk.click();
		Thread.sleep(2000);
		imgSelectClk.click();
		Thread.sleep(2000);
		selectTopupClk.click();		
		Thread.sleep(2000);
		homeDeliveryClk.click();
		Thread.sleep(2000);
		payAddonClk.click();
		Thread.sleep(2000);
		pinCodeEdt.sendKeys(pincode);
		addCityClk.click();
		Thread.sleep(2000);
		selectCityClk.click();
		Thread.sleep(2000);
		addressEdt.sendKeys(address);
		payAddonClk.click();
		Thread.sleep(5000);
		
	}
	

	
	
	
}
