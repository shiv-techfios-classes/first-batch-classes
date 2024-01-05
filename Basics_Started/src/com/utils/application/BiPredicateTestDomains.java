package com.utils.application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class BiPredicateTestDomains {

	public static void main(String[] args) {
		
		List<Domain> domains =  new ArrayList<>();
		
		domains.add(new Domain("google.com", 1));
		domains.add(new Domain("zoom.com", 2));
		domains.add(new Domain("zoomit.com", 3));
		domains.add(new Domain("realplayer.com", 7));
		
		BiPredicate<String, Integer> bi = (domain, score) ->{
			
			return (domain.equalsIgnoreCase("Google.com") || score>21);
			
		};
		
		BiPredicate<String, Integer> bizoom = (domain, score) ->{
			
			return (domain.indexOf("zoom") != -1);
			
		};
		
		System.out.println(filterBadDomains(domains, bi));
		
		System.out.println(filterBadDomains(domains, bizoom));
		
	    

}
	
@SuppressWarnings("unchecked")
public static <T extends Domain> List<T> filterBadDomains(List<Domain> list,
		BiPredicate<String, Integer> predicate) {
	
	
	return (List<T>) list.stream().filter(x -> predicate.test(x.getName(),
			x.getScore()))
			.collect(Collectors.toList());
  }

}


