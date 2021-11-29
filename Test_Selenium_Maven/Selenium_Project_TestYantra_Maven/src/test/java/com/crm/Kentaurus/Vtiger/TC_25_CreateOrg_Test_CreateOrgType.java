package com.crm.Kentaurus.Vtiger;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.crm.Vtiger.GenericLibraries.BaseClass;
import com.crm.Vtiger.GenericLibraries.WebDriverUtility;
import com.crm.Vtiger.ObjectRepostory.CreateOrgPage;
import com.crm.Vtiger.ObjectRepostory.HomePage;
import com.crm.Vtiger.ObjectRepostory.OrganizationInfoPage;

public class TC_25_CreateOrg_Test_CreateOrgType extends BaseClass {

	@Test
	public void createOrg1Test() throws Throwable {
		//WebDriverUtility WebLib = new WebDriverUtility();
		HomePage hp = new HomePage(driver);
		OrganizationInfoPage oip = new OrganizationInfoPage(null);
		
		String OrgName = JsonLib.ReadDataJson("OrgName") + JLib.Randon_Num();
		String add = JsonLib.ReadDataJson("Add") + JLib.Randon_Num();
		WLib.waitForPageLoad(driver);
		
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
		op.createOrganizationWithType(OrgName, "Investor");
		WLib.waitForElementVisibility(driver,driver.findElement(By.xpath("//input[@title='Edit [Alt+E]']")));
		
		
} }
