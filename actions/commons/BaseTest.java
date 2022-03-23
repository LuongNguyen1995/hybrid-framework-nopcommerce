package commons;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.Assert;
import org.testng.Reporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	private String projectPath = System.getProperty("user.dir");
	protected WebDriver driver;
	
	protected WebDriver getBrowserDriver(String browserName) {
		if (browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browserName.equals("h_firefox")) {
			WebDriverManager.firefoxdriver().setup();
			//Browser Option : Selenium 3.xx
			FirefoxOptions options = new FirefoxOptions();
			options.addArguments("--headless");
			options.addArguments("window-size=1920x1080");
			driver = new FirefoxDriver(options);
			
		} else if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equals("h_chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--headless");
			options.addArguments("window-size=1920x1080");
			driver = new ChromeDriver(options);
			
		} else if (browserName.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (browserName.equals("opera")) {
			WebDriverManager.operadriver().setup();
			driver = new OperaDriver();
		}else if (browserName.equals("coccoc")) {
			//Cốc cốc browser trừ đi 5-6 ver ra chrome driver (recommend 6)
			WebDriverManager.chromedriver().driverVersion("97.0.4692.71").setup();
			ChromeOptions options = new ChromeOptions();
			if (GlobalConstants.OS_NAME.startsWith("Windows")) {
				options.setBinary("C:\\Program Files\\CocCoc\\Browser\\Application\\browser.exe");
			}else {
				options.setBinary("...");
			}
			driver = new ChromeDriver(options);
			
		}else if (browserName.equals("brave")) {
			//Brave browser ver nào thì dùng chrome driver ver đó
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
			driver = new ChromeDriver(options);
			
		} else {
			throw new RuntimeException("Browser name invalid.");
		}
		
		driver.manage().timeouts().implicitlyWait(GlobalConstants.LONG_TIMEOUT, TimeUnit.SECONDS);
		driver.get(GlobalConstants.PORTAL_PAGE_URL);
		
		return driver;
	}
	
	protected WebDriver getBrowserDriver(String browserName, String appUrl) {
		if (browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browserName.equals("h_firefox")) {
			WebDriverManager.firefoxdriver().setup();
			//Browser Option : Selenium 3.xx
			FirefoxOptions options = new FirefoxOptions();
			options.addArguments("--headless");
			options.addArguments("window-size=1920x1080");
			driver = new FirefoxDriver(options);
			
		} else if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equals("h_chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--headless");
			options.addArguments("window-size=1920x1080");
			driver = new ChromeDriver(options);
			
		} else if (browserName.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (browserName.equals("opera")) {
			WebDriverManager.operadriver().setup();
			driver = new OperaDriver();
		}else if (browserName.equals("coccoc")) {
			//Cốc cốc browser trừ đi 5-6 ver ra chrome driver (recommend 6)
			WebDriverManager.chromedriver().driverVersion("97.0.4692.71").setup();
			ChromeOptions options = new ChromeOptions();
			if (GlobalConstants.OS_NAME.startsWith("Windows")) {
				options.setBinary("C:\\Program Files\\CocCoc\\Browser\\Application\\browser.exe");
			}else {
				options.setBinary("...");
			}
			driver = new ChromeDriver(options);
			
		}else if (browserName.equals("brave")) {
			//Brave browser ver nào thì dùng chrome driver ver đó
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
			driver = new ChromeDriver(options);
			
		} else {
			throw new RuntimeException("Browser name invalid.");
		}
		
		driver.manage().timeouts().implicitlyWait(GlobalConstants.LONG_TIMEOUT, TimeUnit.SECONDS);
		driver.get(appUrl);
		
		return driver;
	}
	
	protected String getEnviromentUrl(String serverName) {
		String envUrl = null;
		EnviromentList enviroment = EnviromentList.valueOf(serverName.toUpperCase());
		if (enviroment == EnviromentList.DEV ) {
			envUrl = "https://demo.nopcommerce.com";
		}else if (enviroment == EnviromentList.TESTING) {
			envUrl = "https://admin-demo.nopcommerce.com";
		}else if (enviroment == EnviromentList.STAGING) {
			envUrl = "https://staging.orangehrmlive.com";
		}else if (enviroment == EnviromentList.PRODUCTION) {
			envUrl = "https://production.orangehrmlive.com";
		}
		return envUrl;
	}

	public int generateFakeNumber() {
		Random rand = new Random();
		return rand.nextInt(9999);
	}
	
	protected boolean verifyTrue (boolean condition) {
		boolean pass = true;
		try {
			Assert.assertTrue(condition);
			System.out.println(" -------------------------- PASSED -------------------------- ");
		} catch (Throwable e) {
			System.out.println(" -------------------------- FAILED -------------------------- ");
			pass = false;

			// Add lỗi vào ReportNG
			VerificationFailures.getFailures().addFailureForTest(Reporter.getCurrentTestResult(), e);
			Reporter.getCurrentTestResult().setThrowable(e);
		}
		return pass;
	}

	protected boolean verifyFalse(boolean condition) {
		boolean pass = true;
		try {
			Assert.assertFalse(condition);
			System.out.println(" -------------------------- PASSED -------------------------- ");
		} catch (Throwable e) {
			System.out.println(" -------------------------- FAILED -------------------------- ");
			pass = false;
			VerificationFailures.getFailures().addFailureForTest(Reporter.getCurrentTestResult(), e);
			Reporter.getCurrentTestResult().setThrowable(e);
		}
		return pass;
	}

	protected boolean verifyEquals(Object actual, Object expected) {
		boolean pass = true;
		try {
			Assert.assertEquals(actual, expected);
			System.out.println(" -------------------------- PASSED -------------------------- ");
		} catch (Throwable e) {
			pass = false;
			System.out.println(" -------------------------- FAILED -------------------------- ");
			VerificationFailures.getFailures().addFailureForTest(Reporter.getCurrentTestResult(), e);
			Reporter.getCurrentTestResult().setThrowable(e);
		}
		return pass;
	}
	
	
}