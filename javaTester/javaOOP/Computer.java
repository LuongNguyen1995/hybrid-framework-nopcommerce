package javaOOP;

public abstract class Computer {

	//Normal method
	public void showComputerPerformance() {
		System.out.println("Show Computer performance");
	}
	
	//Abstract method
	//Khung để cho các class con kế thừa nó phải override lại (implement) lại
	public abstract void showComputerRam();
}
