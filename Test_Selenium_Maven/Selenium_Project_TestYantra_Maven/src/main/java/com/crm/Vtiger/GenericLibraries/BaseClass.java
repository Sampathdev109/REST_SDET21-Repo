package com.crm.Vtiger.GenericLibraries;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.crm.Vtiger.ObjectRepostory.HomePage;
import com.crm.Vtiger.ObjectRepostory.LoginPage;
import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	public WebDriverUtility WLib = new WebDriverUtility();
	public JavaUtility JLib = new JavaUtility();
	public JsonFileUtility JsonLib = new JsonFileUtility();
	public DataBaseUtility DBLib = new DataBaseUtility();
//	public ExcelFileUtility ELib = new ExcelFileUtility();
	
	
	
	public static WebDriver driver;
		@BeforeSuite
		public void bsConfi() throws Throwable {
			//DBLib.connectToDB();
			System.out.println("=============DB Connection Established==========");
		}
		//@Parameters ("Browser")
		@BeforeClass
		public void LaunchBrowser() throws Throwable {
			
			System.out.println("==============Launching Browser=============");
			
			String URL = JsonLib.ReadDataJson("url");
			String BROWSER = JsonLib.ReadDataJson("browser");
		
			if(BROWSER.equalsIgnoreCase("Chrome")) {
				//WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				
			}
			else if(BROWSER.equalsIgnoreCase("FireFox")) {
				//WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				
			}
					
			else {
				System.out.println("Invalid Browser");
			}
			driver.get(URL);
			
		}
		@BeforeMethod
		public void LoginApp () throws Throwable {
			String USERNAME = JsonLib.ReadDataJson("username");
			String PASSWORD = JsonLib.ReadDataJson("password");
			LoginPage lp = new LoginPage(driver);
			lp.Login(USERNAME, PASSWORD);
			
		}
		
		@AfterMethod
		public void LogOut() throws Throwable {
			
			HomePage hp = new HomePage(driver);
			hp.clickonSignOut(driver);
		}
		
		@AfterClass
		public void CloseBrowser() {
		{
		driver.close();
		}}
		
		@AfterSuite
		public void dbClose() throws Throwable {
			//DBLib.closeDB();
			System.out.println("DataBase Connection Ended");
		}

public void CaptureScreenShot(WebDriver driver, String screenshotName) throws IOException {
	TakesScreenshot ts = (TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dst = new File("./screenshot/"+ screenshotName+".PNG");
	Files.copy(src, dst);
		
} 
public String TakesScreenShot (String name) throws IOException {
	File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String dstfile = System.getProperty("user.dir")+"/screenshotName/" + name+ ".png";
	File finaldst = new File(dstfile);
	FileUtils.copyFile(srcfile, finaldst);
	return dstfile;
}
}