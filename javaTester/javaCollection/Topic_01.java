package javaCollection;

import org.testng.annotations.Test;

public class Topic_01 {

	public static void main(String[] args) {
		String firstText = "id=Email";
		System.out.println(firstText.substring(4));

	}
	@Test
	public void TC_01() {
		String firstText = "id=Email";
		System.out.println(firstText.substring(4));
	}

}



