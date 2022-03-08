package javaBasic;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Topic_08_For_Foreach_Excercise {
	Scanner scanner = new Scanner(System.in);
	@Test
	public void TC_01() {
		int n = scanner.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.print(i+" ");
			
		}
	}
	
	@Test
	public void TC_02() {
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		for (int i = a; i <= b; i++) {
			System.out.print(i+" ");		
		}
	}
	
	@Test
	public void TC_03() {
		int n=10;
		int tong = 0;
		for (int i = 1; i <= n; i++) {
			if (i%2==0) {
				tong+=i;
			}
			
		}
		System.out.println("Tong cac so chan tu 1-10 : "+tong);
	}
	
	@Test
	public void TC_04() {
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int tong = 0;
		for (int i = a; i <= b; i++) {
				tong+=i;
		}
		System.out.println("Tong cac so tu "+a+" den "+b+" : "+tong);
	}
	
	@Test
	public void TC_05() {
		int n = scanner.nextInt();
		int tong = 0;
		for (int i = 1; i <= n; i++) {
			if (i%2==1) {
				tong+=i;
			}
			
		}
		System.out.println("Tong cac so le tu 0 den "+n+" : "+tong);
	}
	
	@Test
	public void TC_06() {
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		for (int i = a; i <= b; i++) {
			if (i%3==0) {
				System.out.print(i+" ");
			}
			
		}
	}
	
	@Test
	public void TC_07() {
		int n = scanner.nextInt();
		int giaiThua = 1;
		for (int i = 1; i <= n; i++) {
		giaiThua*=i;
			
		}
		System.out.println(n+"! = "+giaiThua);
	}
}
