package _7_multithreading;

class Task1 extends Thread{
	public void run() {
		System.out.println("\nTask1 started");
		for(int i=10;i<100;i++) {
			System.out.print(i+"  ");
		}
		System.out.println("\nTask1 completed");
	}
}

class Task2 implements Runnable {
	public void run() {
		System.out.println("\nTask2 started");
		for(int i=100;i<200;i++) {
			System.out.print(i+"  ");
		}
		System.out.println("\nTask2 completed");
	}
}

public class _1_Thread_Creations {

	public static void main(String[] args) throws InterruptedException {//throws InterruptedException {
		Task1 t1 = new Task1();
		t1.start();
		t1.setPriority(10); // 1-low prority, 5-Normal, 10-max - but not gauranteed
		t1.sleep(10000);// this thread sleeps for 10 seconds and this will stop executing below lines for 10 sec
		t1.yield(); // this will request cpu that this thread can wait, but not gauranteed
		
		Task2 t2 = new Task2();
		Thread thread2 = new Thread(t2);
		thread2.start();
		thread2.setPriority(10);
		
		// t1.join(); // lines below this is executed onnly after thread1 is completed
		
		System.out.println("\nTask3 started");
		for(int i=1000;i<2000;i++) {
			System.out.print(i+"  ");
		}
		System.out.println("\nTask3 completed");


	}

}
