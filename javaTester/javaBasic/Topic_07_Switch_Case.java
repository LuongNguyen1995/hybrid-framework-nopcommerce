package javaBasic;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Topic_07_Switch_Case {
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	Scanner scanner = new Scanner(System.in);
	
	@Parameters("browser")
	//@Test
	public void TC_01_Switch_Case(String browserName) {
		driver = getBrowserDriver(browserName);
		System.out.println(browserName);
		System.out.println(driver.toString());
		
		driver.quit();
	}
	
	public WebDriver getBrowserDriver(String browserName) {
		switch (browserName) {
		case "firefox":
			System.setProperty("webdriver.gecko.driver", projectPath + "\\browserDrivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case "chrome":
			System.setProperty("webdriver.chrome.driver", projectPath + "\\browserDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "edge":
			System.setProperty("webdriver.edge.driver", projectPath + "\\browserDrivers\\msedgedriver.exe");
			driver = new EdgeDriver();
			break;
		case "ie":
			System.setProperty("webdriver.ie.driver", projectPath + "\\browserDrivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			break;
		default:
			new RuntimeException("Please input correct the browser name!");
			break;
		}
		return driver;
	}
	
	//@Test
	public void TC_02() {
		int month = scanner.nextInt();
		switch (month) {
		case 1:
		case 3:	
		case 5:
		case 7:	
		case 8:
		case 10:
		case 12:
			System.out.println("Thang "+ month + " co 31 ngay!");
			break;
		case 4:
		case 6:	
		case 9:
		case 11:	
			System.out.println("Thang "+ month + " co 30 ngay!");
			break;
		case 2:	
			System.out.println("Thang "+ month + " co 28 hoac 29 ngay!");
			break;		
		default:
			System.out.println("Vui long nhap thang dung dinh dang!");
			break;
		}
		
	}
	
	//@Test
	public void TC_03() {
		//only convertible int/strings/enum variables are permitted
		//không dùng với các toán tử trong case : < , ==, >, !=
		int a = scanner.nextInt();
		switch (a) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		case 6:
			System.out.println("Six");
			break;
		case 7:
			System.out.println("Seven");
			break;
		case 8:
			System.out.println("Eight");
			break;
		case 9:
			System.out.println("Night");
			break;
		case 10:
			System.out.println("Ten");
			break;
		default:
			System.out.println("Vui long nhap trong khoang 1-10!");
			break;
		}
		
	}
	
	@Test
	public void TC_04() {
		int firstNumber = scanner.nextInt();
		int secondNumber = scanner.nextInt();
		String toanTu = scanner.next();
		
		switch (toanTu) {
		case "+":
			System.out.println("Tong 2 so la : "+ (firstNumber + secondNumber));
			break;
		case "-":
			System.out.println("Hieu 2 so la : "+ (firstNumber - secondNumber));
			break;
		case "*":
			System.out.println("Tich 2 so la : "+ (firstNumber * secondNumber));
			break;
		case "/":
			System.out.println("Thuong 2 so la : "+ (firstNumber / secondNumber));
			break;
		}
	}
	
	
}
