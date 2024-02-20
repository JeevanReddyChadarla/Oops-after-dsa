package oops;

//Abstraction - Hiding the necessary details and showing only few to the end user
//Achieved - abstract class or interface
//example - tv remote - we have a plastic button, and internal functionality(circuit)
//1. we cannot create an object to an abstract class
//2. we can extend an abstract class
//3. abstract class can have abstract methods and normal methods
//4. abstract methods should be only declared in parent abstract class and its implementation should be in child class


abstract class Carr{
	abstract public void carrColor(); // plastic button in tv-remote
	public void carrPrice() {
		System.out.println("35 lac");
	}
}

class Tata extends Carr{ // since tata class is a child, we can access carrPrice method and need to implement abstract method - CarrColor
	public void carrColor() { // internal implementation of plastic button
		System.out.println("perl white");
	}
}

public class Oops_5_0_Abstraction {

	public static void main(String[] args) {
		Tata nexon = new Tata();
		nexon.carrColor();
		nexon.carrPrice();
	}

}
