package javaOOP.overriding;

import javaOOP.overloading.IWork;

public class Employee extends Person implements IWork{

	@Override
	public void eat() {
		System.out.println("Xuất cơm 50k");
	}

	@Override
	public void sleep() {
		System.out.println("Ngủ 7h");
		
	}

	@Override
	public void workingTime() {
		System.out.println("Làm việc 8h");
		
	}
	
	public static void main (String[] args) {
		Employee e = new Employee();
		e.eat();
		e.sleep();
		e.workingTime();
	}
	
	public final void walk() {
		System.out.println("Đi bộ");
	}
	
	private void walkingDate() {
		System.out.println("chưa chết");
	}
}
