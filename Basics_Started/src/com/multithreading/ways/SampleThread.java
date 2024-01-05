package com.multithreading.ways;

import static org.junit.Assert.*;

import java.util.StringTokenizer;

import org.junit.Test;


public class SampleThread extends Thread {

	public int processingCount = 5;

	String msg = "Nish:Charu:Yasmeen:Ashok";

	StringTokenizer color_delim = new StringTokenizer(msg, ":");
	
	
    @Override
    public void run() {
       	
    	System.out.println("Thread " + this.getName() + " started");
      
//    	while (processingCount > 0) {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//               // LOGGER.info("Thread " + this.getName() + " interrupted");
//            	System.out.println("Thread " + this.getName() + " interrupted");
//            }
//           
//            processingCount--;
//           
//            System.out.println("Inside Thread " + this.getName() + ", processingCount = " + processingCount);
//        }
    	
    	
		int count =0 ;
		

		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		while(color_delim.hasMoreTokens()) {
			
			++count;
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			System.out.println("Token"+ count + ":" + color_delim.nextToken());
		}
    	
        System.out.println("Thread " + this.getName() + " exiting");
    }
    
    
    @Test
    public void givenStartedThread_whenJoinCalled_waitsTillCompletion() 
      throws InterruptedException {
    
    	Thread t2 = new SampleThread();
        t2.start();
        System.out.println("Invoking join");
        t2.join(20000);
   //     t2.join();
        System.out.println("Returned from join");
        assertFalse(t2.isAlive());
    }
}













