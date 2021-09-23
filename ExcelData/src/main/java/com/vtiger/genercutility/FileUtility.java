package com.vtiger.genercutility;

import java.util.Date;
import java.util.Random;
/*****
 * 
 * 
 * @author Abhishek raj
 *
 */

public class FileUtility {
	/***
	 * its used to generate the integer Random number with in the boundry of 0 to 10000
	 * @return intData
	 */
 public int getRanDomData() {
		Random r=new Random();
		int ne = r.nextInt();
		return ne;
	}
	
	/***
	 * it is used to get the current system date and time
	 * @return
	 */
 public String getSystemDate() {
		 Date d= new Date();
		 String sysD = d.toString();
		 return sysD;
		
	}
 /***
  * IT IS USED TO GET THE CURRENT SYSTEM DATE WITH yyyy-mm-dd
  * @return
  */
 public String getSystemDate_YYYY_MM_DD() {
	 Date d=new Date();
	 String sysda = d.toString();
	 System.out.println(sysda);
	 String[] sp = sysda.split(" ");
	 String DD=sp[2];
	 String YYYY=sp[5];
	 int MM=d.getMonth()+1;
	 String findFormat=YYYY+"-"+MM+"_-"+DD;
	 return findFormat;
	 
	
	 
 }

}
