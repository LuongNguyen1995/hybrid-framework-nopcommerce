package javaOOP.abstraction;

public interface IAnimal {
	String getName();
	
	void setName(String name);
	
	abstract String getAddress();
	
	abstract void setAddress(String name);
	
	public int NUMBER = 100;
}
