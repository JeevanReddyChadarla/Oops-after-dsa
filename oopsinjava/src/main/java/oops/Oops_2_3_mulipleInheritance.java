package oops;

public class Oops_2_3_mulipleInheritance {
	
	// class A
	// class B
	// class C extends A,B - java doesn't support multiple inheritance

	
//	But this can be solved using -interface 
	
	public static class A{
		void checkA() {
			System.out.println("Hello");
		}
	}
	public static class B{
		void checkA() {
			System.out.println("Hi");
		}
	}
	public static class C extends A,B{ // jvm doesn't understand from class A or class B, checkA method has to choose 
		void check() { 
			System.out.println("NOT SUPPORTED");
		}
	}
	public static void main(String[] args) {
		C c = new C();
		c.checkA(); // Ambiguity - acheived through interface

	}

}
