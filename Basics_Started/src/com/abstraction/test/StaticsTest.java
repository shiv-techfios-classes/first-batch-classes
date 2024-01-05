package com.abstraction.test;

public class StaticsTest {

	static int count =1;
	
	public static void main(String[] args) {
		
		doSomeStuff();		

	}
	
	void doStaticThing() {
		
		StaticsTest.doSomeStuff();
		
		Math.max(2, -2);
		
		doSomeStuff();
	}
	
	
	public static void doSomeStuff() {
		
		while(count<=10) {
			
			if(count%2==0) {
			
				System.out.println(count);
			}
			
			count++;
			
		}
	}

}
