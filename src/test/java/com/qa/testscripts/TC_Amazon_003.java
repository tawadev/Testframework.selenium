package com.qa.testscripts;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC_Amazon_003 extends TestBase {
	
	@Test
	public void validatefooter()
	{
		List<WebElement> AllLinks = AmazonOR.getFooterLinks();
		
		for (WebElement i : AllLinks) 
		{
			System.out.println(i.getText());
		};
		
			
	}

}
