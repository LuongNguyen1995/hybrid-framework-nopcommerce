package com.jquery;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import pageObject.jQuery.dataTable.HomePageObject;
import pageObject.jQuery.dataTable.PageGeneratorManager;

public class Level_10_DataTable_DataGrid extends BaseTest{
	private WebDriver driver;
	
	HomePageObject homePage;
	List<String> actualAllCountryValue;
	List<String> expectedAllCountryValue;
	
	@Parameters({"envName", "serverName", "browser", "ipAddress", "portNumber", "osName", "osVersion"})
	@BeforeClass
	public void beforeClass(@Optional("local")  String envName, @Optional("dev")String serverName,@Optional("Chrome") String browserName,@Optional("localhost") String ipAddress, @Optional("4444")String portNumber, @Optional("Windows")String osName, @Optional("10")String osVersion) {
		driver = getBrowserDriver(envName, serverName, browserName, ipAddress, portNumber, osName, osVersion);
		homePage = PageGeneratorManager.getHomePage(driver);

	}
	
	//@Test 
	public void Table_01_() { 
		homePage.openPagingByPageNumber("10");
		homePage.sleepInSecond(1);
		Assert.assertTrue(homePage.isPageNumberActive("10"));
		
		homePage.openPagingByPageNumber("20");
		homePage.sleepInSecond(1);
		Assert.assertTrue(homePage.isPageNumberActive("20"));
		
		homePage.openPagingByPageNumber("5");
		homePage.sleepInSecond(1);
		Assert.assertTrue(homePage.isPageNumberActive("5"));
		
		homePage.openPagingByPageNumber("1");
		homePage.sleepInSecond(1);
		Assert.assertTrue(homePage.isPageNumberActive("1"));
	}
	
	//@Test
	public void Table_02_Enter_To_Header() {
		homePage.refreshCurrentPage(driver);
		
		homePage.enterToHeaderTextboxByLabel("Females","338282");
		homePage.enterToHeaderTextboxByLabel("Country","Argentina");
		homePage.enterToHeaderTextboxByLabel("Males","349238");
		homePage.enterToHeaderTextboxByLabel("Total","687522");
		homePage.sleepInSecond(3);
		homePage.refreshCurrentPage(driver);
		homePage.enterToHeaderTextboxByLabel("Females","276880");
		homePage.enterToHeaderTextboxByLabel("Country","Angola");
		homePage.enterToHeaderTextboxByLabel("Males","276472");
		homePage.enterToHeaderTextboxByLabel("Total","553353");
		homePage.sleepInSecond(3);
	}
	
	//@Test
	public void Table_03_Enter_To_Header() {
		
		//?????c d??? li???u c???a file country.txt ra
		//L??u d??? li???u v??o 1 List<String> = Expected Value = expectedAllCountryValue
		
		//Actual Value
		actualAllCountryValue = homePage.getValueEachRowAtAllPage();
		Assert.assertEquals(actualAllCountryValue, expectedAllCountryValue);
	}
	
	@Test
	public void Table_04_Enter_Action_At_Any_Row() {
		homePage.clickToLoadButton();
		homePage.sleepInSecond(5);
		//Value ????? nh???p d??? li???u - tham s??? 1
		//Row number : T???i row n??o
		//Ex : Nh???p v??o testbox t???i d??ng s??? 3/4/5
		//Column Name : Album/Artist/Year/Price
		homePage.enterToTextboxAtColumnNamerByRowNumber("Album","2","Michael 97");
		homePage.sleepInSecond(1);
		homePage.enterToTextboxAtColumnNamerByRowNumber("Artist","4","Michael Jackson");
		homePage.sleepInSecond(1);
		homePage.enterToTextboxAtColumnNamerByRowNumber("Year","3","1997");
		homePage.sleepInSecond(1);
		homePage.enterToTextboxAtColumnNamerByRowNumber("Price","1","150");
		homePage.sleepInSecond(1);
		homePage.selectDropdownByColumnNameAtRowNumber("Origin","5","Japan");
		homePage.sleepInSecond(3);
		
		homePage.checkToCheckboxByColumnNameAtRowNumber("With Poster?","3");
		homePage.checkToCheckboxByColumnNameAtRowNumber("With Poster?","5");
		homePage.sleepInSecond(1);
		homePage.uncheckToCheckboxByColumnNameAtRowNumber("With Poster?","1");
		homePage.uncheckToCheckboxByColumnNameAtRowNumber("With Poster?","2");
		homePage.uncheckToCheckboxByColumnNameAtRowNumber("With Poster?","4");
		homePage.sleepInSecond(1);
		
		homePage.clickToIconByRowNumber("1", "Remove Current Row");
		homePage.sleepInSecond(1);
		homePage.clickToIconByRowNumber("1", "Insert Row Above");
		homePage.sleepInSecond(1);
		homePage.clickToIconByRowNumber("3", "Move Up");
		homePage.sleepInSecond(1);
		homePage.clickToIconByRowNumber("1", "Move Down");
		homePage.sleepInSecond(1);
		homePage.clickToIconByRowNumber("5", "Remove Current Row");
		homePage.sleepInSecond(1);
		homePage.clickToIconByRowNumber("4", "Remove Current Row");
		homePage.sleepInSecond(1);
		homePage.clickToIconByRowNumber("3", "Remove Current Row");
		homePage.sleepInSecond(1);
		homePage.clickToIconByRowNumber("2", "Remove Current Row");
		homePage.sleepInSecond(1);
		homePage.clickToIconByRowNumber("1", "Remove Current Row"); 
		homePage.sleepInSecond(1);
	}
	
	@AfterClass 
	public void afterClass() {
		//driver.quit();
	}
}
