package javaOOP;

public class Car {
	private String carCompany;
	private String carType;
	private String fuelType;
	private Float mileAge;
	private Double carPrice;
	
	public Car(String carCompany, String carType, String fuelType, Float mileAge, Double carPrice) {
		this.carCompany = carCompany;
		this.carType = carType;
		this.fuelType = fuelType;
		this.mileAge = mileAge;
		this.carPrice = carPrice;
	}

	public String getCarCompany() {
		return carCompany;
	}

	public void setCarCompany(String carCompany) {
		this.carCompany = carCompany;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public Float getMileAge() {
		return mileAge;
	}

	public void setMileAge(Float mileAge) {
		this.mileAge = mileAge;
	}

	public Double getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(Double carPrice) {
		this.carPrice = carPrice;
	}
	
	public void showCarInfor() {
		System.out.println("Car Company : "+getCarCompany());
		System.out.println("Car Type : "+getCarType());
		System.out.println("Car Fuel : "+getFuelType());
		System.out.println("Car Price : "+getCarPrice());
		System.out.println("Mile Age : "+getMileAge());
	}
	
	public static void main(String[] args) {
		Car car1 = new Car("Toyota", "Camry", "Diesel", 200f, 50000d);
		car1.showCarInfor();
	}
	
}
