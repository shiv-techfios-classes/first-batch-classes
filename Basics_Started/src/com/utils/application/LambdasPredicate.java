package com.utils.application;

import java.util.HashSet;
import java.util.Set;

public class LambdasPredicate {

	public static void main(String[] args) {
		
	//	List<String> names = Arrays.asList(new String[]{"One", "Two", "Three"});
		
		Set<String> names = new HashSet<String>();
		
		names.add("one");
		
		names.add("two");
		
		names.add("three");
		
		names.add("XA");
		
		/**
		 * What is a predicate?
		 * 
		 * Predicate is an expression which evaluates to a boolean(true, false)
		 *  
		 * 
		 */
			
		
		names.stream().forEach(System.out::println);
		
		
		names.removeIf(str -> str.length()>10);
	
		names.removeIf(str -> str.equals("XA") || str.equalsIgnoreCase("oNE"));
		
		System.out.println(names);

	}

}
