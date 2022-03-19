package javaOOP;

public class Topic_04_Overloading {
	
	static int plusMethod(int x, int y) {
		return (x+y);
	}
	
	static double plusMethod(double x, double y) {
		return (x+y);
	}
	
	public static void main(String[] args) {
		int myNum1 = plusMethod(8,5);
		double myNum2 = plusMethod(8.5 , 5.5);
		System.out.println(myNum1);
		System.out.println(myNum2);
	}
}
