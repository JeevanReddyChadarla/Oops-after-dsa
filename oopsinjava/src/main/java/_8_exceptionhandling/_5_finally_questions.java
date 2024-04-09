package _8_exceptionhandling;

import java.util.Scanner;

//when is the line in finally is not executed ?
	// when jvm crash happen - System.exit(1)
	// when an exception occurs inside finally block


public class _5_finally_questions {
	
	private static void method2() {
		Scanner sc = new Scanner(System.in);
		try {
			String str = null;
			str.toString();
			return ;
		}catch(Exception e){
			
		}finally {
			sc.close();
		}
	}
	
	private static void method3() {
		Scanner sc = new Scanner(System.in);
		try {
			String str = null;
			str.toString();
			return ;
		}// there is no catch block here
		finally {
			sc.close();
		}
	}
	
	public static void main(String[] args) {
		method2(); // will finally executes here ? - yes
		method3(); // does not have catch, will it compile ? - yes
	}

}
