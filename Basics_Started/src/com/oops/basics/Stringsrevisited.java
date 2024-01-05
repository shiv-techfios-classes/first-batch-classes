package com.oops.basics;

import java.util.GregorianCalendar;

public class Stringsrevisited {

	public static void main(String[] args) {
		
		
		System.gc();
		
		
		long start=new GregorianCalendar().getTimeInMillis();
		
		
		long startMemory=Runtime.getRuntime().freeMemory();
		
		StringBuffer sb = new StringBuffer();
		
		// StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i<20000000; i++){
			
			sb.append(":").append(i);
		}
		
		
		long end=new GregorianCalendar().getTimeInMillis();
		
		long endMemory=Runtime.getRuntime().freeMemory();
		
		System.out.println("Time Taken:"+(end-start));
		
		System.out.println("Memory used:"+(startMemory-endMemory));

	}

}
