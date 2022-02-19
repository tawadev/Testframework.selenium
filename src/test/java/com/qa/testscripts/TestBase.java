package com.qa.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.qa.pages.AmazonPages;

public class TestBase {

	WebDriver driver;
	AmazonPages AmazonOR;
	
	@BeforeClass
	public void setUp()
	{
		 String key ="webdriver.chrome.driver";                                
		 String browserPath = "\\BrowserFile\\chromedriver.exe";
		 String basePath = System.getProperty("user.dir");                   
		
		 System.setProperty(key, basePath+browserPath);                      
 		  driver = new ChromeDriver();
  		  AmazonOR = new AmazonPages(driver);
  		 driver.get("https://www.amazon.com/");

	}
	
	@AfterClass
	public void tearDown()
	{
		 driver.close();
	}
}
