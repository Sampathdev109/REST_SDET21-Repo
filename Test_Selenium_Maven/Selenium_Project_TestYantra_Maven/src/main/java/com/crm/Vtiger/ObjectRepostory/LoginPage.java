package com.crm.Vtiger.ObjectRepostory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

/*
 * create a seperate class for all webpages
 */
// create a constructor and use PageFactory class
public class LoginPage {

	public LoginPage (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
		@FindBy(name="user_name")
		private WebElement userNameEdit;
		
		@FindBy(name="user_password")
		private WebElement passwordEdit;
		
		@FindBy(id="submitButton")
		private WebElement LoginBtn;
		
		/*
		 * Using Getter function to access private members (Encapsulated ones)
		 */
		public WebElement getUserNameEdit()
		{
			return userNameEdit;
		}
		
		public WebElement getUSerPasswordEdit() 
		
		{
			return passwordEdit;
			
		}
		
		public WebElement getLoginBtn()
		{
			return LoginBtn;
			
		}
		
		//This method can be called whenever login feature is to be tested.
		public void Login(String username, String password)
		{
			userNameEdit.sendKeys(username);
			passwordEdit.sendKeys(password);
			LoginBtn.click();
			
		}
	}
