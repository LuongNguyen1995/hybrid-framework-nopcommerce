package javaBasic;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Topic_09_While_Do_While {
	Scanner scanner = new Scanner(System.in);
	@Test
	public void TC_00() {
		
		for (int i = 0; i < 5; i++) {
			System.out.println("For : " + i);
			if (i==3) {
				break;
			}
		}
		
		
		int i =0;
		while (i <5) {
			System.out.println("While : "+i);
			i++;
			if (i==3) {
				break;
			}
		}
		do {
			System.out.println("While : "+i);
			i++;
		} while (i <5);
	}
	
	@Test
	public void TC_01() {
		int n = scanner.nextInt();
		int i = n;
		while (i<=100) {
			if (i%2==0) {
				System.out.println("So chan tu "+n+" den 100 la : "+i);
			}
			i++;
		}
	}
	
	@Test
	public void TC_02() {
		int numberA = scanner.nextInt();
		int numberB = scanner.nextInt();
		int i = numberA;
		while (i <= numberB) {
			if (i %3==0 && i%5==0) {
				System.out.println("So chia het cho 3 va 5 trong khoang "+numberA+" den "+ numberB+" la : "+i);
			}
			i++;
		}
	}
	
	@Test
	public void TC_03() {
		int numberN = scanner.nextInt();
		int tong = 0;
		int i =0;
		while (i<=numberN) {
			if (i%2==1) {
				tong+=i;
			}
			i++;
		}
		System.out.println("Tong cac so le tu 0 den "+numberN+" la : "+ tong);
	}
	
	@Test
	public void TC_04() {
		int numberA = scanner.nextInt();
		int numberB = scanner.nextInt();
		int i = numberA;
		while (i<=numberB) {
			if (i%3==0) {
				System.out.println("Cac so chia het cho 3 trong khoang tu 0 den "+numberB+" la : "+i);
			}
			i++;
		}
	}
	
	@Test
	public void TC_05() {
		int numberN = scanner.nextInt();
		int giaiThua = 1;
		int i = 1;
		while (i<=numberN) {
			giaiThua*=i;
			i++;
		}
		System.out.println(numberN+"! = "+giaiThua);
	}
	
	@Test
	public void TC_06() {
		int tongChan = 0;
		int i = 0;
		while (i<=10) {
			if (i%2==0) {
				tongChan+=i;
			}
			i++;
		}
		System.out.println("Tong cac so chan tu 1 den 10 la : "+tongChan);
	}
}
