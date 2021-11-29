package com.crm.Vtiger.GenericLibraries;

import java.util.Date;
import java.util.Random;

import org.apache.poi.ss.formula.functions.Today;

public class JavaUtility {

	
	/**
	 * This class contains generic methods regarding java classes/methods.
	 * @author SAMPATHDEV
	 * @return 
	 */
	
	
	public int Randon_Num() {
		
		Random r = new Random();
		int random = r.nextInt(10000);
		return random;
		
	}

	public String getCurrentDate() {
		Date date = new Date();
		String systemDate_Time = date.toString();
		
		return systemDate_Time;
	}
}
