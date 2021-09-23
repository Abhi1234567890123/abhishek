package com.vtiger.genercutility;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	
	/**
	 * 
	 * @author Abhishek raj
	 *
	 
		/***
		 * this method wait for 20sec for page loading
		 * @param driver
		 */
		public void WaitUntilPageLoad(WebDriver driver) {
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		}
		/***
		 * This method wait for the element to be visible
		 * @Param driver
		 * @Param element
		 * 
		 */
		public void waitForElementVisibility(WebDriver driver,WebElement element)
		{
			WebDriverWait wait=new WebDriverWait(driver,40);
			wait.until(ExpectedConditions.visibilityOf(element));
		}
		/**
		 * this method wait for element to be clicked,its custom wait created to avoid elementerAcceptable
		 * Exception
		 * @param
		 * @throws InterruptedException 
		 * @throw Throwable
		 */
		public void waitAndClick(WebElement element) throws InterruptedException {
			int count=0;
			while(count<20)
			{
			 try {
				 element.click();
				 break;
			  }catch(Throwable e)
			   {
				  Thread.sleep(1000);
				  count++;
			   }
		    }
	    }
	   /****
	   *this method enables user to handle dropdown using visible text
	   *@param WebElement
	   * @param option
	   */
		public void select(WebElement element,String option)
		{
			Select s=new Select(element);
			s.selectByVisibleText(option);
		}
		/***
		 * this method enables user to handle dropdown using index
		 * @param element
		 * @param index
		 * 
		 */
		public void select(WebElement element,int index)
		{
			Select s=new Select(element);
			s.selectByIndex(index);
		}
		/***
		 * this method will perform mouse over action
		 * @Param driver
		 * @Param element
		 */
		public void mouseOver(WebDriver driver,WebElement element)
		{
			
			Actions act=new Actions(driver);
			act.moveToElement(element).perform();
		}
		/****
		 * this method perform right click action
		 * @param driver
		 * @param element
		 * 
		 */
		public void rightClick(WebDriver driver,WebElement element)
		{
			Actions act=new Actions(driver);
			act.contextClick().perform();
		}
		/****
		 * this method used to perform switch from  one window to another window
		 * @param driver
		 * @param partialwinTitle
		 */
		public void switchToWindow(WebDriver driver,String partialwinTitle) {
			Set<String> allid = driver.getWindowHandles();
			Iterator<String> it = allid.iterator();
			while(it.hasNext())
			{
				String winid = it.next();
				String title = driver.switchTo().window(winid).getTitle();
				if(title.contains(partialwinTitle))
				{
					break;
				}
				
			}
			
		}
		/**
		 * ACCEPT ALERT
		 * @PARAM DRIVER
		 * 
		 */
		   public void acceptAlert(WebDriver driver) {
			   driver.switchTo().alert().accept();
			
		}
		   /***
		    * cancel alert
		    * @param driver
		    */
		public void cancelAlert(WebDriver driver) {
			driver.switchTo().alert().dismiss();
			
		}
		/***
		 * this method will be use in scrolling action in  a webpage
		 * 
		 */
	}



