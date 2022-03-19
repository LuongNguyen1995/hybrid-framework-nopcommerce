package javaOOP;

public class Topic_03_Method {

	void showCarName() {
		System.out.println("Toyota");
	}
	
	static void showCarColor() {
		System.out.println("Toyota");
	}
	
	
	public static void main(String[] args) {
		//Gọi vào hàm static khác được, gọi trong class
		showCarColor();
		//Gọi hàm static khác, nhưng ngoài class
		Topic_03_Method.showCarColor();
		//K phải static thì k gọi được
		showCarName();
		//Muốn gọi hàm non static thì phải gọi qua instance/object
		Topic_03_Method obj = new Topic_03_Method();
		obj.showCarName();
		//Có thể gọi được hàm static nhưng bt sẽ k gọi như này
		obj.showCarColor();
		
	}
}
