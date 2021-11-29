package com.crm.Vtiger.ObjectRepostory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.Vtiger.GenericLibraries.BaseClass;

public class OrganizationInfoPage extends BaseClass{

	public OrganizationInfoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	// private locators
	@FindBy(id="dtlview_Organization Name")
	private WebElement organizationInfo;

	@FindBy(xpath= "//span[@id='dtlview_Organization Name']")
	private WebElement CaptureName;
	
	@FindBy(id="dtlview_Industry")
	private WebElement industryInfo;
	
	@FindBy(id ="mouseArea_Billing Address")
	private WebElement BillInfo;

	@FindBy(id="dtlview_Type")
	private WebElement organizationTypeInfo;
	
	@FindBy(xpath = "//input[@title='Edit [Alt+E]']")
	private WebElement EditBtn;
	

	// getters for locators

	public WebElement getEditBtn() {
		return EditBtn;
	}
	
	public WebElement getOrgName() {
		return CaptureName;
	}
	
	public WebElement getOrganizationInfo() {
	return organizationInfo;
	}

	public WebElement getIndustryInfo() {
	return industryInfo;
	}
	public WebElement getBillInfo() {
		return BillInfo;
	}
	public WebElement getOrganizationTypeInfo() {
	return organizationTypeInfo;
	}

	// business logic
	/**
	* this method will give organization name
	* @return
	*/
	public String getOrganizationInformation()
	{
	return organizationInfo.getText();
	}

	/**
	* this method will give organization industry
	* @return
	*/
	public String getIndustryInformation()
	{
	return industryInfo.getText();
	}

	/**
	* this method will give organization type
	* @return
	*/
	public String getTypeInformation()
	{
	return organizationTypeInfo.getText();
	}
	
	public String getBillInfomation()
	{
		return BillInfo.getText().trim();
	}
	
	public String CaptureOrgName() {
		return CaptureName.getText();
	}}

