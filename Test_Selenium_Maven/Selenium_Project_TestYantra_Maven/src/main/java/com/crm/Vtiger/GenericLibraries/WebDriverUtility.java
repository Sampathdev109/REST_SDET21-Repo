package com.crm.Vtiger.GenericLibraries;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;



/**
 * This class consist of methods on WebDriver
 * @author SAMPATHDEV
 *
 */

public class WebDriverUtility {
	public WebDriver driver;
	
	//
	//public WebDriver instanceBrowser() {
	//	return driver;
//	}
	//static {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\SAMPATHDEV\\eclipse-workspace\\Selenium_Project_TestYantra_Maven\\src\\main\\resources\\chromedriver.exe");
	//}
	//private static final String WebElement = null;
	
	/**
	 * This method will wait for the page to load
	 * @param drivers
	 */
	
	public WebDriver selectBrowser(String BROWSER) {
		WebDriver driver = null;
		driver = this.driver;
		if(BROWSER.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}
		else if(BROWSER.equalsIgnoreCase("FireFox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		}
				
		else {
			System.out.println("Invalid Browser");
		}
		return driver;
		
	}

	public void waitForPageLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
		public WebDriver maximize(WebDriver driver) {
			driver.manage().window().maximize();
			return driver;
		}
		/**
		 * Using Index
		 * @param element
		 * @param value
		 */
		public void select(WebElement element, String value) {
			Select sel = new Select(element);
			sel.selectByVisibleText(value);
		}
	
		/**
		 * Using Index
		 * @param element
		 * @param value
		 */
		
		public void select(WebElement element, int index) {
			Select sel = new Select(element);
			sel.selectByIndex(index);
		}
		/**
		 * Using MoveOver method using actions class
		 * @param webElement
		 * @param value
		 */
		
	
		public void mouseOver(WebDriver driver, WebElement webElement) {
			Actions act = new Actions(driver);
			act.moveToElement((WebElement) webElement).perform();
		
		}
		
		public void mouseOverSingle() {
			Actions act = new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath("//select[@id='viewname']")));
		}
		public void rightClick(WebDriver driver, WebElement element) {
			Actions act = new Actions(driver);
			act.contextClick(element).perform();
		}
		public void doubleClick(WebDriver driver, WebElement element) {
			Actions act = new Actions(driver);
			act.doubleClick(element).perform();
		}
		public void acceptAlert(WebDriver driver)
		{
			driver.switchTo().alert().accept();
	
		}
		public void dismissAlert(WebDriver driver)
		{
			driver.switchTo().alert().dismiss();
		}
		public void switchToFrame(WebDriver driver, int index)
		{
			driver.switchTo().frame(index);
		}
		public void switchToFrame(WebDriver driver, String frameid)
		{
			driver.switchTo().frame(frameid);
		}
		public void switchToFrame(WebDriver driver, WebElement frameElement)
		{
			driver.switchTo().frame(frameElement);
		}
			public void switchToWindow(WebDriver driver, String partialWinTitle)
			   {
				   Set<String> window = driver.getWindowHandles();
				   Iterator<String> it = window.iterator();
				   while(it.hasNext())
				   {
					   String winId=it.next();
					   String title=driver.switchTo().window(winId).getTitle();
			           if(title.contains(partialWinTitle));
		} }
	    public void waitForElementVisibility(WebDriver driver,WebElement element)
		   {
			  WebDriverWait wait = new WebDriverWait(driver, 20);
			  wait.until(ExpectedConditions.visibilityOf(element));
		   }
	    public void waitForElementClickable(WebDriver driver,WebElement element) {
	    	WebDriverWait wait = new WebDriverWait(driver, 20);
	    	wait.until(ExpectedConditions.elementToBeClickable(element));
	    }
	    public void waitForElementPresence(WebDriver driver,WebElement element) {
	    	WebDriverWait wait = new WebDriverWait(driver, 20);
	    	wait.until(ExpectedConditions.presenceOfElementLocated((By) element));
}}
	    
	   
		


