package javaBasic;

import org.testng.annotations.Test;

public class Topic_12_String_Execercise {

	@Test
	public void TC_01() {
		String test1 = "Automation FC";
		char result[] = test1.toCharArray();
		int countUpper = 0;
		int countLower = 0;
		int countNumber = 0;
		for (char c : result) {
			if (c>='A' && c<='Z') {
				//Uppercase
				countUpper++;
			}
			if (c>='a' && c<='z') {
				//Lowercase
				countLower++;
			}
			if (c>='0' && c<='9') {
				//Uppercase
				countNumber++;
			}
		}

		System.out.println("Số kí tự in hoa là : "+countUpper);
		System.out.println("Số kí tự in thường là : "+countLower);
		System.out.println("Số kí tự số là : "+countNumber);
	}
	
	@Test
	public void TC_02() {
		String test2 = "Automation Testing 345 Tutorials Online 789";
		char result[] = test2.toCharArray();
		//Count 'a'
		int countChar=0;
		int countNumber = 0;
		for (char c : result) {
			if (c=='a') {
				countChar++;
			}
			if (c>='0' && c<='9') {
				countNumber++;
			}
		}
		System.out.println("Số kí tự 'a' là : "+countChar);
		
		System.out.println("Kiểm tra chuỗi có chứa từ 'Testing' hay không : "+test2.contains("Testing"));
		
		System.out.println("Kiểm tra chuỗi có bắt đầu bằng 'Automation' hay không : "+test2.startsWith("Automation"));
		
		System.out.println("Kiểm tra chuỗi có kết thúc bằng 'Online' hay không : "+test2.endsWith("Online"));
		
		System.out.println("Vị trí của từ 'Tutorials' trong chuỗi : "+test2.indexOf("Tutorials"));
		
		System.out.println("Chuỗi sau khi thay thế 'Online' bằng 'Offline' : "+test2.replace("Online", "Offline"));
		
		System.out.println("Số lượng kí tự là số trong chuỗi là : "+countNumber);
		 
	}
	
	@Test
	public void TC_03() {
		String test3 = "Automation FC";
		char result[] = test3.toCharArray();
		for (int i = result.length - 1; i >= 0; i--) {
			System.out.print(result[i]);
		}
		System.out.println("\n");
	}
}
