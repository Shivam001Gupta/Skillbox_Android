package skillbox.ObjectRepository;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class EventListingPage {
	AndroidDriver driver;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.skillbox.dev:id/dayItem' and @text='Music Events']")
	private WebElement musicEventClk;
	
	@AndroidFindBy(id="com.skillbox.dev:id/ll_Filter")
	private WebElement filterClk;
	
	@AndroidFindBy(id="com.skillbox.dev:id/tvSort_By")
	private WebElement sortByClk;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Price: High - Low']")
	private WebElement highToLowClk;
	
	@AndroidFindBy(id="com.skillbox.dev:id/tvFilter")
	private WebElement applyFilterClk;
	
	@AndroidFindBy(id="com.skillbox.dev:id/tvDay")
	private WebElement byDayClk;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Today']")
	private WebElement todayClk;
	
	@AndroidFindBy(id="com.skillbox.dev:id/tvSearchbyyourcity")
	private WebElement searchYourCityClk;
	
	@AndroidFindBy(id="com.skillbox.dev:id/etSearchBox1")
	private WebElement cityEdt;
	
	@AndroidFindBy(id="com.skillbox.dev:id/textName")
	private WebElement selectCityClk;
	
	@AndroidFindBy(id="com.skillbox.dev:id/tvPrice")
	private WebElement selectByPriceClk;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Free']")
	private WebElement freeClk;
	
	@AndroidFindBy(id="com.skillbox.dev:id/tvMoreFilters")
	private WebElement moreFilterClk;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Past Events']")
	private WebElement selectPastEventClk;
	
	@AndroidFindBy(id="com.skillbox.dev:id/reset")
	private WebElement resetFilterClk;
	
	
	
	
			
	
	public EventListingPage(AndroidDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public WebElement getMusicEventClk() {
		return musicEventClk;
	}

	public WebElement getFilterClk() {
		return filterClk;
	}

	public WebElement getSortByClk() {
		return sortByClk;
	}

	public WebElement getHighToLowClk() {
		return highToLowClk;
	}

	public WebElement getApplyFilterClk() {
		return applyFilterClk;
	}

	public WebElement getByDayClk() {
		return byDayClk;
	}

	public WebElement getTodayClk() {
		return todayClk;
	}

	public WebElement getSearchYourCityClk() {
		return searchYourCityClk;
	}

	public WebElement getCityEdt() {
		return cityEdt;
	}

	public WebElement getSelectCityClk() {
		return selectCityClk;
	}

	public WebElement getSelectByPriceClk() {
		return selectByPriceClk;
	}

	public WebElement getFreeClk() {
		return freeClk;
	}

	public WebElement getMoreFilterClk() {
		return moreFilterClk;
	}

	public WebElement getSelectPastEventClk() {
		return selectPastEventClk;
	}

	public WebElement getResetFilterClk() {
		return resetFilterClk;
	}
	
	
		
	public void sortByFilter(AndroidDriver driver) throws Throwable
	{
		filterClk.click();
		Thread.sleep(2000);	
		sortByClk.click();
		Thread.sleep(2000);
		highToLowClk.click();
		Thread.sleep(5000);
		applyFilterClk.click();
		Thread.sleep(5000);
				
	}
	
	public void dayByFilter(AndroidDriver driver) throws Throwable
	{
		filterClk.click();
		Thread.sleep(2000);	
		byDayClk.click();		
		Thread.sleep(2000);
		todayClk.click();
		Thread.sleep(5000);
		applyFilterClk.click();
		Thread.sleep(5000);
				
	}
	
	public void filterByCity(AndroidDriver driver, String city) throws Throwable
	{
		filterClk.click();
		Thread.sleep(2000);	
		searchYourCityClk.click();		
		Thread.sleep(2000);
		cityEdt.sendKeys(city);
		Thread.sleep(2000);
		selectCityClk.click();
		Thread.sleep(5000);
		applyFilterClk.click();
		Thread.sleep(5000);
				
	}
	
	public void filterByPrice(AndroidDriver driver) throws Throwable
	{
		filterClk.click();
		Thread.sleep(2000);	
		selectByPriceClk.click();		
		Thread.sleep(2000);
		freeClk.click();
		Thread.sleep(2000);
		applyFilterClk.click();
		Thread.sleep(5000);
				
	}
	
	public void moreFilter(AndroidDriver driver) throws Throwable
	{
		filterClk.click();
		Thread.sleep(2000);	
		moreFilterClk.click();		
		Thread.sleep(2000);
		selectPastEventClk.click();
		Thread.sleep(2000);
		applyFilterClk.click();
		Thread.sleep(5000);
		filterClk.click();
		Thread.sleep(2000);
		resetFilterClk.click();
		applyFilterClk.click();
		
	}
	

}
