package javaOOP.overriding;

public abstract class Person {
	//Option
	public void eat() {
		System.out.println("Xuất cơm 20k");
	}
	//Must (Template)
	public abstract void sleep();
	
	public void walk() {
		System.out.println("Đi bộ");
	}
	
	void walkingDate() {
		System.out.println("Đã chết");
	}
}
