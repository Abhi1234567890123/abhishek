package com.vtiger.crm;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Hov_er {
	@Test
	
	public void lenskart() throws InterruptedException
	{ 
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    driver.get("http://localhost:8888");
    driver.findElement(By.name("user_name")).sendKeys("admin");
	driver.findElement(By.name("user_password")).sendKeys("root");
	driver.findElement(By.id("submitButton")).click();
	driver.findElement(By.linkText("Organizations")).click();
  // WebElement wb= driver.findElement(By.xpath("//img[@title='Create Organization...']"));
 //  String att = wb.getAttribute("title");
 //  System.out.println(att);
    driver.findElements(By.xpath("//img[@title='Create Organization...']/../../../../../../../../../../..//img")).stream().forEach(ele -> System.out.println(ele.getAttribute("title")));
    
	//for(WebElement wb:find)
		//descendent::img
	//{
		//String att = wb.getAttribute("title");
		//System.out.println(att);
	//}
   

}
}