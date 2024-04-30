package appiumproject.Appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseClass {
	
	public AndroidDriver driver;
	public AppiumDriverLocalService service;
	
	@BeforeClass
	public void ConfigureAppium()throws MalformedURLException, InterruptedException
	{
		
			//Android Driver //IOS Driver
			//Appium code ->Appium Server -Mobile
			
		service = new AppiumServiceBuilder().withAppiumJS(new File("//usr//local//lib//node_modules//appium//build//lib//main.js"))
			  .withIPAddress("127.0.0.1").usingPort(4723).build();
			
		service.start();
			
		UiAutomator2Options options=  new UiAutomator2Options();
		options.setDeviceName("ShivamEmulator");
		options.setApp("//Users//Apple//eclipse-workspace//SKILLBOX_Android//src//test//resources//base.apk");
		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
			 
		Thread.sleep(3000);
//		driver.findElement(AppiumBy.id("com.skillbox.dev:id/btnSkip")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='New Delhi']")).click();
		Thread.sleep(5000);
//		driver.findElement(AppiumBy.id("com.skillbox.dev:id/imgCross")).click();
		
					
	}
	
	@AfterClass
	public void tearDown() {
		
//		Stop server
		
		driver.quit();
		
//		service.stop();
		
		
	}

}
