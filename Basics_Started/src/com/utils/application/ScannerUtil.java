package com.utils.application;

import java.util.Scanner;

public class ScannerUtil {

	public static void main(String[] args) {
		
	/**	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Pls enter your name:");
		
		String name = sc.nextLine();
		
		sc.useDelimiter("\\n");
		
		System.out.println("Hi:" + name);
	*/	
		
		Scanner scr = new Scanner("123-456-678");
		
		scr.useDelimiter("-");
		
		while(scr.hasNext()) {
			
			System.out.println(scr.next());
		}
		
		
		
		
		
		

	}

}
