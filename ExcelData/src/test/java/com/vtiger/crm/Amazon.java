package com.vtiger.crm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazon { 
	@Test
	public void amaz() throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile under 15000");
		WebElement find = driver.findElement(By.id("nav-search-submit-button"));
		find.submit();
		driver.findElement(By.xpath("//span[text()='See more']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='MI']/..//i")).click();
		WebElement text = driver.findElement(By.xpath("//span[text()='FREE Delivery by Amazon']/../../../../..//a//span/following-sibling::span/span/following-sibling::span"));
	    String text2 = text.getText();
	    String text3 = text2.replace(",", "");
	    int par = Integer.parseInt(text3);
	    System.out.println(text3);
	    
	    
	
		if(par<=15000) 
        {
			System.out.println("pass");
			
		}
		else
		{
			System.out.println("not pass");
		}
		
		
		
	}
	
	
	
	

}
