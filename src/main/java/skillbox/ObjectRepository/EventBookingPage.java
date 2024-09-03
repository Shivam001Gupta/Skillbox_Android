package skillbox.ObjectRepository;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class EventBookingPage {
AndroidDriver driver;
	
	
	@AndroidFindBy(id="com.skillbox.dev:id/etPicode")
	private WebElement pinCodeEdt;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Have a Promo Code ?']")
	private WebElement havePromoCodeClk;

	@AndroidFindBy(xpath="//android.widget.EditText[@text='Enter Coupon Code']")
	private WebElement couponCodeEdt;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='APPLY']")
	private WebElement applyCouponClk;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='YAY!']")
	private WebElement yahClk;
	
	@AndroidFindBy(id="com.skillbox.dev:id/tvChange")
	private WebElement changeMethodClk;
	

	public EventBookingPage(AndroidDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}


	
	public WebElement getPinCodeEdt() {
		return pinCodeEdt;
	}

	public WebElement getHavePromoCodeClk() {
		return havePromoCodeClk;
	}

	public WebElement getCouponCodeEdt() {
		return couponCodeEdt;
	}

	public WebElement getApplyCouponClk() {
		return applyCouponClk;
	}

	public WebElement getYahClk() {
		return yahClk;
	}

	public WebElement getChangeMethodClk() {
		return changeMethodClk;
	}
	
	public void couponApply(AndroidDriver driver, String coupon) throws Throwable
	{
		
		Thread.sleep(2000);
		havePromoCodeClk.click();
		couponCodeEdt.sendKeys(coupon);
		applyCouponClk.click();
		Thread.sleep(5000);
		yahClk.click();
				
	}


	public void pinAndPay(AndroidDriver driver,String pincode) throws Throwable
	{
		Thread.sleep(2000);
		pinCodeEdt.sendKeys(pincode);
		Thread.sleep(2000);
		changeMethodClk.click();				
		
	}
	
	public void pinAndPayFree(AndroidDriver driver,String pincode) throws Throwable
	{
		Thread.sleep(2000);
		pinCodeEdt.sendKeys(pincode);
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
				"elementId",  	((RemoteWebElement)driver.findElement(AppiumBy.xpath("//android.widget.RelativeLayout[@resource-id=\"com.skillbox.dev:id/checkInButton1\"]/android.widget.ImageView"))).getId(), 
		    "endX", 1035,
		    "endY", 2161
		));
		
		Thread.sleep(7000);
				
		
	}
	
	

}
