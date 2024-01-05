package com.oops.basics;

import java.util.LinkedList;
import java.util.List;

public class WrapperClasses {

	public static void main(String[] args) {
		
		double amount = 12.5;
		
		int age = 23;
		
		String dob = "219985555";
		
		String department = "Accounts";
		
		
		double yearlySales[] = {231, 345, 758.46, 356};
		
		Double firstYearSales = Double.valueOf(yearlySales[0]);
		
		firstYearSales = new Double(231);
		
		List<Double> salesList = new LinkedList<>();
		
		salesList.add(firstYearSales);
		
		//boxing and unboxing
		Integer wrapper_dob;
		
		try {
			
			wrapper_dob = Integer.parseInt(dob);
			
		}catch (NumberFormatException nfe) {
			
			System.out.println("Inside catch block for Number format exception");
			
		}
		Integer wrappedAge = Integer.valueOf(age);
		
         
		
		
		System.out.print(wrappedAge);
		
	}

}
