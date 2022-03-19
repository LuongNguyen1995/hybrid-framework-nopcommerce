package javaBasic;

public class Topic_16_String_Format {

	public static void main(String[] args) {
		String text = String.format("xpath=//button[text()='%s']", "Log in");
		System.out.println(text);
	}

}
