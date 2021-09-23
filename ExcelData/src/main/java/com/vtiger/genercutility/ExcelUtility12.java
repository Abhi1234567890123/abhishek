








package com.vtiger.genercutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelUtility12 {
	
 /***
  * Practice view
  */
	public String createExcel(String Sheetname,int rowNum ,int cellNum) throws Throwable, Exception {
		FileInputStream fis=new FileInputStream(IpathConstant.eXCE);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(Sheetname);
		
		Row row = sh.getRow(rowNum);
		Cell ce = row.getCell(cellNum);
		String str = ce.getStringCellValue();
	//	System.out.println("form");
		return str;
	}
	/***
	 * dATA PROVIDER
	 * practice view
	 * @throws Throwable 
	 * 
	 */
  //  @DataProvider(name="getData")
	public static  Object[][]   getDataFromExcelSheet(String Sheetname) throws Throwable {
		FileInputStream fis=new FileInputStream(IpathConstant.exe);
		Workbook wbb = WorkbookFactory.create(fis);
		Sheet sh = wbb.getSheet(Sheetname);
		int ls = sh.getLastRowNum();
		int  ls1 = sh.getRow(0).getLastCellNum();
		Object[][] data=new Object[ls][ls1];
		for(int i=0;i<ls;i++)
		{
			for(int j=0;j<ls1;j++)
			{
				data[i][j]=sh.getRow(i+1).getCell(j).getStringCellValue();
			}
		}
		return data;
		
		
		
		
	}

}
