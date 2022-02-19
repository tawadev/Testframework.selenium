package com.qa.testscripts;

import org.testng.annotations.Test;

public class TC_Amazon_001  extends TestBase{

	@Test
	public void searchitem() {
		// TODO Auto-generated method stub
		
		
 		 
 		 AmazonOR.getCategory().selectByVisibleText("Books");
 		 AmazonOR.getsearchTxtField().sendKeys("Da Vinci Code");
 		 AmazonOR.getMagnifireBtn().click();
 		 
 		 //Select Category = new Select(driver.findElement(By.id("searchDropdownBox")));
 		 //Category.selectByVisibleText("Books");
 		 //driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Da Vinci Code");
 		 //driver.findElement(By.id("nav-search-submit-button")).click();
 		 
 		 String title = driver.getTitle();
 		 
 		 if(title.contains("Da Vinci Code"))
 			 System.out.println("Item is search");
 		 else
 		 {
 			System.out.println("Item is not search"); 
 		 }
	}

}
