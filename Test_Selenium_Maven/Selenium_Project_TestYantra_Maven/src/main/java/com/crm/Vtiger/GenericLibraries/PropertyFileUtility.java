package com.crm.Vtiger.GenericLibraries;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * This class contains generic method to read data from Property file
 * @author SAMPATHDEV
 * 
 */

public class PropertyFileUtility {


	//This method contains method to read data from Property file
	public String GetPropertyFileData (String key) throws Throwable {
		
		FileInputStream fis = new FileInputStream(IpathConstants.PropertyFilePath);
		Properties p = new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
	
	}
}
