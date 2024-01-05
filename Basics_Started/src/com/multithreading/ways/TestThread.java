package com.multithreading.ways;



class PrintDemo {
	
	   public void printCount() {
	
		   try {
	       
			   for(int i = 5; i > 0; i--) {
	           
				   System.out.println("Counter   ---   "  + i );
	         }
	      } catch (Exception e) {
	         
	    	  System.out.println("Thread  interrupted.");
	      }
	   }
	}

class ThreadDemo extends Thread {
	   private Thread t;
	   private String threadName;
	   PrintDemo  PD;

	   ThreadDemo( String name,  PrintDemo pd) {
	      threadName = name;
	      PD = pd;
	   }
	   
	   public void run() {
	      synchronized(PD) {
	    	  
	         PD.printCount();
	      }
	      System.out.println("Thread " +  threadName + " exiting.");
	   }

	   public void start () {
	      System.out.println("Starting " +  threadName );
	      if (t == null) {
	         t = new Thread (this, threadName);
	         t.start ();
	      }
	   }
	}

public class TestThread {

	   public static void main(String args[]) {
	      PrintDemo PD = new PrintDemo();

	      ThreadDemo T1 = new ThreadDemo( "Thread - 1 ", PD );
	      ThreadDemo T2 = new ThreadDemo( "Thread - 2 ", PD );
	      ThreadDemo T3 = new ThreadDemo( "Thread - 3 ", PD );
	      ThreadDemo T4 = new ThreadDemo( "Thread - 4 ", PD );
	      ThreadDemo T5 = new ThreadDemo( "Thread - 5 ", PD );

	      T1.start();
	      T2.start();
	      T3.start();
//	      T4.start();
//	      T5.start();

	      // wait for threads to end
	      try {
	    	  
	    	T3.join();
	    	T2.join();
	    	T1.join();
	         
	      } catch ( Exception e) {
	         System.out.println("Interrupted");
	      }
	   }
	   
}