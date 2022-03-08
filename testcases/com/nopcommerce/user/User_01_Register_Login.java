package com.nopcommerce.user;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class User_01_Register_Login {
	//Biến toàn cục
	String homePageUrl = "";
	@BeforeClass
	public void beforeClass() {
	
	
	}
	
	@Test
	public void TC_01() {
		//Biến cục bộ : Sử dụng trong phạm vi của hàm TC_01
	String homePageUrl ="";
	System.out.println(homePageUrl);
	
	//Block Code
	if (3<5) {
		//Cục bộ và chỉ sử dụng trong hàm if
		String homePageTitle = "";
		System.out.println(homePageTitle);
		
	}
	}

	@Test
	public void TC_02() {
		System.out.println(homePageUrl);
	}

	@AfterClass
	public void afterClass() {
	}

}
