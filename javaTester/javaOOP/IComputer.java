package javaOOP;

public interface IComputer {

	//Nếu không gán từ khóa là abstract cho hàm thì tự hiểu đây vẫn là 1 hàm abstract
	public abstract void showComputerRam();
	//Normal method
	public void showComputerPerformance() {
		System.out.println("Show Computer performance");
	}
	
}
