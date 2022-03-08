package javaBasic;

import java.sql.Driver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Topic_12_String {

	@Test
	public void TC_01() {
		
//		System.setProperty("webdriver.geko.driver","\\browserDrivers\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		
		String schoolName = "Automation Testing Advanced";
		String schoolAddress = " Ha Noi";
		
		System.out.println("Độ dài = "+schoolName.length());
		System.out.println("Lấy ra 1 kí tự = "+schoolName.charAt(11));
		System.out.println("Nối 2 chuỗi : "+schoolName.concat(schoolAddress));
		System.out.println("Nối 2 chuỗi : "+schoolName + schoolAddress);
		System.out.println("Kiểm tra 2 chuỗi có bằng nhau tuyệt đối hay không : "+schoolName.equals(schoolAddress));
		System.out.println("Kiểm tra 2 chuỗi có bằng nhau tương đối hay không : "+schoolName.equalsIgnoreCase("Automation testing advanced"));
		
		//startsWith/endsWith/contains : tương tự như xpath
		System.out.println("Kiểm tra chuỗi có bắt đầu bằng 1 kí tự hay 1 chuỗi kí tự hay không : "+schoolName.startsWith("Auto"));
		System.out.println("Kiểm tra chuỗi có chứa 1 kí tự hay 1 chuỗi kí tự hay không : "+schoolName.contains("Test"));
		System.out.println("Kiểm tra chuỗi có kết thúc bằng 1 kí tự hay 1 chuỗi kí tự hay không : "+schoolName.endsWith(schoolAddress));
		System.out.println("Vị trí của 1 kí tự hay 1 chuỗi kí tự trong chuỗi : "+schoolName.indexOf("u"));
		System.out.println("Vị trí của 1 kí tự hay 1 chuỗi kí tự trong chuỗi : "+schoolName.indexOf("Testing"));
		
		System.out.println("Tách 1 kí tự hay 1 chuỗi kí tự trong chuỗi : "+schoolName.substring(4));
		System.out.println("Tách 1 kí tự hay 1 chuỗi kí tự trong chuỗi : "+schoolName.substring(4,14));
		
		String result = "Viewing 48 of 132 results";
		//Split : Tách chuỗi thành 1 mảng dựa vào kí tự/chuỗi kí tự
		String results[] = result.split(" ");
		System.out.println(results[1]);
		
		//Replace
		String productPrice = "$100.00";
		productPrice = productPrice.replace("$", "");
		
		//Ép kiểu từ String qua số thực
		//Sắp xếp nó : Sort Data(Asc/Desc)
		float productPriceF = Float.parseFloat(productPrice);
		System.out.println(productPriceF +1);
		
		//Ép kiểu từ số thực qua String
		String.valueOf(productPriceF);
		System.out.println(productPriceF);
		

//		
//		String osName = System.getProperty("os.name");
//		System.out.println(osName);
//		//Window 10
//		//Handle multiple OS (Actions - keys - Ctrl / Command)
//		if (osName.toLowerCase().contains("Windows")) {
//			Keys key = Keys.CONTROL;
//		}else {
//			Keys key = Keys.COMMAND;
//		}
//		
//		//Multiple browser : toUpperCase
//		//firefox = FIREFOX (Enum)
//		
//		String driverInstanceName = driver.toString();
//		System.out.println(driverInstanceName);
//		//FirefoxDriver : firefox on WINDOWS (xxx-xxxx-xxxxxxxxx)
//		//Close browser/driver
//		if (driverInstanceName.contains("internetexplorer")) {
//			//Sleep cứng thêm mỗi 5s sau mỗi sự kiện chuyển page
//		}
		
		//Remove khoảng trắng/ xuống dòng/ tab
		String helloWorld ="	\n	\t Hello world!		";
		System.out.println(helloWorld.trim());
		System.out.println(helloWorld);
		
		helloWorld = " ";
		//Empty : kiểm tra có 1 kí tự bất kì hay không
		System.out.println("Empty = "+ helloWorld.isEmpty());
		//Blank : kiểm tra có khoảng trắng
		System.out.println("Blank = "+ helloWorld.isBlank());
		
		//Dynamic locator
		//Đại diện cho 1 chuỗi : %s
		//%b,%t,%d
		String dynamicButtonXpath = "//button[@id='%s']";
		System.out.println("Click to Login button = "+dynamicButtonXpath.format(dynamicButtonXpath, "login"));
		System.out.println("Click to Search button = "+dynamicButtonXpath.format(dynamicButtonXpath, "search"));
		System.out.println("Click to Register button = "+dynamicButtonXpath.format(dynamicButtonXpath, "register"));
		
		
		
	}
}
