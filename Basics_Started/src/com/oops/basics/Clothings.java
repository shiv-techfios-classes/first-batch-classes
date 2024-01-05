package com.oops.basics;

public class Clothings {
	
    protected  void doSomePrivateStuff() {
		
		System.out.println("privacy violation.");
	}

	
	public final void display() {
		
		System.out.println("Inside display of clothing class.");
		System.out.println("Inside display of clothing class.");
		System.out.println("Inside display of clothing class.");
		System.out.println("Inside display of clothing class.");
		System.out.println("Inside display of clothing class.");
		System.out.println("Inside display of clothing class.");
		System.out.println("Inside display of clothing class.");
		
	}
	
	public void getColor() {
		
		System.out.println("Inside getcolor of Clothings class");
		
	}

	
}


class FormalShirt extends Clothings{
	
	
	private int fit = 2;
	
	public int getFit() {
		
		return fit;
	}
	
}

class Trousers extends Clothings {
	
	public void display1233() {
		

		System.out.println("---------------Inside Trousers subclass");
		
		super.doSomePrivateStuff();
		
		super.getColor();
		
	}
	
	
	public void getColor() {
		
		System.out.println("return color of Trouser class");
	}
	
	
	
	
}