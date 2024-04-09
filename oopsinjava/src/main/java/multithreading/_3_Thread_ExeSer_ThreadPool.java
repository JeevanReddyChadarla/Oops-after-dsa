package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread{
	private int number;
	Task(int number){
		this.number = number;
	}
	
	public void run() {
		System.out.println("\nThread "+number+" has started");
		for(int i=number;i<100*number+99;i++) {
			System.out.print(i+" ");
		}
		System.out.println("\nThread "+number+" has completed");
	}
}

public class _3_Thread_ExeSer_ThreadPool {

	public static void main(String[] args) {
		ExecutorService exeSer = Executors.newFixedThreadPool(2);
		// newFixedThreadPool(2) - at any point in time, exeSer will have 2 threads running
		// if one thread is completed, then immediately another thread starts
		// and maintains the thread count to 2 
		Task t1 = new Task(1);
		Task t2 = new Task(2);
		Task t3 = new Task(3);
		Task t4 = new Task(4);
		Task t5 = new Task(5);
		
		exeSer.execute(t1);
		exeSer.execute(t2);
		exeSer.execute(t3);
		exeSer.execute(t4);
		exeSer.execute(t5);
		exeSer.shutdown();
	}

}
