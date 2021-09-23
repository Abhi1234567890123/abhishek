package com.vtiger.crm;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ENSKART {
	@Test
	public void lenskart() throws InterruptedException{ 
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    driver.get("https://www.lenskart.com");
     driver.findElement(By.name("q")).sendKeys(" ");
     Thread.sleep(2000);
    
    List<WebElement> fi = driver.findElements(By.className("trending"));
   
    for(WebElement wb:fi)
    {
    	String text = wb.getText();
    	System.out.println(text);
    
    
    }
    System.out.println("total size is:" + fi.size() );
    

}
}