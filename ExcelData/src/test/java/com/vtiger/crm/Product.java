package com.vtiger.crm;


import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.vtiger.genercutility.ExcelUtility12;
import com.vtiger.genercutility.IpathConstant;

public class Product {
		
	@DataProvider(name="getdata")
	public Object[][] SreenShot() throws Throwable {
		Object[][] data1 = ExcelUtility12.getDataFromExcelSheet("Sheet1");
		return data1;
	}
	@Test(dataProvider="getdata")
	public void getProduct(String productname,String product) {

		System.out.println("product name : " + productname);
		System.out.println("product : " + product);
	}
		
		
		
	}



