package pageObjects.hrm;

import org.openqa.selenium.WebDriver;

public class PageGenerator {
	
	public static PageGenerator getPageGenerator() {
		return new PageGenerator();
	}
	
	public LoginPO getLoginPage(WebDriver driver) {
		return new LoginPO(driver);
	}
	
	public AddEmployeePO getAddEmployeePage(WebDriver driver) {
		return new AddEmployeePO(driver);
	}
	
	public DashboardPO getDashboardPage(WebDriver driver) {
		return new DashboardPO(driver);
	}
	
	public EmployeeListPO getEmployeeListPage(WebDriver driver) {
		return new EmployeeListPO(driver);
	}

	public MyInfoPO getMyInfoPage(WebDriver driver) {
		return new MyInfoPO(driver);
	}
}
