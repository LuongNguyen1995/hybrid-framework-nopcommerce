package singletonPattern;

public class TestSingleton {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(() -> GlobalConstants.getGlobalConstants());
		Thread t2 = new Thread(() -> GlobalConstants.getGlobalConstants());
		Thread t3 = new Thread(() -> GlobalConstants.getGlobalConstants());
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}
}
