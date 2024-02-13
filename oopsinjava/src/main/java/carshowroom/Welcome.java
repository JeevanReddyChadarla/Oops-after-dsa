package carshowroom;

import java.util.Scanner;

public class Welcome {
	Scanner sc = new Scanner(System.in);
	public int choise;
	public void WelcomeNote() {
		System.out.println("============== Welcome to car system management system =================");
		System.out.println("==================== *** Enter your choice *** =======================");
		System.out.println("1. ADD SHOWROOM			2. ADD EMPLOYEES		3. ADD CARS");
		System.out.println("4. GET SHOWROOM			5. GET EMPLOYEES		6. GET CARS");
		System.out.println("==================== *** Enter 0 to exit *** ======================");
		choise=sc.nextInt();
	}
}
