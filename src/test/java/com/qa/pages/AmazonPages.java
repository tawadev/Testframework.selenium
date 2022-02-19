package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AmazonPages {
	
	WebDriver driver;
	@FindBy(id="searchDropdownBox")
	WebElement Category;
	public Select getCategory()
	{
		Select cat = new Select(Category);
		return cat;		
	}
	
	@FindBy(id="twotabsearchtextbox")
	WebElement searchTxtField;
	public WebElement getsearchTxtField()
	{
				return searchTxtField;		
	}
	
	@FindBy(id="nav-search-submit-button")
	WebElement MagnifireBtn;
	public WebElement getMagnifireBtn()
	{
				return MagnifireBtn;		
	}	
	
	@FindBy(id="nav-link-accountList")
	WebElement AccountsandList;
	public WebElement getAcconntsandList()
	{
				return AccountsandList;		
	}	
	
	@FindBy(linkText="Start here.")
	WebElement StartHere;
	public WebElement getStartHere()
	{
				return StartHere;		
	}	
	
	@FindAll(@FindBy(className="nav_a"))
	List<WebElement> footerlinks;
	public List<WebElement> getFooterLinks()
	{
		return footerlinks;
	}
	
	public AmazonPages(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	


}
