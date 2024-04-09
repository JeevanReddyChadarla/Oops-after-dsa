package _7_multithreading;

import java.util.Arrays;

class Helper implements Runnable {
    public void run() {
        try {
            System.out.println("Hello 1");
            Thread.sleep(5000);
        }
        catch (InterruptedException e) {
            System.out.println("Hello 2");
        }
    }
}

public class Test implements Runnable {
    public void run() {
    	int arr[] = {4,3,5,9,6};
    	Arrays.asList(arr);
    }
    
    public static void main(String[] args) {
    	Test obj = new Test();
        Helper obj2 = new Helper();

        Thread thread1 = new Thread(obj);
        Thread thread2 = new Thread(obj2);

        thread1.start();
        thread2.start();

        ClassLoader loader = thread1.getContextClassLoader();
        System.out.println("@@@"+ loader);

        Thread thread3 = new Thread(new Helper());
        
        System.out.println(Thread.activeCount());
        thread1.checkAccess();

        Thread t = Thread.currentThread();

        System.out.println(t.getName());

        System.out.println("Hello 3    "+ thread1.getName());
        System.out.println("Hello 4    "+ thread1.getId());
        
        System.out.println("Hello 5    "+ thread1.getPriority());

        System.out.println(thread1.getState());

        thread2 = new Thread(obj2);
        thread2.start();
        thread2.interrupt();
        System.out.println("Hello 6    "+thread2.interrupted());
        
        System.out.println("Hello 7    "+thread2.isAlive());

        thread1 = new Thread(obj);
        thread1.setDaemon(true);
        System.out.println("Hello 8    "+thread1.isDaemon());
        System.out.println("Hello 9    "+thread1.isAlive());

        // Waiting for thread2 to complete its execution
        System.out.println("Hello 10");

        try {
            thread2.join();
        }

        catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread1.setName("hello 11");

        // Print and display command
        System.out.println("hello 12" + thread1.getName());

        // Setting the priority of thread1
        thread1.setPriority(5);
        thread2.yield();
        
        System.out.println(thread1.toString());

        // Getting list of active thread in current thread's group
        Thread[] tarray = new Thread[3];

        Thread.enumerate(tarray);

        // Display commands
        System.out.println("hello 13");
        System.out.printf("hello 14");

        // Looking out using for each loop
        for (Thread thread : tarray) {

            System.out.println(thread);
        }
        
        System.out.printf("hello 15");

        System.out.println(Thread.getAllStackTraces());

        ClassLoader classLoader = thread1.getContextClassLoader();
        System.out.println(classLoader.toString());
        System.out.println(thread1.getDefaultUncaughtExceptionHandler());

        thread2.setUncaughtExceptionHandler(thread1.getDefaultUncaughtExceptionHandler());
        thread1.setContextClassLoader(thread2.getContextClassLoader());
        thread1.setDefaultUncaughtExceptionHandler(thread2.getUncaughtExceptionHandler());

        thread1 = new Thread(obj);
        StackTraceElement[] trace = thread1.getStackTrace();

        System.out.println("hello 17");

        for (StackTraceElement e : trace) {
            System.out.println(e);
        }

        ThreadGroup grp = thread1.getThreadGroup();
        System.out.println("hello 18" +grp.toString());
        System.out.println(thread1.getUncaughtExceptionHandler());
        System.out.println("hello 19" + thread1.holdsLock(obj2));


        Thread.dumpStack();

	}
}