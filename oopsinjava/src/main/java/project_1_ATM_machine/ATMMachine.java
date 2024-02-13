package project_1_ATM_machine;

import java.util.Scanner;

public class ATMMachine {
	
	public static class ATM{
		Scanner sc=new Scanner(System.in);
		final int PIN=1234;
		int balance=0;
		public void checkPin(){
			System.out.println("Enter your pin : ");
			int enteredPin = sc.nextInt();
			if(PIN==enteredPin) {
				System.out.println("Successfully logged in : ");
				menu();
			}else {
				System.out.println("Enter correct pin ");
			}
		}	
		public void menu() {
			System.out.println("Select any : ");
			System.out.println("1. get Balance");
			System.out.println("2. deposit money");
			System.out.println("3. withdraw money");
			System.out.println("4. Exited ");
			
			int selected = sc.nextInt();
			switch (selected) {
			case 1:
				getBalance();
				menu();
				break;
			case 2:
				deposit();
				menu();
				break;
			case 3:
				withdraw();
				menu();
				break;
			case 4:
				System.out.println("Successfully logged out: ");
				return ;
			}
		}
		public int getBalance() {
			System.out.println("Available balance is : "+balance);
			return balance;
		}
		public void deposit() {
			System.out.println("Enter amount to deposit : ");
			int amountToDeposit = sc.nextInt();
			balance+=amountToDeposit;
			getBalance();
		}
		public void withdraw() {
			System.out.println("Enter money to withdraw ");
			int withdraw = sc.nextInt();
			if(withdraw<balance) {
				balance-=withdraw;
				getBalance();
			}
			else
				System.out.println("low balance, unable to proceed");
		}
	}

	public static void main(String[] args) {
		ATM a = new ATM();
		a.checkPin();
	}

}
