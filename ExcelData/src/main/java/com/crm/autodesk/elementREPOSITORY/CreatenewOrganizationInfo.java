package com.crm.autodesk.elementREPOSITORY;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatenewOrganizationInfo {
	
	
	@FindBy(xpath="//span[@class='dvHeaderText']")
	private WebElement getyOrgInfo;
	
	@FindBy(id="dtlview_Industry")
	private WebElement IndustryInfo;
	
	@FindBy(id="mouseArea_Type")
	private WebElement Text;
	
	public CreatenewOrganizationInfo(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}

	public WebElement getGetyOrgInfo() {
		return getyOrgInfo;
	}

	public WebElement getIndustryInfo() {
		return IndustryInfo;
	}

	public WebElement getText() {
		return Text;
	}
	
	public String orgInfo() {
		 String str= getyOrgInfo.getText();
		 return str;
	}
	public String industryInfo() {
		String tex = IndustryInfo.getText();
		return tex;
	}
	
   
}
