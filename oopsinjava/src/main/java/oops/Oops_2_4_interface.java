package oops;

//interface - implements

	// Through interface 100% abstraction is achieved
	// we cannot have constructor to an interface - since obj cannot be created through interface
	// through interface - multiple inheritance is possible
	// methods in interface cannot be private or protected
	
	// the methods declared in interface has to be implemented by every class that uses the interface
	// this helps us to maintain contract
	// always right to interface not to implementation - to maintain structure
	
	// Animal a = new Lion();
	//	Animal b = new Tiger();

interface Car{
	public void start();
}

class ElectricCar implements Car{
	public void start() {
		System.out.println("Electric car started");
	}
}

class DieselCar implements Car{
	public void start() {
		System.out.println("Diesel car has started");
	}
}
public class Oops_2_4_interface {
	
	public static void main(String[] args) {
		Car tesla = new ElectricCar();
		Car crysta = new DieselCar();
		tesla.start();
		crysta.start();
	}

}
