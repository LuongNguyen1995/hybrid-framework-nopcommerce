package com.nopcommerce.user;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import pageObjects.nopCommerce.user.UserHomePageObject;
import pageObjects.nopCommerce.user.UserRegisterPageObject;

public class Level_20_Independency_Test extends BaseTest {
	private String firstName, lastName, emailAddress, password;
	private WebDriver driver;
	
	private UserHomePageObject homePage;
	private UserRegisterPageObject registerPage;
	
	@Parameters({"browser", "url"})
	@BeforeMethod
	public void beforeMethod(String browserName, String appUrl) {
		System.out.println("Run on "+browserName);
		driver = getBrowserDriverLocal(browserName);
		
		homePage = new UserHomePageObject(driver);
		registerPage = new UserRegisterPageObject(driver);
		firstName = "Automation";
		lastName = "FC";
		emailAddress = "afc" + generateFakeNumber() + "@mail.vn";
		password = "123456";
		System.out.println("Register_01 - Step 01 : Click to Register link");
		homePage.openRegisterPage();
	}
	
	@Test 
	public void Register_01_Empty_Data() { 
		

		System.out.println("Register_01 - Step 02 : Click to Register button");
		registerPage.clickToRegisterButton();
		
		System.out.println("Register_01 - Step 03 : Verify error message displayed");
		Assert.assertEquals(registerPage.getErrorMessageAtFirstnameTextbox(),"First name is required.");
		Assert.assertEquals(registerPage.getErrorMessageAtLastnameTextbox(),"Last name is required.");
		Assert.assertEquals(registerPage.getErrorMessageAtEmailTextbox(),"Email is required.");
		Assert.assertEquals(registerPage.getErrorMessageAtPasswordTextbox(),"Password is required.");
		Assert.assertEquals(registerPage.getErrorMessageAtConfirmPasswordTextbox(),"Password is required.");
		
	}
	
	@Test
	public void Register_02_Invalid_Email() {
		
		
		System.out.println("Register_02 - Step 02 : Input to require fields");
		registerPage.inputToFirstnameTextbox(firstName);
		registerPage.inputToLastnameTextbox(lastName);
		registerPage.inputToEmailTextbox("bgfjkewng@fsdkljgvk");
		registerPage.inputToPasswordTextbox(password);
		registerPage.inputToConfirmPasswordTextbox(password);
		
		System.out.println("Register_02 - Step 03 : Click to Register link");
		registerPage.clickToRegisterButton();
		
		Assert.assertEquals(registerPage.getErrorMessageAtMainRegisterTexbox(),"Wrong email");
//		Assert.assertEquals(getElementText(driver, "//div[@class='message-error validation-summary-errors']//li"), "Wrong email");
	}
	
	@Test
	public void Register_03_Success() {
		
		
		System.out.println("Register_03 - Step 02 : Input to require fields");
		registerPage.inputToFirstnameTextbox(firstName);
		registerPage.inputToLastnameTextbox(lastName);
		registerPage.inputToEmailTextbox(emailAddress);
		registerPage.inputToPasswordTextbox(password);
		registerPage.inputToConfirmPasswordTextbox(password);
		
		System.out.println("Register_03 - Step 03 : Click to Register link");
		registerPage.clickToRegisterButton();
		
		System.out.println("Register_03 - Step 04 : Verify success message displayed");
		Assert.assertEquals(registerPage.getRegisterSuccessMessage(), "Your registration completed");
		
		System.out.println("Register_03 - Step 05 : Click to Logout link");
		registerPage.clickToLogoutLink();
	}
	
	@Test
	public void Register_04_Existing_Email() {
		
		System.out.println("Register_04 - Step 02 : Input to require fields");
		registerPage.inputToFirstnameTextbox(firstName);
		registerPage.inputToLastnameTextbox(lastName);
		registerPage.inputToEmailTextbox(emailAddress);
		registerPage.inputToPasswordTextbox(password);
		registerPage.inputToConfirmPasswordTextbox(password);
		
		System.out.println("Register_04 - Step 03 : Click to Register link");
		registerPage.clickToRegisterButton();
		
		System.out.println("Register_04 - Step 04 : Verify message on main Register Page");
		Assert.assertEquals(registerPage.getErrorMessageAtMainRegisterTexbox(),"The specified email already exists");
	}
	
	@Test
	public void Register_05_Password_Less_Than_6_Chars() {
		
		System.out.println("Register_05 - Step 02 : Input to require fields");
		registerPage.inputToFirstnameTextbox(firstName);
		registerPage.inputToLastnameTextbox(lastName);
		registerPage.inputToEmailTextbox(emailAddress);
		registerPage.inputToPasswordTextbox("123");
		registerPage.inputToConfirmPasswordTextbox(password);
		
		System.out.println("Register_05 - Step 03 : Click to Register link");
		registerPage.clickToRegisterButton();
		
		System.out.println("Register_05 - Step 04 : Verify error message display");
		Assert.assertEquals(registerPage.getErrorMessageAtPasswordTextbox(),"Password must meet the following rules:\nmust have at least 6 characters");
		
	}
	
	@Test
	public void Register_06_Invalid_Confirm_Password() {
		
		System.out.println("Register_06 - Step 02 : Input to require fields");
		registerPage.inputToFirstnameTextbox(firstName);
		registerPage.inputToLastnameTextbox(lastName);
		registerPage.inputToEmailTextbox(emailAddress);
		registerPage.inputToPasswordTextbox(password);
		registerPage.inputToConfirmPasswordTextbox("544353");
		
		System.out.println("Register_06 - Step 03 : Click to Register link");
		registerPage.clickToRegisterButton();
		
		System.out.println("Register_06 - Step 04 : Verify message on main Register Page");
		Assert.assertEquals(registerPage.getErrorMessageAtConfirmPasswordTextbox(),"The password and confirmation password do not match.");
	}
	

	@AfterMethod 
	public void afterMethod() {
		driver.quit();
	}
	
	public int generateFakeNumber() {
		Random rand = new Random();
		return rand.nextInt(9999);
	}

}
