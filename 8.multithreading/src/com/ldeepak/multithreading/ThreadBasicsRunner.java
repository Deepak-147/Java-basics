package com.ldeepak.multithreading;

// Way 1: By extending Thread class
class Task1 extends Thread {
	public void run() {
		System.out.println("\nTask 1 Started ...\n");
		
		for (int i=101; i<=199; i++) { 
			System.out.println(i + " ");
		}
		
		System.out.println("\nTask 1 finished ...\n");
	}
}

// Way 2: By implementing Runnable
class Task2 implements Runnable	{

	@Override
	public void run() {
		System.out.println("\nTask 2 Started ...\n");
		
		for (int i=201; i<=299; i++) { 
			System.out.println(i + " ");
		}
		
		System.out.println("\nTask 2 finished ...\n");
	}
	
}

public class ThreadBasicsRunner {

	public static void main(String[] args) throws InterruptedException {
		
		// Task1
		Task1 task1 = new Task1();
		task1.setPriority(1); // it's a request and not a guarantee. It may or may not be honoured.
		
		task1.start(); // NOT task1.run()
//		System.out.println("\nTask 1 Started ...\n");
//		
//		for (int i=101; i<=199; i++) { 
//			System.out.println(i + " ");
//		}
//		
//		System.out.println("\nTask 1 finished ...\n");
		
		// Task2
		Task2 task2 = new Task2();
		Thread task2Thread = new Thread(task2);
		task2Thread.setPriority(10); // it's a request and not a guarantee. It may or may not be honoured.
		task2Thread.start();
		
//		System.out.println("\nTask 2 Started ...\n");
//		
//		for (int i=201; i<=299; i++) { 
//			System.out.println(i + " ");
//		}
//		
//		System.out.println("\nTask 2 finished ...\n");
		
		task1.join(); // wait for task1 to complete
		task2Thread.join(); // wait for task2 to complete
		
		// Task 3 starts execution only after task1 and task2 are complete (because of join() above)
		// Task3
		System.out.println("\nTask 3 Started ...\n");
		
		for (int i=301; i<=399; i++) { 
			System.out.println(i + " ");
		}
		
		System.out.println("\nTask 3 finished ...\n");
		
		System.out.println("\nMain finished ...\n");
	}

}
