package _7_multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class TaskOne extends Thread{
	public void run() {
		System.out.println("\nTask One started");
		for(int i=0;i<100;i++) {
			System.out.print(i+" ");
		}
		System.out.println("\nTask One completed");
	}
}

class TaskTwo implements Runnable{
	@Override
	public void run() {
		System.out.println("\nTask Two started");
		for(int i=100;i<200;i++) {
			System.out.print(i+" ");
		}
		System.out.println("\nTask Two completed");
	}
	
}

public class _2_THread_ExecutorService {

	public static void main(String[] args) {
		
		TaskOne t1 = new TaskOne(); 
		TaskTwo t2 = new TaskTwo();
		Thread thread2 = new Thread(t2);
		
		ExecutorService exeSer = Executors.newSingleThreadExecutor();
//		newSingleThreadExecutor - will execute only one thread at a time
//		below we have assigned two threads to exeSer, 
//		thread2 will start only after thread1 is completed
//		while the main thread runs in parallel
		exeSer.execute(t1);
//		only after t1 is finished thread2 will start the execution in newSingleThreadExecutor
		exeSer.execute(thread2);
//		Always shoutdown the exeSer once execution - else the code will be running in the background
		exeSer.shutdown();
		
		System.out.println("\nTask Three started");
		for(int i=300;i<400;i++) {
			System.out.print(i+" ");
		}
		System.out.println("\nTask Three completed");

	}

}
