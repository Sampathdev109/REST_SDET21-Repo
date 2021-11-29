package com.crm.Vtiger.ObjectRepostory;

import org.apache.poi.hssf.eventusermodel.dummyrecord.LastCellOfRowDummyRecord;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.Vtiger.GenericLibraries.JavaUtility;
import com.crm.Vtiger.GenericLibraries.JsonFileUtility;
import com.crm.Vtiger.GenericLibraries.WebDriverUtility;

import com.crm.Vtiger.GenericLibraries.WebDriverUtility;

public class CreateOrgPage extends WebDriverUtility {
	
	// constructor to initialize element at the time of object creation
	public CreateOrgPage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}

	// private locators
	
	@FindBy(name="search_text")
	private WebElement advSearchOrg;
	
	@FindBy(name="accountname")
	private WebElement orgNameEdt;

	@FindBy(name="industry")
	private WebElement industryDropdown;

	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;

	@FindBy(name="accounttype")
	private WebElement typeDropdown;
	
	@FindBy(xpath="//a//img[@title='Create Organization...']")
	private WebElement OrgImg;
	
	@FindBy(xpath ="//img[@src='themes/softed/images/user.PNG']")
	private WebElement administratorLink;
	
	@FindBy(xpath ="//a[@href='index.php?module=Users&action=Logout']")
	private WebElement signoutLink;
	
	@FindBy(xpath="//input[@title='Delete [Alt+D]']")
	private WebElement deleteBtn;
	
	@FindBy(name="bill_street")
	private WebElement billAdd;
	
	@FindBy(name="search_text")
	private WebElement searchBox;
	
	@FindBy(partialLinkText = "Create Filter")
	private WebElement createFilter;

	// getters for locators
	public WebElement getOrgNameEdt() {
	return orgNameEdt;
	}

	public WebElement getAdvSearch() {
		return advSearchOrg;
	}
	public WebElement getIndustryDropdown() {
	return industryDropdown;
	}

	public WebElement getSaveBtn() {
	return saveBtn;
	}
	public WebElement getDelete() {
		return deleteBtn;
	}
	public WebElement getbillAdd() {
		return billAdd;
	}

	public WebElement getTypeDropdown() {
	return typeDropdown;
	}
	
	public WebElement getOrgImg() {
		return OrgImg;
	}
	
	public WebElement getSearchBox() {
			
		return searchBox;
	}
	
	public WebElement getcreateFilter() {
		return createFilter;
	}
	// business logic
	/**
	*  this method will create organization with mandatory field
	* @param orgName
	 * @return 
	*/
	
	
	
	public String capBillAdd() {
		 return billAdd.getText();
		
	}
	public void FilterDown() {
		WebDriverUtility WebLib = new WebDriverUtility();
		WebLib.select(driver.findElement(By.xpath("//td//input[@name='viewName']")), "All");
	}
	
	public void CreateFilter() {
		 createFilter.click();
		 saveBtn.click();
		 
	}
	public void clickoncreateOrganization()
	{
		getOrgImg().click();
	}
	
	public String CaptureOrgName() {
		return orgNameEdt.getText();
	
	}
	public String HoverMsg() {
		return OrgImg.getAttribute("title");
		
	}

	/**
	*  this method will create organization by choosing a industry type
	* @param orgName
	* @param indType
	*/
	public void createOrganizationWithIndustry(String orgName, String indType)
	{
	orgNameEdt.sendKeys(orgName);
	select(industryDropdown, indType);
	saveBtn.click();
	}

	/**
	* this method will create organization by choosing a type
	* @param orgName
	* @param typeInfo
	*/
	public void createOrganizationWithType(String orgName, String typeInfo)
	{
	orgNameEdt.sendKeys(orgName);
	select(typeDropdown, typeInfo);
	saveBtn.click();
	}
	 public void enterOrgName(String orgName) {
		 getOrgNameEdt().sendKeys(orgName);
	 }
		 
		// public String PutOrgnName(String orgname) {
	//		 return putOrg.sendKeys(orgName);
		// }
	 
	 public void OrgName_Add(String Add, String orgName) {
		 getOrgNameEdt().sendKeys(orgName);
		 getbillAdd().sendKeys(Add);
		 saveBtn.click();
	 }
		
	public void AdvSearchOrg(String orgName) {
		getAdvSearch().sendKeys(orgName);
		
	
	}
	public void bothTY_Ind(String indType, String typeInfo,String orgName1) {
		orgNameEdt.sendKeys(orgName1);
		select(industryDropdown, indType);
		select(typeDropdown, typeInfo);
		saveBtn.click();
		deleteBtn.click();
		
		
	}
	
	public void OrgName_WoAdd(String orgName) {
		 getOrgNameEdt().sendKeys(orgName);
		
		 saveBtn.click();
	}

	 
		
}
	