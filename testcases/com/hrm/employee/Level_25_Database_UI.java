package com.hrm.employee;


import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import commons.GlobalConstants;
import pageObjects.hrm.AddEmployeePO;
import pageObjects.hrm.DashboardPO;
import pageObjects.hrm.EmployeeListPO;
import pageObjects.hrm.LoginPO;
import pageObjects.hrm.MyInfoPO;
import pageObjects.hrm.PageGenerator;
import retryConfig.RetryListener;
import utilities.DataUtil;

public class Level_25_Database_UI extends BaseTest{
	WebDriver driver;
	LoginPO loginPage;
	AddEmployeePO addEmployeePage;
	DashboardPO dashboardPage;
	EmployeeListPO employeeListPage;
	MyInfoPO myInfoPage;
	DataUtil fakeData;
	String employeeID, statusValue;
	String adminUserName, adminPassword;
	
	@Parameters({"browser", "url"})
	@BeforeClass
	public void beforeClass(String browserName, String appUrl) {
		log.info("Pre-Condition - Step 01: Open browser '"+ browserName +"' and navigate to '"+ appUrl +"'");
		driver = getBrowserDriver(browserName, appUrl);
		loginPage = PageGenerator.getLoginPage(driver);
		fakeData = DataUtil.getData();
		
		statusValue = "Enabled";
		adminUserName = "Admin";
		adminPassword = "admin123";
		
		log.info("Pre-Condition - Step 02: Login with Admin role");

		dashboardPage = loginPage.loginToSystem(driver, adminUserName, adminPassword);
		showBrowserConsoleLog(driver);
	}
	
	@Test 
	public void Employee_Search() throws SQLException { 
		log.info("Employee_Search_01 - Step 01 : Get Employee Size on UI");
		int employeeListNumberUI = dashboardPage.getEmployeeListNumberUI();
		
		log.info("Employee_Search_01 - Step 02 : Get Employee Size on DB");
		int employeeListNumberDB = dashboardPage.getEmployeeListNumberDB();
		
		log.info("Employee_Search_01 - Step 03 : Verify Employee size in UI and DB are equals");
		verifyEquals(employeeListNumberUI, employeeListNumberDB);

	}
	
	
	
	@AfterClass (alwaysRun= true)
	public void afterClass() {
		closeBrowserAndDriver();
	}
}
