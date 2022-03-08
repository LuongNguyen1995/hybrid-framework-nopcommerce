package javaBasic;

import org.testng.annotations.Test;

public class Topic_10_Break_Continue {
	
	//@Test
	public void TC_01_Break() {
		for (int i = 1; i <= 5; i++) {
			if (i==4) {
				break;
			}
			System.out.println("i = "+i);
		}
		for (int i = 1; i <= 5; i++) {
			System.out.println("i = "+i);
			for (int j = 1; j <= 5; j++) {
				if (j==4) {
					break;
				}
				System.out.println("j = "+j);
			}
		}
	}
	
	@Test
	public void TC_02_Continue() {
		for (int i = 1; i <= 5; i++) {
			if (i==4) {
				continue;
			}
			System.out.println("i = "+i);
		}
		for (int i = 1; i <= 5; i++) {
			System.out.println("i = "+i);
			for (int j = 1; j <= 5; j++) {
				if (j==4) {
					continue;
				}
				System.out.println("j = "+j);
			}
		}
	}
}
