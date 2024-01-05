package com.oops.basics;

public class TimesTest {

	public static void main(String[] args) {
		
	//	TimesTest test = new TimesTest();
		
		TimesWhat mul  = new TimesWhat(3);
		
		int result = mul.mutiply(2);
		
		System.out.println(result);
		
		Product p1 = (Product)mul;
		
		Product p2 = new TimesTwo();
		
		//downcasting will work here as the object is of type TimesTwo
		
		TimesTwo tm2 = (TimesTwo)p2;
		
		System.out.println(tm2);

	}

}

 class Product { 
    int multiplyBy;
    
    public Product( int multiplyBy ) {
        this.multiplyBy = multiplyBy;
    }

    public int mutiply(int val) {
       return multiplyBy * val;
    }
}

class TimesTwo extends Product {
	
    public TimesTwo() {
        super(2);
    }
}

class TimesWhat extends Product {
	
    public TimesWhat(int what) {
        super(what);
    }
}
