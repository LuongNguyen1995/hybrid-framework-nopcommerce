package singletonPattern;

import java.util.Random;

public class GlobalConstants {

	//Private static variable
	private static GlobalConstants globalInstance;
	
	private int number;
	
	private GlobalConstants(int number) {
		this.number = number;
		System.out.println("Demo singleton = " + number);
	}
	
	public static synchronized GlobalConstants getGlobalConstants() {
		if (globalInstance==null) {
			
			globalInstance = new GlobalConstants(new Random().nextInt(9999));
			System.out.println("New instance");
		}else {
			System.out.println("Existing instance");
		}
		return globalInstance;
	}
}
