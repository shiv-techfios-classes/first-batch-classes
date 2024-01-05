package com.abstraction.test;

public class TestingInterfaces {

	public static void main(String[] args) {
		
		
		A t1 = new Demo();
		
		t1.printA();
		
		A t2 = new CodingInterfaces();
		
		t2.printA();
		
		B t3;
		
		t3=  new CodingInterfaces();
		
		t3.printB();
		
		t3.printA();
		
		
		t2 = t3;
		
		t3 = (B)t2;
		
		t3.printB();
	

	}

}

interface A{
	
	void printA();
}

interface B extends A{
	
	void printB();
}

interface l extends B {

	void printC();
}


interface D {
	
}

class CodingInterfaces implements D, B {

	void c1() {
		
	}
	
	static  void c2() {
		
	}
	
	
	@Override
	public void printA() {
		System.out.println("Do some A stuff");
		
	}

	@Override
	public void printB() {
		System.out.println("Do some B stuff");
		
	}
	
}


class Demo implements A{

	@Override
	public void printA() {
		
		System.out.println("Inside Demo print.");
		
	}
	
	
	
}