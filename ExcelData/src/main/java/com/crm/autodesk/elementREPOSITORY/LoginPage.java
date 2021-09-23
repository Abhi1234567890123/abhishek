package com.crm.autodesk.elementREPOSITORY;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/****
 * 
 * @author a.raj
 *
 */

public class LoginPage {
	//create a separate class for every webpage
	//rule2 identify all the webelemenet using @findBy,@FindBYS AND @findALL ANNOTATIONS
	
	public LoginPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
	}

	
	
	@FindBy(name="user_name")
	private WebElement usernametb;
	
	@FindBy(name="user_password")
	private WebElement passwordTb;
	
	@FindBy(id="submitButton")
	private WebElement submitBtn;

	public WebElement getUsernametb() {
		return usernametb;
	}

	

	public WebElement getPasswordTb() {
		return passwordTb;
	}

	

	public WebElement getSubmitBtn() {
		return submitBtn;
	}
//businees librairies
	public void login(String username,String password) {
		usernametb.sendKeys(username);
		passwordTb.sendKeys(password);
		submitBtn.click();
	}
	
	
	
	
}
