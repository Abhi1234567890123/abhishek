package com.vtiger.genercutility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ListenerImplementation implements ITestListener{
     
     ExtentReports report;
	 ExtentTest test;
	

	public void onTestStart(ITestResult result) {
	 
		test=report.createTest(result.getMethod().getMethodName());
		
	}

	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS,result.getMethod().getMethodName());
		
	}

	public void onTestFailure(ITestResult result)
	{   test.log(Status.FAIL,result.getThrowable());
		BasicUtility bu=new BasicUtility();
		try {
		String path=bu.getScreenshot(result.getMethod().getMethodName());
		test.addScreenCaptureFromPath(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP,result.getMethod().getMethodName()+"is skipped");
		
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TO
		
	}

	public void onStart(ITestContext context) {
		ExtentHtmlReporter reporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"/ExtentReportsSDET22/ExtentReports1.html");
		report=new ExtentReports();
		report.attachReporter(reporter);
		report.setSystemInfo("buildno","5.1");
		report.setSystemInfo("ENV", "PRE-PROD");
		report.setSystemInfo("BROWSER VERSION","CHROME-93");
		
	}

	public void onFinish(ITestContext context) {
		report.flush();
		
	}

}
