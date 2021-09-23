package com.crm.autodesk.elementREPOSITORY;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.genercutility.WebDriverUtility;

/****
 * 
 * @author a.raj
 *
 */

public class HomePage extends WebDriverUtility {
	WebDriver driver;
	WebDriverUtility wb1=new WebDriverUtility();
	/***
	 * creating  constructor for initilisation through driver
	 */
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
/**
 * locate a respective webelement by @FINDbY && @fINDBys
 */
	@FindBy(linkText="Organizations")
	private WebElement organizationLNK;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement Administratorimg;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signOutLNK;
	
	@FindBy(linkText = "Contacts")
	private WebElement contactLNK;
	
	@FindBy(linkText = "Products")
	private WebElement prodiuctLNK;
	
	@FindBy(linkText = "Leads")
	private WebElement leadsLNK;

	public WebElement getOrganizationLNK() {
		return organizationLNK;
	}

	public WebElement getAdministratorimg() {
		return Administratorimg;
	}

	public WebElement getSignOutLNK() {
		return signOutLNK;
	}

	public WebElement getContactLNK() {
		return contactLNK;
	}

	public WebElement getProdiuctLNK() {
		return prodiuctLNK;
	}

	public WebElement getLeadsLNK() {
		return leadsLNK;
	}
	//create businees libraries for login
	
	public void clickonorganization() {
		
			organizationLNK.click();
	}
    public void clickonContacts() {
		
	    contactLNK.click();
	}
    public void clickONleads() {
    	leadsLNK.click();
    }
    
    	
    	
    public void siGNoUT(WebDriver driver) {
    	
    	wb1.mouseOver(driver,Administratorimg);
    	
    	signOutLNK.click();
    	
    }
  
	
	
	
	
}
