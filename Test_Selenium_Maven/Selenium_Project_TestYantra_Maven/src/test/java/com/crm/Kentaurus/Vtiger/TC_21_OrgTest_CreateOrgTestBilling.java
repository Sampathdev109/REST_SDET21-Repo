package com.crm.Kentaurus.Vtiger;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

import com.crm.Vtiger.GenericLibraries.BaseClass;
import com.crm.Vtiger.GenericLibraries.JavaUtility;
import com.crm.Vtiger.GenericLibraries.JsonFileUtility;
import com.crm.Vtiger.GenericLibraries.WebDriverUtility;
import com.crm.Vtiger.ObjectRepostory.HomePage;
import com.crm.Vtiger.ObjectRepostory.LoginPage;
import com.crm.Vtiger.ObjectRepostory.OrganizationInfoPage;
import com.crm.Vtiger.ObjectRepostory.CreateOrgPage;


public class TC_21_OrgTest_CreateOrgTestBilling extends BaseClass {
	
	@Test(groups = "Regression",retryAnalyzer=com.crm.Vtiger.GenericLibraries.RetryAnalyser.class)
	public void createOrg1Test() throws Throwable {
		//WebDriverUtility WebLib = new WebDriverUtility();
		HomePage hp = new HomePage(driver);
		OrganizationInfoPage oip = new OrganizationInfoPage(driver);
		
		String OrgName = JsonLib.ReadDataJson("OrgName") + JLib.Randon_Num();
		String add = JsonLib.ReadDataJson("Add") + JLib.Randon_Num();
		
		/*
		 * Click on Org Page
		 */
		
		hp.clickonOrganizations();
	
		/*
		 * Navigate to Create Org Page
		 */
		CreateOrgPage op = new CreateOrgPage(driver);
		op.clickoncreateOrganization();
		
		/*
		 * create new org
		 */
		
		
		op.OrgName_Add(add,OrgName);
		WLib.waitForElementVisibility(driver, oip.getEditBtn());

		
		
		/*
		 * verification from Org page
		 */
		
		oip.getOrganizationInformation();
		
		System.out.println(add);
		/*
		 * Verify Bill Address
		 */
		String Result = oip.getBillInfomation();
		System.out.println(Result);
		//Verify assertion
		
		Assert.assertTrue(Result.contains(add));
		Assert.assertEquals(false, true);
	
		
		
		/*
		 * Verification
		 */
	}}
	
	