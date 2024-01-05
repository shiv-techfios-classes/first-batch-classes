package com.multithreading.ways;

public class FactorialTest {
	
	static {
		
		System.out.println("Hi from a static block");
	}
	
	
	
	{
		System.out.println("Instance block");
	}
	

	public static void main(String[] args) {

		System.out.println("factorial(5):"+ factorial(5));
		System.out.println("factorial(4):"+ factorial(4));
		System.out.println("factorial(31):"+ factorial(13));
		
		
		FactorialTest ft = new FactorialTest();
		
		FactorialTest ftest = new FactorialTest();
		
	//	ft.factorial(9);

	}

	private static long factorial(int i) {
		
		if(i>=1) return factorial(i-1)*i;
		
		else return 1;
	}

}
