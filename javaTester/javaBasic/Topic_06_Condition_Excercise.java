package javaBasic;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Topic_06_Condition_Excercise {
	Scanner scanner = new Scanner(System.in);
	
	//@Test
	public void TC_01() {
		
		int number = scanner.nextInt();
		if (number%2==0) {
			System.out.println("So "+number+" la so chan!");
		}else {
			System.out.println("So "+number+" la so le!");
		}
		
	}
	
	//@Test
	public void TC_02() {
		int numberA = scanner.nextInt();
		int numberB = scanner.nextInt();
		
		//Primitive type
		if (numberA >= numberB) {
			System.out.println("So "+numberA+" lon hon hoac bang so "+numberB);
		} else {
			System.out.println("So "+numberA+" nho hon so "+numberB);
		}
		
	}
	
	//@Test
	public void TC_03() {
		String firstStudent = scanner.nextLine();
		String secondStudent = scanner.nextLine();
		
		//Reference : String
		//Kiểm tra cái value của biến
		//Kiểm tra vị trí của biến trong vùng nhớ
		if (firstStudent.equals(secondStudent)) {
			System.out.println(firstStudent + " trung ten voi ban " + secondStudent);
		} else {
			System.out.println(firstStudent + " khong trung ten voi ban " + secondStudent);
		}
		
	}
	
	//@Test
	public void TC_04() {
		int numberA = scanner.nextInt();
		int numberB = scanner.nextInt();
		int numberC = scanner.nextInt();
		
		int maxNumber = numberA;
		if (numberB > maxNumber) {
			maxNumber = numberB;
		} 
		if(numberC > maxNumber){
			maxNumber = numberC;
		}
		System.out.println(maxNumber+ " la so lon nhat");
	}
	
	//@Test
	public void TC_05() {
		int numberA = scanner.nextInt();
		
		if (numberA > 10 && numberA <100) {
			System.out.println(numberA+ " nam trong khoanh xx");
		} else {
			System.out.println(numberA+ " nam ngoai khoanh xx");
		}
	}
	 
	@Test
	public void TC_06() {
		int month = scanner.nextInt();
		
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 ) {
			System.out.println("Thang "+month+ " co 31 ngay!");
		} else if (month == 2) {
			System.out.println("Thang "+month+ " co 28 hoac 29 ngay!");
		} else {
			System.out.println("Thang "+month+ " co 30 ngay!");
			}
		}
		
	}

