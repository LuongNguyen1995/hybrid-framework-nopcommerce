package javaOOP.overloading;

import javaOOP.Topic_06_Getter_Setter;

public class Testing{

	public static void main(String[] args) {
		//Truy cập trực tiếp từ tên class
		//K cần tạo instans/object
		//K nên lạm dụng tạo các biến là static
//		System.out.println(Topic_04_Non_Access_Modifier.browserName);
//		
//		// Khởi tạo các Class
//		Topic_04_Non_Access_Modifier.sendkeyToElement("OK");
//		Topic_04_Non_Access_Modifier topic = new Topic_04_Non_Access_Modifier();
//		topic.colorCar = "Green";
		
//		@Override
//		public void clickToElement(String elementName) {
//			
//		}
//		
//		public void setCarName() {
//			
//		}
		//Class abstract thì không cho new
//		Annimal ann = new Annimal();
//		
//		protected void setAnnimalName() {
//			
//		}
//		
//		
//		
//		
//	}
//	//Ít khi dùng Nested Class : Lớp lồng
//	public static class NestedTesting{
//
		
		Topic_06_Getter_Setter topic = new Topic_06_Getter_Setter();
		topic.setPersonName("");
		topic.setPersonAge(-10);
		topic.setPersonPhone(987);
		topic.setPersonBankAccountAmout(-50000);
		
		topic.showPersonInfo();
		
		}
}
	
