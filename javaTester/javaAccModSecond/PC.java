package javaAccModSecond;

import javaAccModFirst.Computer;

public class PC extends Computer {

	public void showCPUProductName() {
		vgaSize = 10;
		System.out.println(vgaSize);
		
		setVgaSize(30);
		System.out.println(vgaSize);
	}

}
