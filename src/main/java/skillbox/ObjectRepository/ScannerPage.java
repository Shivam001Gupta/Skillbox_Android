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

public class ScannerPage {
AndroidDriver driver;
	
	@AndroidFindBy(id="com.skillbox.dev:id/scanNowBtn")
	private WebElement listScanNowBtn;
	
	@AndroidFindBy(id="com.skillbox.dev:id/manualQRCodeET")
	private WebElement sbCodeEdt;
	
	@AndroidFindBy(id="com.skillbox.dev:id/scanBtn")
	private WebElement scanNowBtn;
	
	@AndroidFindBy(id="com.skillbox.dev:id/addMember")
	private WebElement addMemberClk;
	
	
	
	public ScannerPage(AndroidDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	

	public WebElement getListScanNowBtn() {
		return listScanNowBtn;
	}

	public WebElement getSbCodeEdt() {
		return sbCodeEdt;
	}

	public WebElement getScanNowBtn() {
		return scanNowBtn;
	}

	public WebElement getAddMemberClk() {
		return addMemberClk;
	}
	
	
	public void scanCode(AndroidDriver driver,String success) throws Throwable
	{
		listScanNowBtn.click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")).click();
		Thread.sleep(2000);
		sbCodeEdt.sendKeys(success);
		Thread.sleep(2000);
		scanNowBtn.click();
		Thread.sleep(5000);
		addMemberClk.click();
		Thread.sleep(2000);
		
		((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
				"elementId",  	((RemoteWebElement)driver.findElement(AppiumBy.xpath("//android.widget.RelativeLayout[@resource-id=\"com.skillbox.dev:id/checkInButton\"]/android.widget.ImageView"))).getId(), 
		    "endX", 1035,
		    "endY", 2161
		));
		Thread.sleep(7000);
		
		
		
		
	}
	





	
	
	
	


	

}
