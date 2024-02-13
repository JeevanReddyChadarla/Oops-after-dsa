package carshowroom;

import java.util.Scanner;

public class AddShowRoom {
		Scanner sc = new Scanner(System.in);
		String showroomName;
		String showroomAddress;
		String showroomManagerName;
		int totalNoOfEmployees;
		int totalNoOfCarsInStock;
		
		public void AddShowroom() {
			System.out.println("============== *** Enter showroom details *** ================= ");
			System.out.println("Showroom Name : ");
			showroomName = sc.next();
			System.out.println("Showroom Address : ");
			showroomAddress = sc.next();
			System.out.println("Showroom Manager Name : ");
			showroomManagerName = sc.next();
			System.out.println("Total number of employees : ");
			totalNoOfEmployees = sc.nextInt();
			System.out.println("Total number of cars in stock : ");
			totalNoOfCarsInStock = sc.nextInt();
			
			System.out.println("Added successfully");
			MiddleWare m = new MiddleWare();
			m.MiddleWareChoose();
	}
}
