package com.oops.basics;

public abstract class Vehicle {
	
	public Vehicle() {
		
	}
	
	public Vehicle(String regNO) {
		
	}
	
	void display(String msg) {
		
		System.out.print("printing:" + msg);
	}
	
	abstract void applybrakes();
	
	abstract void accelerate();
	
	

}

class FourWheelers extends Vehicle {

	
	public static void main(String... args) {
		

	}
	
	@Override
	void applybrakes() {
		// TODO Auto-generated method stub
		
		
		
		
	}

	@Override
	void accelerate() {
		// TODO Auto-generated method stub
		
	}
		
}

abstract class HeavyVehicles extends Vehicle{
	
	abstract void doSomeHeavyStuff();
	
	
}

class Tempo extends HeavyVehicles {

	@Override
	void doSomeHeavyStuff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void applybrakes() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void accelerate() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}











