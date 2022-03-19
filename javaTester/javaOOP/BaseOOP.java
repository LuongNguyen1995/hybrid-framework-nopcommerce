package javaOOP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class BaseOOP extends SeleniumWebDriver{

	public long shortTimeout = 15;
	protected long longTimeout = 45;
	private WebDriver driver;
	
	public BaseOOP() {
		System.out.println("Contructor in parent class");
	}
	
	public BaseOOP(String name) {
		System.out.println("Contructor in parent class" + name);
	}
	
	public BaseOOP(int number) {
		System.out.println("Contructor in parent class" + number);
	}
	
	public void setImplicitWait() {
		driver.manage().timeouts().implicitlyWait(longTimeout, TimeUnit.SECONDS);
		
	
	}
}
