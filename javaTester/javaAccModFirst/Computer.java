package javaAccModFirst;

public class Computer {
	//Property
	private int ssdSize;
	String ramProductName;
	protected String cpuProductName;
	public int vgaSize;
	//Method
	private void setSsdSize(int ssdSize) {
		this.ssdSize= ssdSize;
	}
	
	public void setVgaSize(int vgaSize) {
		this.vgaSize = vgaSize;
	}
	
	void setRamProductName(String ramProduct) {
		ramProductName = ramProduct;
	}
	
	protected void setCpuProductName(String cpuProduct) {
		cpuProductName = cpuProduct;
	}
	
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
