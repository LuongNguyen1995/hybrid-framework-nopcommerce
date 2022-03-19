package javaOOP.overriding;

import javaOOP.overloading.IWork;

public class Student extends Person  implements IWork{

	@Override
	public void eat() {
		System.out.println("Xuất cơm 30k");
	}

	@Override
	public void sleep() {
		System.out.println("Ngủ 12h");
		
	}

	@Override
	public void workingTime() {
		System.out.println("Làm việc 3h");		
	}
	
	public static void main (String[] args) {
		Student s = new Student();
		s.eat();
		s.sleep();
		s.workingTime();
	}
}
