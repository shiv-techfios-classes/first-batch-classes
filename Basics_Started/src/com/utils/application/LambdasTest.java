package com.utils.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdasTest {

	public static void main(String[] args) {
		
		
		String[] words = {"Two", "Three", "One", "Harry Potter", "Sherlock Holmes"};
		
		
	     List<String> wordsList =   Arrays.asList(words);
	     

    	 System.out.println(wordsList.getClass());
	     
	     
	  
	     wordsList.replaceAll(	    		 
	    		    		 
	    	    	 xy ->  xy.toLowerCase()
	    	
	      );
	     
	     System.out.println(wordsList);
	     
	     List<String> alpha = Arrays.asList("A", "B", "C", "D", "E");
	     
	//     alpha.remove(0);
	     
	     alpha.replaceAll(e->e.toLowerCase());
	     
	     alpha.forEach(System.out::print);
	     
	     ArrayList<String> alphabets = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E"));
	     
	     System.out.println(alphabets);
	     
	     alphabets.remove(0);
	      
	     alphabets.replaceAll( e -> e.toLowerCase() );  
	      
	     System.out.println(alphabets);


	    for (String str:wordsList) {
	    	 
	    	 System.out.println("Converted:" +str.toUpperCase());
	    	 
	     }
	     
	     System.out.println("Original Collection:"+ wordsList);
	     
	       
	}
	
	
    static String capital(String x) {
		
		
		return x.toUpperCase();
	}

}
