package com.utils.batch;

public class TestExceptions {

	public static void main(String[] args) {
		
		
		int[] numbers = {1,2,3,4,5};
		
		/**
		 * allowed index here is from numbers[0] to numbers[4]
		 */
		
		try {
			
			System.out.println("the sixth element is:" + numbers[5]);	
			
		} catch(ArrayIndexOutOfBoundsException aie) {
			
			System.out.println("--Invalid array index accessed--only index from 0 to 4 is allowed.");
			
		}
		
		System.out.println("I want to print after the array access.");
		
		
		

	}

}
