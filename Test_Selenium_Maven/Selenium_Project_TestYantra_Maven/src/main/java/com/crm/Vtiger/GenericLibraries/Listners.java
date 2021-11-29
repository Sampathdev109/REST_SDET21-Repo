package com.crm.Vtiger.GenericLibraries;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Listners implements ITestListener{
	ExtentReporter reporter;
	ExtentReports reports;
	ExtentTest test;

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		test = reports.createTest(result.getMethod().getMethodName());

	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		test.log(Status.PASS, result.getMethod().getMethodName()+" is passed");
		  
		  
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		test.log(Status.PASS, result.getMethod().getMethodName()+" is passed");

		  test.log(Status.FAIL, result.getName()+" is failed");
		  test.log(Status.FAIL, result.getThrowable());
		  BaseClass bs = new BaseClass();
		  try {
			String path = bs.TakesScreenShot(result.getName());
			test.addScreenCaptureFromPath(path);
			bs.TakesScreenShot(result.getMethod().getMethodName());
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		  test.log(Status.SKIP, result.getMethod().getMethodName()+" is skipped");

		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
//		JavaUtility JLib = new JavaUtility();
//		  String date = JLib.getCurrentDate();
		  
		  ExtentHtmlReporter reporter; // path of report and we can makechange to look and feel of report.
		  reporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/ExtentReportSdet/ExtentReport.html");
		  reporter.config().setDocumentTitle("Sdet-21");
		  reporter.config().setTheme(Theme.DARK);
		  reporter.config().setReportName("Regression");
		  
		 reports = new ExtentReports();
		 reports.attachReporter(reporter);
		 reports.setSystemInfo("BuildNo", "5.1");
		 reports.setSystemInfo("Env", "Pre-Prod");
		 reports.setSystemInfo("Platform", "Windows");
		 reports.setSystemInfo("Browser Version", "Chrome-93");
	
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		reports.flush();
	}

}
