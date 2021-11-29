package com.crm.Vtiger.ObjectRepostory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.Vtiger.GenericLibraries.BaseClass;
import com.crm.Vtiger.GenericLibraries.WebDriverUtility;

public class CreateFilterPage extends WebDriverUtility{
	
	public CreateFilterPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@name='viewName']")
	private WebElement InputFilter;

	@FindBy(xpath= "//input[@title='title=']")
	private WebElement saveFilter;

    public WebElement getInputFilter() {
	return InputFilter;
	}
	
	public WebElement getSaveBtn() {
		return saveFilter;
	}
	
    public void InputFilterAct() {
	 InputFilter.sendKeys("qwerty");
	 saveFilter.click();
    }}
