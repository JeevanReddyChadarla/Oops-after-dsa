package _8_exceptionhandling;

public class _1_Exception {

	// when an exception occurs - 
	// 1. we get stack trace
	// 2. the lines below the exeption will not be executed
	public static void method1(){
		System.out.println("Inside met1");
		String str = null;
		str.length();
	}
	public static void main(String[] args) {
		System.out.println("Hello");
		method1();
		System.out.println("After exe");
	}

}
