package javaOOP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class Topic_05_This_Super extends BaseOOP {
	private int firstNumber;
	private int secondNumber;
	private long shortTimeout = 15;
	private long longTimeout = 45;

	private WebDriver driver;
	
	public Topic_05_This_Super() {
		super("OK");
		System.out.println("Contructor in child class");
	}
	
	public Topic_05_This_Super(int firstNumber, int secondNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}
	
	public void sumNumber() {
		System.out.println(firstNumber + secondNumber);
	}
	
	public void showNumber() {
		this.sumNumber();
	}
	
	public void setImplicitWait() {
		driver.manage().timeouts().implicitlyWait(super.longTimeout, TimeUnit.SECONDS);
		System.out.println(super.browserName);
	}
	
	public void clickToElement() {
		//k dùng support nó sẽ gọi qua hàm ở class con (hiện tại)
		setImplicitWait();
		
		super.setImplicitWait();
	}
	
	public static void main(String[] args) {
		Topic_05_This_Super topic = new Topic_05_This_Super(4, 20);
		Topic_05_This_Super topic1 = new Topic_05_This_Super();
		topic1.sumNumber();
		
	}
}
