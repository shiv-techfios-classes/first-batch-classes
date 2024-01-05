package com.abstraction.test;

class Animal {
	
	public void canEat() {
		
		System.out.println("Animals do eat.");
	}
	
	public void makeNoise() {
		
		System.out.println("Animals make lot of noise");
	}

}


class Horse extends Animal {
	
   String name;
   
   public Horse(String nam) {
	   
	   this.name = nam
			   ;
   }
	void doHorseStuff() {
		
		System.out.println("Horse:" + name);
		
	}
	
	public void makeNoise() {
		
		System.out.println("Horses make unique sounds.");
	}
	
}

class Mule extends Animal{
	
	String message;
	
	public Mule(String msg) {
		
		this.message = msg;
		
	}
	 
	public void muleStuff() {
		
		System.out.println("In Mule:" + message);
	}
	 

}




