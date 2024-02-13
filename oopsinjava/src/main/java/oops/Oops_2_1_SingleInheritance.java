package oops;

public class Oops_2_1_SingleInheritance {

	// single inheritance - one child and one parent
	static class Employee{
		void salary(){
			System.out.println("salary = 70000");
		}
	}
	static class Hr extends Employee{
		void bonus() {
			System.out.println("bonus = 20000");
		}
	}
	// single inheritance 
	public static void main(String[] args) {
		Employee e = new Employee(); // parent
		e.salary();
		Hr h = new Hr(); //child
		h.salary();
		h.bonus();
	}

}
