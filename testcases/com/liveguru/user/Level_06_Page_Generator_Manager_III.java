package com.liveguru.user;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import pageObjects.liveGuru.HomePageObject;
import pageObjects.liveGuru.LoginPageObject;
import pageObjects.liveGuru.MyDashboardPageObject;
import pageObjects.liveGuru.RegisterPageObject;

public class Level_06_Page_Generator_Manager_III extends BaseTest{
	private WebDriver driver;
	private HomePageObject homePage;
	private LoginPageObject loginPage;
	private RegisterPageObject registerPage;
	private MyDashboardPageObject myDashboardPage;
	
	
	@Parameters({"envName", "serverName", "browser", "ipAddress", "portNumber", "osName", "osVersion"})
	@BeforeClass
	public void beforeClass(@Optional("local")  String envName, @Optional("dev")String serverName,@Optional("Chrome") String browserName,@Optional("localhost") String ipAddress, @Optional("4444")String portNumber, @Optional("Windows")String osName, @Optional("10")String osVersion) {
		driver = getBrowserDriver(envName, serverName, browserName, ipAddress, portNumber, osName, osVersion);
		

	}
	
	@Test 
	public void User_01_Register_To_System() { 
		
	}
	
	@Test
	public void Login_02_Login_To_System() {
		
	}

	@AfterClass 
	public void afterClass() {
		driver.quit();
	}
}
