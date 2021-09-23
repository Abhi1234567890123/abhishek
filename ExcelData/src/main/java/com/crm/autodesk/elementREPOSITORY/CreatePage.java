package com.crm.autodesk.elementREPOSITORY;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatePage {
	
	@FindBy(xpath="//img[@title='Create Organization...']")
	private WebElement CreateplusSign;
	
	@FindBy(name="search_text")
	private WebElement search;
	
	@FindBy(name="submit")
	private WebElement submit;
	
	
	public CreatePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}


	public WebElement getCreateplusSign() {
		return CreateplusSign;
	}


	public WebElement getSearch() {
		return search;
	}


	public WebElement getSubmit() {
		return submit;
	}
	
	//Business libraries
	public void plus() {
		CreateplusSign.click();
		
	}
	public void searchBra(String s) {
		search.sendKeys(s);
	}
	
	
	public void submitBTN()
	{
		submit.click();
	}

}
