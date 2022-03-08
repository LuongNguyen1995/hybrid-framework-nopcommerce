package javaBasic;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Topic_08_For_Foreach {
	WebDriver driver;
	//@Test
	public void TC_01() {
		//Vế 1 : Biến tạm dùng để tăng giá trị lên sau mỗi lần duyệt
		//Dùng để so sánh với tổng giá trị
		//Vế 2 : So sánh với tổng
		//Vế 3 : Tăng i lên 1 đơn vị sau khi chạy vào thân vòng for
		for (int i = 0; i < 10; i+=2) {
			System.out.println(i);
			
		}
		//Lần 1 
		// i = 0
		// 0<5 : đúng
		// System.out.println(i);
		// i++ : tăng lên 1 đơn vị (i=1)
		
		//Các lần sau tương tự
		
		//Lần 5 
		// i = 4
		// 4<5 : đúng
		// System.out.println(i);
		// i++ : tăng lên 1 đơn vị (i=5)
		
		//Lần 6 
		// i = 5
		// 5<5 : sai
		// Thoát ra khỏi vòng lặp

		//Array
		String[] cityName = {"Ha Noi", "HCM", "Da Nang", "Can Tho"};
		//Array/List/Set/Queue (index)
		// Bắt đầu từ 0
		
		//For kết hợp với if : thỏa mãn điều kiện mới action
		//Biến đếm - dùng để điều kiện filter
		for (int i = 0; i < cityName.length; i++) {
			if (cityName[i]=="Da Nang") {
				System.out.println("Do action!");
				break;
				//Tìm thấy Đà Nẵng thì không duyệt các biến còn lại nữa
				//Break để thoát ra khỏi vòng lặp gần nhất
			}
		}
		
		for (int i = 0; i < cityName.length; i++) {
			if (cityName[i]=="Da Nang") {
				System.out.println("Do action!");
				
			}
			//Tất cả giá trị đều được duyệt qua dù đã thỏa mãn điều kiện
		}
		
		//Dùng để chạy qua hết tất cả giá trị
		for (String city : cityName) {
			System.out.println(city);
		}
		
		//Java Collection
		//Class : ArrayList/LinkedList/Vector/..
		//Interface : List/Set/Queue
		
		
		
		
		
		List<String> cityAddress = new ArrayList<String>();
		System.out.println(cityAddress.size());
		//Compile (Coding)
		cityAddress.add("Bac Ninh");
		cityAddress.add("Quang Ninh");
		cityAddress.add("Ninh Binh");
		System.out.println(cityAddress.size());
		//Runtime (Running)
		for (String city : cityName) {
			cityAddress.add(city);
		}
		
		System.out.println(cityAddress.size());
		
		
		for (String cityAdd : cityAddress) {
			System.out.println(cityAdd);
		}
		
		//Java Generic
		List<WebElement> links = driver.findElements(By.xpath(""));
		
		//Xử lý dữ liệu / getText/ value/css/ attribute
		for (WebElement link : links) {
			//Chuyển page
			//Refresh DOM/HTML
			// Không còn tồn tại
			//Fail -> Stale Element Exception
			
		}
		//Sort
	}
	
	@Test
	public void TC_02() {
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
			
		}
	}
}
