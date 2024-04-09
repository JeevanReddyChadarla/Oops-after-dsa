package _8_exceptionhandling;

public class _3_try_multiple_catch {

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
		}catch (NullPointerException ex) {
			ex.printStackTrace();
			System.out.println("Occurs inside npe");
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("this is untouched since the exeception is handled in the abpve catch block");
		}
	}

}
