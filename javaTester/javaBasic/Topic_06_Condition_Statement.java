package javaBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Topic_06_Condition_Statement {

	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	
	public static void main(String[] args) {
		boolean status = 5==4;
		System.out.println(status);
		
		//hàm if sẽ nhận vào 1 điều kiện đúng
		//Kiểm tra duy nhất 1 điều kiện
		//Nếu điều kiện này đúng thì sẽ action (xxx) trong phần thân
		if (status) {
			//Đúng thì vào phần thân của if
			//Sai thi bỏ qua
			System.out.println("Go to if");
		}
		
		WebDriver driver = new FirefoxDriver();
		WebElement salePopup = driver.findElement(By.id("ok"));
		//Element luôn có trong DOM dù popup hiển thị hay không
		if (salePopup.isDisplayed()) {
			
		}
		//Element k có trong DOM khi popup k hiển thị
		List<WebElement> salePopups = driver.findElements(By.id("No"));
		//Check element k hiển thị
		if (salePopups.size() > 0 && salePopups.get(0).isDisplayed()) {
			
		}
		//Gán (assign)
		int studentNumber = 10;
		
		//== so sánh
		status = (studentNumber ==11);
		
		//Uncheck to checkbox
		WebElement languagesCheckbox = driver.findElement(By.id(""));
		if (languagesCheckbox.isSelected()) {
			languagesCheckbox.click();
		}
		
		//Check to checkbox
		if (!languagesCheckbox.isSelected()) {
			languagesCheckbox.click();
		}
		
		
		
		
		
	}
	
	//@Test
	public void TC_01_If() {
		
	}
	
	//@Test
	public void TC_02_If_Else() {
		//Có tới 2 điều kiện, nếu như đúng thì vào if - sai thì vào else
		//Nếu driver start với browser như Chrome/Firefox/Edge/Safari thì dùng hàm click thông thường (builtin) của Selenium WebElement
		
		//Nếu driver là IE thì dùng hàmg click của JavascỉptExecutor
		//System.setProperty("webdriver.ie.driver", projectPath + "\\browserDrivers\\IEDriverSever.exe");
		//driver = new InternetExplorerDriver();
		
		
		System.setProperty("webdriver.chrome.driver", projectPath + "\\browserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		if (driver.toString().contains("internet explorer")) {
			System.out.println("Click by Javascript Executor");
		}else{
			System.out.println("Click by Selenium WebElement");
			
		}
		
	}
	
	@Parameters("browser")
	//@Test
	public void TC_03_If_Else_If(String browserName) {
		
		//Có nhiều điều kiện
		//Best Practive : k nên if-else quá nhiều => Chuyển qua switch - case
		if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.geko.driver", projectPath + "\\browserDrivers\\gekodriver.exe");
			driver = new FirefoxDriver();
		}
		else if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", projectPath + "\\browserDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("edge")){
			System.setProperty("webdriver.edge.driver", projectPath + "\\browserDrivers\\msedgedriver.exe");
			driver = new EdgeDriver();
			
		} else if (browserName.equalsIgnoreCase("ie")){
			System.setProperty("webdriver.ie.driver", projectPath + "\\browserDrivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			
		} else { //Safari/Opera/Coccoc/..
			throw new RuntimeException("Please input correct the browser name!");
			
		}
		System.out.println(browserName);
		System.out.println(driver.toString());
		
		driver.quit();
	}

	
	@Test 
	public void TC_04_If_Else_If() {
		//Page Object
		//Dynamic Page
		String pageName = "Login";
		if (pageName.equals("Login")) {
			//LoginPage loginPage = new LoginPage();
			//return loginPage;
		} else if(pageName.equals("Register")){
			//RegisterPage registerPage = new RegisterPage();
			//return registerPage;
		} else if(pageName.equals("New Customer")){
			//CustomerPage customerPage = new CustomerPage();
			//return customerPage;
		} else {
			//HomePage homePage = new HomePage();
			//return homePage;
		}
		//same if=else
		int age = 20;
		String access = (age <18) ? "You can not access this page !" : "Welcome to our system !";
		
		if (age <18) {
			access = "You can not access this page !";
		} else {
			access = "Welcome to our system !";
		}
		System.out.println(access);
	}
	
}
