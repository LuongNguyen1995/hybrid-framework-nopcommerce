package javaBasic;

public class Topic_01_Variable {
	static int studentNumber;
	static boolean status;
	String studentName = "AutomationFC";
	static final String BROWSER_NAME = "Chrome";//constant
	
	public static void main(String[] args) {
		System.out.println(studentNumber);
		System.out.println(status);
		Topic_01_Variable topic = new Topic_01_Variable();
		System.out.println(topic.studentName);
		
		//Biến static có thể truy cập thẳng thông qua class
		System.out.println(Topic_01_Variable.studentNumber);
		
		System.out.println(BROWSER_NAME);
	}
	
	//Getter : getCurrentUrl/getTitle/getText/getAttribute/getCssValue/getSize/getLocation/...
	public String getStudentName() {
		return this.studentName;
	}
	
	//Setter : Click/sendkey/clear/select/back/forward/refresh/getUrl/...
	public void setStudentName(String stdName) {	
		this.studentName = stdName;
	}
}
