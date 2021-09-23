package com.vtiger.genercutility;

import java.io.FileReader;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;

public class JsonUtility {
	
	public String readDataFromString(String key) throws Throwable

	{
		FileReader file=new FileReader("./commondata.json");
		JSONParser jsonobj=new JSONParser();
		Object jobj = jsonobj.parse(file);
		HashMap map=(HashMap)jobj;
		String value=map.get(key).toString();
		
		return value;
		
	}

}
