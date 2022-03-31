package javaBasic;

import java.util.Calendar;
import java.util.Random;

import com.github.javafaker.Faker;

public class Random_Data {

	public static void main(String[] args) throws InterruptedException {
		
		Faker fake = new Faker();
		System.out.println(fake.name().firstName());
		System.out.println(fake.name().lastName());
		System.out.println(fake.internet().emailAddress());
		System.out.println(fake.internet().privateIpV4Address());
		System.out.println(fake.internet().publicIpV4Address());
		System.out.println(fake.phoneNumber().cellPhone());
		
	}

	public static int getRandomNumber() {
		int uLimit = 999;
		int lLimit = 100;
		Random rand = new Random();
		return lLimit + rand.nextInt(uLimit - lLimit);
	}

	public static int getRandomNumber(int minimum, int maximum) {
		Random rand = new Random();
		return minimum + rand.nextInt(maximum - minimum);
	}

	public static String getRandomEmail() {
		return "automation" + getRandomNumberByDateTime() + "@live.com";
	}

	// Get random number by date time minute second (no duplicate)
	public static long getRandomNumberByDateTime() {
		return Calendar.getInstance().getTimeInMillis() % 100000;
	}
}
