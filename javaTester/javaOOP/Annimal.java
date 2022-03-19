package javaOOP;

//Abstract class
//Template
public abstract class Annimal {

	//Variable
	String annimalName = "Dog";
	
	//Method
	//1 abstract method thì k có phần thân (body)
	//Dùng với public và protected
	//Bắt buộc các class con phải override các hàm này lại
	protected abstract void setAnnimalName();
}
