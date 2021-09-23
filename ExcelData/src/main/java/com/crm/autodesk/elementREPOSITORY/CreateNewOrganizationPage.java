package com.crm.autodesk.elementREPOSITORY;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.genercutility.WebDriverUtility;

public class CreateNewOrganizationPage extends WebDriverUtility{
	
	WebDriver driver;
	
	@FindBy(name="accountname")
	private WebElement OrganizationNametb;
	
	@FindBy(name="industry")
	private WebElement IndustryDropdown;
	
	@FindBy(name="accounttype")
	private WebElement TypeDropDown;
	
	@FindBy(xpath="//input[@title='Save [Alt+]']")
	private WebElement saveBTN;
	
	public WebElement getSaveBTN() {
		return saveBTN;
	}

	public CreateNewOrganizationPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}

	public WebElement getOrganizationNametb() {
		return OrganizationNametb;
	}

	public WebElement getIndustryDropdown() {
		return IndustryDropdown;
	}

	public WebElement getTypeDropDown() {
		return TypeDropDown;
	}
	//business libraries
	public void organizationlastName(String sname)
	{
		OrganizationNametb.sendKeys(sname);
	}
	public void industryDROPdown(String dname,String indType) {
		OrganizationNametb.sendKeys(dname);
		select(IndustryDropdown,indType);
		saveBTN.click();	
	}
	public void typeDropDOWN(String gname,String type) {
		OrganizationNametb.sendKeys(gname);
		select(TypeDropDown,type);
		saveBTN.click();
		
	}
	

}
