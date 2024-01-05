package com.oops.basics;

public class TestMethodOverloading {

	
	public void display() {
		
		System.out.println("Inside a vacant display method.");
	}
	
	public void display(String msg) {
		
		System.out.println("Received: " + msg);
	}
	
	public static void main(String[] args) {
				
	   TestMethodOverloading testObj = new TestMethodOverloading();

	   testObj.display();
	   
	   testObj.display("Hi! How are you?");
	   
	   
	}

}
