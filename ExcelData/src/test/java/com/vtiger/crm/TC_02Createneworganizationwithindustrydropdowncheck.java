package com.vtiger.crm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.autodesk.elementREPOSITORY.CreateNewOrganizationPage;
import com.crm.autodesk.elementREPOSITORY.CreatePage;
import com.crm.autodesk.elementREPOSITORY.CreatenewOrganizationInfo;
import com.crm.autodesk.elementREPOSITORY.HomePage;
import com.crm.autodesk.elementREPOSITORY.LoginPage;
import com.vtiger.genercutility.BasicUtility;
import com.vtiger.genercutility.DataProvider1;
import com.vtiger.genercutility.ExcelUtility12;
import com.vtiger.genercutility.FileUtility;
import com.vtiger.genercutility.JsonUtility;
import com.vtiger.genercutility.WebDriverUtility;

import junit.framework.Assert;

public class TC_02Createneworganizationwithindustrydropdowncheck extends BasicUtility {
	
	@Test(groups="Regressionsuite")
	public void createOrganisation() throws Throwable {
		FileUtility fu=new FileUtility();
		ExcelUtility12 eu=new ExcelUtility12();
	
		
		String orgname=eu.createExcel("Sheet1", 2, 2)    +    fu.getRanDomData();
		String Industry = eu.createExcel("Sheet1", 1, 3);
		HomePage hp=new HomePage(driver);
	    hp.clickonorganization();
	    CreatePage cp=new CreatePage(driver);
	    cp.plus();
	    CreateNewOrganizationPage cno=new CreateNewOrganizationPage(driver);
	    cno.industryDROPdown(orgname,Industry);
	    cno.getSaveBTN().click();
	   
	    CreatenewOrganizationInfo cnof=new CreatenewOrganizationInfo(driver);
	   String actual = cnof.orgInfo();
	   System.out.println(actual);
	   Assert.assertTrue(actual.contains(orgname));
	   System.out.println(actual);
	  
	   String actu = cnof.industryInfo();
	   
	   Assert.assertTrue(actu.contains(Industry));
	    
	    System.out.println(actu);
		
		
	
		
	}
	


}
