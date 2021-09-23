package com.vtiger.crm;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.vtiger.genercutility.ExcelUtility12;

@Test
public class Tc01 {
	
	
	public void createProduct() throws Throwable, Throwable {
		ExcelUtility12 eu=new 	ExcelUtility12();
		String sh1=eu.createExcel("Sheet1",6,0);
		String sh2=eu.createExcel("Sheet1",6,1);
		String sh3=eu.createExcel("Sheet1",6,2);
		String sh4=eu.createExcel("Sheet1",6,3);
		System.out.println(sh1);
		System.out.println(sh2);
		System.out.println(sh3);
		System.out.println(sh4);
		 WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(sh1);
		driver.findElement(By.name("user_name")).sendKeys(sh2);
		driver.findElement(By.name("user_password")).sendKeys(sh3,Keys.ENTER);
		driver.findElement(By.linkText("Organizations")).click();
		WebElement wb= driver.findElement(By.xpath("//img[@title='Create Organization...']"));
		Actions act=new Actions(driver);
		act.contextClick(wb).perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		String mainID1 = driver.getWindowHandle();
		Set<String> allID1= driver.getWindowHandles();
		for(String s:allID1)
		{
			
			if(!mainID1.equals(s))
			{
				driver.switchTo().window(s);
			}
		}

		driver.findElement(By.name("accountname")).sendKeys(eu.createExcel("Sheet1", 1, 2));
		
		
		
		
		
		
		
		
		
	}
	
	

}
