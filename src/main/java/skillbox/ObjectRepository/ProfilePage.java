package skillbox.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import skillbox.GenericUtilities.IConstants;
import skillbox.GenericUtilities.WebDriverUtility;

public class ProfilePage extends WebDriverUtility{
	
		
		@FindBy(xpath ="//*[text()=' Upload Work ']")
		private WebElement uploadWorkBtn;
		
		@FindBy(xpath="//ul[@nz-menu='']/li[1]")
		private WebElement selectTrack;
		
		@FindBy(xpath="//div[@class='track_actions']/div[4]/nz-dropdown")
		private WebElement threedotclk;
		
		@FindBy(xpath="//li[text()=' Delete Track']")
		private WebElement deletetrackclk;
		
		@FindBy(xpath="//span[text()=' Yes Delete ']/..")
		private WebElement deleteconfirmationclk;
		
		@FindBy(xpath="//div[@class='ant-message']/nz-message")
		private WebElement succesmsg;
			
		
		
		


		public ProfilePage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		
		public WebElement getUploadWorkBtn() {
			return uploadWorkBtn;
		}

		public WebElement getSelectTrack() {
			return selectTrack;
		}
		
		public WebElement getThreedotclk() {
			return threedotclk;
		}

		public WebElement getDeletetrackclk() {
			return deletetrackclk;
		}

		public WebElement getDeleteconfirmationclk() {
			return deleteconfirmationclk;
		}
		
		public WebElement getSuccesmsg() {
			return succesmsg;
		}
		
		/**
		 * This Method is used for upload track
		 * @param driver
		 * @throws InterruptedException
		 */
		public void selectTrack(WebDriver driver)throws InterruptedException
		{
			waitForElementToBeVisible(driver, uploadWorkBtn);
			Thread.sleep(2000);
			uploadWorkBtn.click();
			Thread.sleep(2000);
			selectTrack.click();
			
						
		}
		
		/**
		 * This Method is used for delete track
		 * @param driver
		 * @throws InterruptedException
		 */
		public void deleteTrack(WebDriver driver) throws InterruptedException
		{
			Thread.sleep(8000);
			threedotclk.click();
			Thread.sleep(2000);
			deletetrackclk.click();
			Thread.sleep(2000);
			deleteconfirmationclk.click();
			waitForElementToBeVisible(driver, succesmsg);
			
			
		}
			

}
