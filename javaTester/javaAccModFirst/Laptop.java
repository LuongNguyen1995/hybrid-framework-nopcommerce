package javaAccModFirst;

public class Laptop {

	public static void main(String[] args) {
		Computer comp = new Computer();
		//Property
		comp.vgaSize = 32;
		System.out.println(comp.vgaSize);
		
		//Method
		comp.setVgaSize(16);
		System.out.println(comp.vgaSize);
	}
}
