package com.qa.testscripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC_Amazon_002 extends TestBase{
	
	@Test
	public void registration()
	{
		WebElement ele = AmazonOR.getAcconntsandList();
		Actions act = new Actions(driver);
		
		act.moveToElement(ele).build().perform();
		
		AmazonOR.getStartHere().click();
		
		boolean contains = driver.getTitle().contains("Registration");
		
		if(contains) 
		{
			System.out.println("User is Navigated to Regsitration");
		}else
		{
			System.out.println("User is not Navigated to Regsitration");
		}
		
	}

}
