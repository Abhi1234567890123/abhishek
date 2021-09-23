package com.vtiger.genercutility;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;
import com.crm.autodesk.elementREPOSITORY.HomePage;
import com.crm.autodesk.elementREPOSITORY.LoginPage;
import com.google.common.io.Files;

public class BasicUtility {

	public WebDriver driver;
	public static WebDriver staticdriver;
public 	DatabaseUtility du=new DatabaseUtility();
	public FileUtility fu=new FileUtility();
	public JsonUtility ju=new JsonUtility();
public	WebDriverUtility wb=new WebDriverUtility();

	
	@BeforeSuite(groups= {"Smokesuite","Regressionsuite"})
	public void connectToDb() throws SQLException {
		System.err.println("db connection");
		//du.connectToDb();
	}
	//@Parameters("BROWSER")
	@BeforeClass(groups={"Smokesuite","Regressionsuite"})
	public void launchBrowser() throws Throwable {
		
		String str=ju.readDataFromString("url");
	  String str1 = ju.readDataFromString("browser");
		 if(str1.equalsIgnoreCase("chrome"))
		 {
			 driver=new ChromeDriver();
		 }
		 
		 driver.get(str);
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 staticdriver=driver;
			 
		 
	}
	@BeforeMethod(groups={"Smokesuite","Regressionsuite"})
	public void loginApplication() throws Throwable
	{
		String str4=ju.readDataFromString("username");
		String str3 = ju.readDataFromString("password");
		LoginPage lp=new LoginPage(driver);
		lp.login(str4, str3);
		
	}
	@AfterMethod(groups={"Smokesuite","Regressionsuite"})
	public void logoutApplication() throws Throwable 
	{
		
		HomePage hp=new HomePage(driver);
		wb.waitForElementVisibility(driver,hp.getAdministratorimg());
	    hp.siGNoUT(driver);
		
		
		
		
	}
	@AfterClass(groups={"Smokesuite","Regressionsuite"})
	public void closeTheBrowser() {
		//db close
		System.out.println("dbclose");
		driver.close();
		
	}
//	public static String takeScreenShot(WebDriver driver,String testcaseName) {
		//TakesScreenshot ts=(TakesScreenshot)driver;
		//File src = ts.getScreenshotAs(OutputType.FILE);
	//	String screenShotPath="./screenshot/"+testcaseName+".PNG";
		//File dest = new File(screenShotPath);
	//	try {
			//Files.copy(src, dest);
			
		//}catch(IOException e) {
			//e.printStackTrace();
			
	//	}
		//return screenShotPath;
	//}		
      
	public String getScreenshot(String name) throws IOException {
	File SRCFILE=((TakesScreenshot)staticdriver).getScreenshotAs(OutputType.FILE);
		String destFile=System.getProperty("user.dir")+"/Screenshots/"+name+".png";
		File finaldest=new File(destFile);
		FileUtils.copyFile(SRCFILE, finaldest);
	return destFile;
		
	}		 
}
