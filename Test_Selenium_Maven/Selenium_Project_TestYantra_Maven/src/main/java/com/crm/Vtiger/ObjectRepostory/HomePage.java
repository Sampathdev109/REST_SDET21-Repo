package com.crm.Vtiger.ObjectRepostory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.Vtiger.GenericLibraries.WebDriverUtility;

public class HomePage extends WebDriverUtility{

		public HomePage (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
}

		@FindBy(linkText = "Organizations")
		private WebElement oganizationLink;
		
		@FindBy(linkText = "Contacts")
		private WebElement contactLink;
		
		@FindBy(linkText = "Leads")
		private WebElement leadLink;
		
		@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
		private WebElement administratorLink;
		
		@FindBy(xpath = "//a[@href='index.php?module=Users&action=Logout']")
		private WebElement signoutLink;
		
		@FindBy(linkText = "Products")
		private WebElement productLink;
		
		@FindBy(linkText = "Oppurtunities")
		private WebElement oppurtunitiesLink;
		
		@FindBy(linkText = "Email")
		private WebElement emailLink;
		
		@FindBy(xpath = "//input[@title='Edit [Alt+E]']")
		private WebElement EditBtn;
		
		/*
		 * Generate Getters for the private methods
		 */

		public WebElement getOganizationLink() {
			return oganizationLink;
		}

		public WebElement getContactLink() {
			return contactLink;
		}

		public WebElement getLeadLink() {
			return leadLink;
		}

		public WebElement getAdministratorLink() {
			return administratorLink;
		}

		public WebElement getSignoutLink() {
			return signoutLink;
		}

		public WebElement getProductLink() {
			return productLink;
		}

		public WebElement getOppurtunitiesLink() {
			return oppurtunitiesLink;
		}

		public WebElement getEmailLink() {
			return emailLink;
		}
		
		
		/*
		 * business logic
		 */
		public void clickonOrganizations() {
			
			oganizationLink.click();
		}
		public void clickonContacts() {
			
			contactLink.click();
		}
		public void clickonLeads() {
			
			leadLink.click();
		}
		
		public void clickonProducts() {
			
			productLink.click();
		}
		
		public void clickonEmail() {
			
			emailLink.click();
		}
		

		public void clickonOppurtunities() {
			
			oppurtunitiesLink.click();
		}
		
		public void clickonAdministrator() {
			
			administratorLink.click();
		}

		public void clickonSignOut(WebDriver driver) {
			//waitForElementVisibility(driver,administratorLink);
			waitForElementVisibility(driver,administratorLink);
			mouseOver(driver, administratorLink);
			signoutLink.click();
		}
		

		
}
