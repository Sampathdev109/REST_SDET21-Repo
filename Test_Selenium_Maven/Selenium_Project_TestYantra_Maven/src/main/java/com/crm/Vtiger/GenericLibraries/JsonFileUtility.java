package com.crm.Vtiger.GenericLibraries;

import java.io.FileReader;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;

// This class is used to read data from ".json" file
// Needs to throw throwable

public class JsonFileUtility {
	
	public String ReadDataJson(String key) throws Throwable {
		
		
	// Reads the data from JSON File
	FileReader fis = new FileReader(IpathConstants.JsonFilePath);
	
	// Covert the json file into java object
	JSONParser jp = new JSONParser();
	Object obj = jp.parse(fis);
	
	//Type cast java obj to hm
	HashMap hm = (HashMap)obj;
	String value= hm.get(key).toString();
	
	// Return the value;
	return value;
	
	
	} }