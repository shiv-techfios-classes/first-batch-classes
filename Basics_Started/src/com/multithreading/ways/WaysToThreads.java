package com.multithreading.ways;


class WorkingRunnable implements Runnable{

	@Override
	public void run() {
		
		System.out.println("Working with non-anonymous class");
		

		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Ending------------");
		
	}
	
	
	
}

public class WaysToThreads {

	public static void main(String[] args) {
	
		/**
		 * Anonymous inner class in Java
		 */
		
		Runnable rb = new Runnable() {
			
			@Override
			public void run() {
				
				System.out.println("I am in runnable");
				
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				
				System.out.println("Finished with executing runnable");
				
			}
		};
		
		Thread t1 = new Thread(rb);
		
		Thread t2 = new Thread(new WorkingRunnable());
		

		
	//	t1.start();
		
		System.out.println(t2.getState());
		
		t2.start();
		
		System.out.println(t2.getState());
		
		
		System.out.println(t2.getState());
		

	}

}
