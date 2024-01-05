package com.oops.basics;

public class TestClothings {

	public static void main(String[] args) {
		
		FormalShirt sh1 = new FormalShirt();
		doSomeStuff(sh1);
		
		Trousers ts1 =  new Trousers();
		
		System.out.println(doSomeStuff(ts1));
		
		//doSomeStuff(ts1);

	}
	
	public static String doSomeStuff(Clothings c1) {
		
		if(c1 instanceof Trousers) {
			
			Trousers trobj= (Trousers)c1;
		//	trobj.display1233();
			
			c1.display();
			
			return "formal trousers";
		} else if (c1 instanceof FormalShirt) {
			
			return "formal shirts";
		}
		
		return "a piece of clothing";
		
	}

}
