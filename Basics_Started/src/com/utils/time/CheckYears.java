package com.utils.time;

import java.time.*;

public class CheckYears {
	
	public static boolean isLeapYear(int year) {
		
		boolean is_leap_year = false;
		
		Year ye = Year.of(year);
		
		if (ye.isLeap()) {
			
			System.out.printf("It is indeed a leap year");
			
			is_leap_year = true;
			
		} else {
			
			System.out.println("\n \nSorry! Not a leap year");
		}
		
		return is_leap_year;
		
	}
	
	public static void main(String...strings ) {
		
		isLeapYear(2020);		
		
		isLeapYear(2023);
		
		
	}
	

}
