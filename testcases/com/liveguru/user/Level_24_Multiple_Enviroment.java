package com.liveguru.user;


import org.aeonbits.owner.ConfigFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import enviromentConfig.Enviroment;

public class Level_24_Multiple_Enviroment extends BaseTest{
	
	Enviroment enviroment;
	
	@Parameters({"envName", "serverName", "browser", "ipAddress", "portNumber", "osName", "osVersion"})
	@BeforeClass
	public void beforeClass(@Optional("local")  String envName, @Optional("dev")String serverName,@Optional("Chrome") String browserName,@Optional("localhost") String ipAddress, @Optional("4444")String portNumber, @Optional("Windows")String osName, @Optional("10")String osVersion) {
		enviroment = ConfigFactory.create(Enviroment.class);
		driver = getBrowserDriver(envName, serverName, browserName, ipAddress, portNumber, osName, osVersion);
		System.out.println(enviroment.osName());
		System.out.println(driver.getCurrentUrl());
	}
	
	@Test 
	public void Employee_01_Add_New_Employee() { 

	}
	
	@Test 
	public void Employee_02_Upload_Avatar() { 
		
	}
	
	@Test 
	public void Employee_03_Personal_Details() { 
	}
	
	@Test 
	public void Employee_04_Contact_Details() { 
	}
	
	@Test 
	public void Employee_05_Emergency_Details() { 
		
	}
	
	@Test 
	public void Employee_06_Assigned_Dependents() { 
		
	}
	
	@Test 
	public void Employee_07_Edit_View_Job() { 
	
	}
	
	@Test 
	public void Employee_08_Edit_View_Salary() { 

	}
	
	@Test 
	public void Employee_09_Edit_View_Tax() { 

	}
	
	@Test 
	public void Employee_10_Qualifications() { 
		
	}
	
	@Test 
	public void Employee_11_Search_Employee() { 

	}
	
	
	@AfterClass (alwaysRun= true)
	public void afterClass() {
		closeBrowserAndDriver("local");
	}
}
