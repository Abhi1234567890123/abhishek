package com.vtiger.crm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.autodesk.elementREPOSITORY.CreateNewOrganizationPage;
import com.crm.autodesk.elementREPOSITORY.CreatePage;
import com.crm.autodesk.elementREPOSITORY.HomePage;
import com.crm.autodesk.elementREPOSITORY.LoginPage;
import com.vtiger.genercutility.BasicUtility;
import com.vtiger.genercutility.DataProvider1;
import com.vtiger.genercutility.ExcelUtility12;
import com.vtiger.genercutility.FileUtility;
import com.vtiger.genercutility.JsonUtility;
import com.vtiger.genercutility.WebDriverUtility;

public class TC_03CreateOrganisationWithTest extends BasicUtility {
	
	
	@Test(groups="Smokesuite")
	public void createOrganisation() throws Throwable {
		FileUtility fu=new FileUtility();
		ExcelUtility12 eu=new ExcelUtility12();
		String orgname=eu.createExcel("Sheet1", 2, 2)    +    fu.getRanDomData();
		String test = eu.createExcel("Sheet1", 1, 4);
		HomePage hp=new HomePage(driver);
	    hp.clickonorganization();
	    CreatePage cp=new CreatePage(driver);
	    cp.plus();
	    CreateNewOrganizationPage cno=new CreateNewOrganizationPage(driver);
	    cno.typeDropDOWN(orgname, test);
	    cno.getSaveBTN().click();

}
}
