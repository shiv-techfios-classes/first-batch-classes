package com.utils.batch;

public class TernaryCheck {

	public static void main(String[] args) {
		
		boolean canVote = false;
		
		int age = 11;
		
		canVote = (age>=18)?true:false;
		
		String msg = canVote?"You can vote":"You need to wait.";
		
		System.out.println(msg);
		
		//max using ternary operator
		
		int firstcomp = maxofthree(10, 20, 5);
		
		System.out.print(firstcomp);
		

	}
	
	static int maxofthree(int a, int b, int c) {
		
		
		return (a>b)?(a>c)?a:c:(b>c)?b:c;
	}

}
