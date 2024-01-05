package com.oops.basics;

public class TestShoppingCart {

	public static void main(String[] args) {
		
	Shirt item1 = new Shirt(101, "Louis Philipe", "Cotton dotted shirt", 10, "Extra Large");	
    
	Shirt item2 = new Shirt(801, "Peter england", "plain white shirt", 20, "Medium");
		
		
		Shirt item3 = new Shirt();
		
		Shirt item4 = new Shirt(230, "XXL");
		
		Shirt[] cart = new Shirt[3];
		
		cart[0] = item1;
		cart[1] = item2;
		
		System.out.println("item1:" + cart[0] +"\n\nitem2:" + cart[1]);
		
		

	}

}
