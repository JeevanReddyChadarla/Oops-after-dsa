package oops;


// hirarichal inheritance - 
// child b extends A
// child c extends A
class Aa {
	void print() {
		System.out.println("Is A : ");
	}
}
class Bb extends Aa{
	void printB() {
		System.out.println("Is B : ");
	}
}
class Cc extends Aa{
	void printC() {
		System.out.println("Is C : ");
	}
}

public class Oops_2_7_HieraricalInheritance {

	public static void main(String[] args) {
		Cc x = new Cc();
		x.print();
		x.printC();
	 // x.printB();  not possible since c extends from A

	}

}
