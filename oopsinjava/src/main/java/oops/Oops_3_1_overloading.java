package oops;

// Same function name, but different number of parameters or 
// different types of parameters

// inheritance is not involved (child & parent is not involved)
// also known as static binding, early binding, compile time polymorphism

class OverLoading{
	public int sum(int a, int b) {
		return a+b;
	}
	public int sum(int a, int b, int c) {
		return a+b+c;
	}
	public String sum(String a, String b, String c) {
		return a+b+c;
	}
}

public class Oops_3_1_overloading {
	public static void main(String[] args) {
		OverLoading obj = new OverLoading();
		obj.sum(3, 9);
		obj.sum(7,5,3);
		obj.sum("Jeevan", "reddy", "chadarla");
	}
	
}
