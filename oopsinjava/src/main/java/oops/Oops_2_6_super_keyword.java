package oops;

// super keyword

// in a child class (variables/methods/constructor) to get invoke
// the members of parent class we use super keyword

class Animal {
	String strName = "Bull";
	void eat() {
		System.out.println("Eating grass : ");
	}
	Animal(){ // constructor
		System.out.println("From animal");
	}
}
class Lion extends Animal{
	String strName = "Lion";
	void print() {
		System.out.println(strName); // prints lion
		System.out.println(super.strName);// prints bull - super invokes parent variable with same name
	}
	
	void eat() {
		System.out.println("Lion eats meat ");
	}
	
	void display() {
		super.eat(); // super invokes parent eat() method
		eat(); // local method
	}
	
	Lion(){ // constructor
		super(); // calls parent constructor
		System.out.println("Lion .....");
	}
}

public class Oops_2_6_super_keyword {
	public static void main(String[] args) {
		Lion l=new Lion(); // constructor auto loads
		l.print();
		l.display();
		
	}

}
