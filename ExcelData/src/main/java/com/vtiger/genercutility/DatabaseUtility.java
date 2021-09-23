package com.vtiger.genercutility;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseUtility {
	
	Connection con=null;
	ResultSet result=null;
	Driver driverref;

	
	public void connectToDb() throws SQLException {
		DriverManager.registerDriver(driverref);
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student1","root","root");
		
	}
	public void close() throws SQLException {
		con.close();
	}
	public String getDataFromDb(String query,int columnindex) throws SQLException
	{
		String value=null;
		result=con.createStatement().executeQuery(query);
		while(result.next())
		{
			value=result.getString(columnindex);
		}
		return value;
	}
	
}
