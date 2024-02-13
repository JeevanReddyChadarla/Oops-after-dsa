package oops;

public class Oops_2_0_Inheritance {
	
	// Def: Inheritance is a technique in which
	// the child class will inherits the properties of parent class

	// in other words, creating a new class on the basis of existing class 
	// is-a relationship : car is-a vehicle - inheritance
	// has-a relationship : car has-a engine - not inheritance
	
	// Advantage : reusability
	
	// Achieved using "extends"
	
	// Syntax - public childClass extends ParentClass{}
	
	public static class Vehicle{
		int price;
		String color;
		public void displayVehicle() {
			System.out.println(price);
			System.out.println(color);
		}
	}
	public static class Car extends Vehicle{
		String company;
		boolean sunRoof;
		public void carDetails() {
			System.out.println(company);
			System.out.println(sunRoof);
		}
	}
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.color="white"; // parent var inherited to child
		car1.price=300000; // parent var inherited to child
		car1.company="Toyota";
		car1.sunRoof=false;
		car1.displayVehicle(); // parent method inherited to child
		car1.carDetails();
		
		Vehicle veh = new Vehicle();
		veh.color="red";
//		veh.company="tata"; error - parent does not have child properties
	}

}
