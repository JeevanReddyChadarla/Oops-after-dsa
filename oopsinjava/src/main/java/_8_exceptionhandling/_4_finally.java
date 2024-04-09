package _8_exceptionhandling;

import java.util.Scanner;

// finally is executed every time, 
// finally is executed when there is an execption
// finally is executed when there is no execption

//when is the line in finally is not executed ?
	// when jvm crash happen - System.exit(1)
	// when an exception occurs inside finally block

public class _4_finally {
	public static void main(String[] args) {
		// scanner has to be closed when we use it.
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			int nums[] = {2,3,4};
			int number = nums[8];//nums[2];
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sc.close(); // we can put null check here -> if(sc!=null) then close it.
			System.out.println("finally has closed scanner");
		}
	}

}
