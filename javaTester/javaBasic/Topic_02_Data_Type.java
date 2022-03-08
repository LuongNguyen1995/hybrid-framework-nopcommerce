package javaBasic;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.nopcommerce.data.UserData.Address;

public class Topic_02_Data_Type {
	//Global variable
	static int number;
	String address = "HCM";
	
	//Primitive type/ value type : nguyên thủy
	
	byte bNumber;
	short sNumber;
	int iNumber;
	long lNumber;
	
	float fNumber = 7.8f;
	double dNumber = 7.2d;
	
	char cChar;
	boolean bStatus;
	
	
	
	//Reference type : tham chiếu
	
	//String 
	String address1 = "HCM";
	//Array
	String[] studentAddress = {address1,"HN","DN"};
	Integer[] studentNumber = {15,20,50};
	
	//Class
	Topic_02_Data_Type topic;
	//Interface
	WebDriver driver;
	//Object
	Object aObject;
	//Collection
	//List/Set/Queue/Map
	List<WebElement> homePageLinks = driver.findElements(By.tagName("id"));
	Set<String> allWindows = driver.getWindowHandles();
	List<String> productName = new ArrayList<String>();
	
	public void clickToElement() {
		address1.trim();
		studentAddress.clone();
		driver.getCurrentUrl();
		aObject.toString();
		homePageLinks.size();
		allWindows.clear();
		
	}
	
	public static void main(String[] arg0) {
		//Local Variable
		System.out.println(number);
		
		//Khi hàm main là static mà muốn lấy đối tượng bên ngoài k phải static, thì phải new hàm class rồi lấy đối tượng
		Topic_02_Data_Type topic = new Topic_02_Data_Type();
		
		
		System.out.println(topic.address);
		
	}
}
