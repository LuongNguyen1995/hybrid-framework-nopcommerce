package javaBasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class Topic_11_Array {


	@Test
	public void TC_01() {
		//Cố định
		//Được define cố định bao nhiêu phần tử khi mình viết code(Compile)
		String studentName[] = {"Lương","Ngân", "Phương"};
		
		for (int i = 0; i < studentName.length; i++) {
			if (studentName[i].equals("Ngân")) {
				System.out.println("Click vào Ngân");
			}
			
		}
		
		for (String std : studentName) {
			if (std.equals("Phương")) {
				System.out.println("Click foreach vào Phương");
			}
		}
		
		//Động
		ArrayList<String> stdName = new ArrayList<String>();
	
		//Khi chạy code mới add (Runtime)
		for (String std : stdName) {
			stdName.add(std);
		}
		
		List<String> names = Arrays.asList("Long","Luân", "Việt");
		for (String name : names) {
			System.out.println("Name : "+name);
		}
		
		String std_Name = Arrays.toString(studentName);
		System.out.println(std_Name);
	}
	
	//Thuộc tính, biến
	String name;
	int age;
	//Contructor : Hàm khởi tạo, sau khi new 1 hàm 
	//thì sẽ vào contructor đầu tiên để gán

	public Topic_11_Array(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void display() {
		System.out.println("Name : "+ name);
		System.out.println("Age : "+ age);
	}
	
	public static void main(String[] args) {
		//Mảng Object
		Topic_11_Array[] student = new Topic_11_Array[3];
		student[0] = new Topic_11_Array("Luong",23);
		student[1] = new Topic_11_Array("Phuong",19);
		student[2] = new Topic_11_Array("Ngan",23);
		for (int i = 0; i < student.length; i++) {
			student[i].display();
			
		}
		
	}
	
}
