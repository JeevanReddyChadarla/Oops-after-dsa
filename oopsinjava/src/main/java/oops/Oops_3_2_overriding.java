package oops;

// Overriding - over riding the parent method in child class


// inheritance is involved (child & parent is involved and overrides)
//also known as dynamic binding, late binding, runtime polymorphism
class Bank{
	void rateOfInterest() {
		System.out.println("RBI decided 5 % ");
	}
}

class PNB extends Bank{
	@Override // good practice
	void rateOfInterest() { // overriding the rateofinterest method mentioned in parent
		System.out.println("PNB has 7 % "); 
	}
}

class SBI extends Bank{
	@Override // good practice 
	void rateOfInterest() { // overriding the rateofinterest method mentioned in parent
		System.out.println("SBI discussed 9 % ");
	}
}

public class Oops_3_2_overriding {

	public static void main(String[] args) {
		Bank b = new Bank();
		SBI s = new SBI();
		PNB p = new PNB();
		
		b.rateOfInterest();
		s.rateOfInterest();
		p.rateOfInterest();

	}

}
