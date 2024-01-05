package com.oops.basics;

import java.util.StringTokenizer;

public class StringTokens {

	public static void main(String[] args) {
		
		
		String message = "Windows automatically reboots sometimes!";
		
		String msg = "Nish:Charu:Yasmeen:Ashok";
		
		StringTokenizer str = new StringTokenizer(message, " ");
		

		StringTokenizer color_delim = new StringTokenizer(msg, ":");
		
		int count =0 ;
		
		while(str.hasMoreTokens()) {
			
			++count;
			
			System.out.println("Token"+ count + ":" + str.nextToken());
		}
		
		count =0;
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		while(color_delim.hasMoreTokens()) {
			
			++count;
			
			System.out.println("Token"+ count + ":" + color_delim.nextToken());
		}

	}

}
