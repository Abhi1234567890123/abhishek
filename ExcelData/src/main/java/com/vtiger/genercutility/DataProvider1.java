package com.vtiger.genercutility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataProvider1 {
	
		public  Object[][]   getDataFromExcelSheet() throws Throwable {
			FileInputStream fis=new FileInputStream(IpathConstant.exe);
			Workbook wbb = WorkbookFactory.create(fis);
			Sheet sh = wbb.getSheet("Sheet1");
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
