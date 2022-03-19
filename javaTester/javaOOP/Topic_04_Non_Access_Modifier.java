package javaOOP;

public abstract class Topic_04_Non_Access_Modifier {

	
	//static : Variable/ method
	//Dùng cho tất cả các instance / object
	//Phạm vi cho toàn bộ system sử dụng nó
	//Có thể override được
	static String browserName = "Chrome";
	
	//Non static
	String serverName = "Testing";
	
	//Hằng số
	final String colorCar = "Red";
	
	final static String REGISTER_BUTTON = "";
	
	public static void main(String[] args) {
		System.out.println(browserName);

		browserName = "Firefox";
		//Nếu là abstract class thì không cho khởi tạo, chỉ cho kế thừa
//		//Topic_04_Non_Access_Modifier topic = new Topic_04_Non_Access_Modifier();
//		System.out.println(topic.serverName);
//		System.out.println(topic.browserName);
		
		//Không được phép gán lại giá trị
		topic.colorCar = "Blue";
		
		topic.clickToElement("Button");
		sendkeyToElement("Link");
	}
	//Non static
	public void clickToElement(String elementName) {
		System.out.println(elementName);
	}
	//Static
	public static void sendkeyToElement(String elementName) {
		System.out.println(elementName);
	}
	
	//Final 
	public final void setCarName() {
		
	}

}
