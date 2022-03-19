package javaOOP;

public class CarOOP {
	//Thuộc tính
	private String carCompany;
	private String carType;
	private String fuelType;
	private Float mileAge;
	private Double carPrice;
	
	public CarOOP(String carCompany, String carType, String fuelType, Float mileAge, Double carPrice) {
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
		System.out.println("Car company = "+getCarCompany());
		System.out.println("Car type = "+getCarType());
		System.out.println("Fuel type = "+getFuelType());
		System.out.println("Mile age = "+getMileAge());
		System.out.println("Car price = "+getCarPrice());
	}
	
	public static void main(String[] args) {

	}
		CarOOP firsrtCar = new CarOOP("Toyota","Camry","Diesel",20f,40000d);
		

}
