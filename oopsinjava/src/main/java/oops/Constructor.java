package oops;

public class Constructor {
	
	// the name of the constructor should be same as the class name
	// constructor will not have return type
	// there are two types of constructors - 
	// 1. default constructor()
	// 2. parametarized constructor(params)
	
	public static class ABC{
		int i;
		String s;
		public ABC() {
			System.out.println("Default constructor");
		}
		public ABC(int i, String s) {
			this.i=i; // this.i - belongs to global variable
			this.s=s;
			System.out.println("parametarized constructor");
		}
	}

	public static void main(String[] args) {
		ABC a = new ABC(); // Calls default constructor
		ABC b = new ABC(3,"Jeevan"); // Calls parametarized constructor
	}

}
