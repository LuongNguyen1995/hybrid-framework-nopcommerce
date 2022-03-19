package javaOOP;

public class Topic_02_Variable_Property {

	//Access modifier
	//Data type
	//Variable name
	//Variable value
	private String studentName = "Automation FC"; //global variable - Biến toàn cục
	//Access modifier : default
	int studentID = 1212;
	
	//public Static variable : có thể dùng & gán lại dữ liệu, truy cập trực tiếp khi ở trong và ngoài class (các hàm static)
	public static String studentAddress = "Ho Chi Minh";
	
	//private static variable : chỉ có thể dùng trong class này (cho tất cả instance/ object dùng)
	private static String studentPhone = "0123456789";
	
	//Final variable : không cho phép gán lại/k cho override lại : cố định dữ liệu
	final String country = "Viet Nam";
	
	//Static final variable : Hằng số (Constant)
	//Không được ghi đè
	//Có thể truy cập rộng rãi cho tất cả các instance/thread
	static final float PI_NUMBER = 3.1415f;
	
	//Contructor
	public Topic_02_Variable_Property() {
		String studentName = "Automation FC"; //local variable - Biến cục bộ
		country = "Lao";
	}
	//Hàm(Method) - Non static
	public void display() {
		String studentName = "Automation FC"; //local variable - Biến cục bộ
	}
	//Hàm(method) - Static
	public static void main(String[] args) {
		//local variable - phạm vi trong hàm
		String studentName = "Automation FC";
		if (studentName.startsWith("Automation")) {
			//local variable - Phạm vi là trong block code
			int number = 100;
		}
		studentAddress = "Ha Noi";
		studentPhone = "012345894327";
		
		//local variable : bắt buộc phải khởi tạo mới được sử dụng
		//global variable : Không cần khởi tạo, đã có sẵn giá trị mặc định
	}

}
