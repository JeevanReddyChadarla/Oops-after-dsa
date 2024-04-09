package _8_exceptionhandling;

public class _2_try_catch {

	public static void main(String[] args) {
		method2();
		System.out.println("In main method");
	}
	
	public static void method2() {
		method1();
		System.out.println("In method 2");
	}
	
	public static void method1() {
		try {
			String str = null;
			str.length();
			System.out.println("exe for null length");
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("printing after execption");
		}
	}

}
