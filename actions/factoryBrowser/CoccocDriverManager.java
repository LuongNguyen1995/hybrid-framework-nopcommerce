package factoryBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import commons.GlobalConstants;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CoccocDriverManager implements BrowserFactory{

	@Override
	public WebDriver getBrowserDriver() {
		//Cốc cốc browser trừ đi 5-6 ver ra chrome driver (recommend 6)
		WebDriverManager.chromedriver().driverVersion("97.0.4692.71").setup();
		ChromeOptions options = new ChromeOptions();
		if (GlobalConstants.OS_NAME.startsWith("Windows")) {
			options.setBinary("C:\\Program Files\\CocCoc\\Browser\\Application\\browser.exe");
		}else {
			options.setBinary("...");
		}
		return new ChromeDriver(options);
	}

}
