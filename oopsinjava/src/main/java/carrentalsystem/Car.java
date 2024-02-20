package carrentalsystem;

public class Car {
	
	private int id;
	private String model;
	private int pricePerDay;
	private int noOfDays;
	private int totalPrice;
	private boolean isAvailable;
	
	//Constructor
	public Car(int id, String model, int noOfDays) {
		this.id=id;
		this.model=model;
		this.noOfDays=noOfDays;
		this.isAvailable=true;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public boolean getIsAvailable(){
		return isAvailable;
	}
	public int price(int noOfDays) {
		totalPrice = noOfDays*pricePerDay;
		return totalPrice;
	}
	public void rentCar() {
		isAvailable=false;
	}
	public void returnCar() {
		isAvailable=true;
	}

}
