package javaBasic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Topic_04_Operator {

	public static void main(String[] args) {
		int number = 10;
		//number*=5;
		System.out.println(number);

		System.out.println(number/5);
		System.out.println(number%6);
		
		System.out.println(number++);
		System.out.println(++number);
		
		for (int i = 0; i < 3; i++) {
			System.out.println(i);
		}
		
		Assert.assertTrue(5<6);
		String address = "HCM";
		if (address !="HN") {
			System.out.println("Address is the same");
		}
		
		if (!(address=="Ho Chi Minh")) {
			System.out.println("Address is not the same");
		}
		//Điều kiện tam nguyên(= ? :) (if/else)
		boolean status = (address == "HCM") ? true : false;
		System.out.println(status);
	
	}
	
	@Test
	public void TC_01_Swap_a_b() {
		int a=3;
		int b=4;
		b=a+b;
		a=b-a;
		b=b-a;
		System.out.println(a);
		System.out.println(b);
		
	}

}
