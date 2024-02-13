package oops;

// multiple inheritance is achieved 
interface A{
	public void run();
}

interface B{
	public void run();
}

class C implements A,B{
	public void run() {
		System.out.println("Class c is running - ");
	}
}

public class Oops_2_5_multipleinheritance_througgh_interface {

	public static void main(String[] args) {
		A a = new C();
		B b = new C();
		C c = new C();
		
		a.run();
		b.run();
		c.run();
	}

}
