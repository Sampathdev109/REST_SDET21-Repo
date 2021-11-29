	package com.crm.Kentaurus.Vtiger;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.Assert;
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

	public class TC_22_OrgTest_CreateOrgTestLogout extends BaseClass {
		
		@Test
		public void createOrg1Test() throws Throwable {
			//WebDriverUtility WebLib = new WebDriverUtility();
			HomePage hp = new HomePage(driver);
			CreateOrgPage cop = new CreateOrgPage(driver);
			OrganizationInfoPage oip = new OrganizationInfoPage(driver);
			
			
			
			String OrgName = JsonLib.ReadDataJson("OrgName") + JLib.Randon_Num();
			String OrgName1 = JsonLib.ReadDataJson("OrgName1") + JLib.Randon_Num();

			String add = JsonLib.ReadDataJson("Add") + JLib.Randon_Num();
			
			
			hp.clickonOrganizations();
		
			/*
			 * Navigate to Create Org Page
			 */
			CreateOrgPage op = new CreateOrgPage(driver);
			op.clickoncreateOrganization();
			
			/*
			 * create new org
			 */
			WLib.waitForPageLoad(driver);
			
			op.bothTY_Ind("Education","Investor", OrgName1);
			WLib.acceptAlert(driver);

		}
	}