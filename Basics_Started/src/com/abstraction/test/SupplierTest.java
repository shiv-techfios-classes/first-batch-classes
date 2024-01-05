package com.abstraction.test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Supplier;

public class SupplierTest {
	
	private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:MM");	
	

	public static void main(String[] args) {
		
		
		Supplier<Double> sup = () -> Math.random();
		
		
		System.out.println(sup.get());
		
		
		Supplier<String> welcomeMsg = () -> {
			
			String hi = "Hello.";
			
			String msg = "How are you doing.?";
			
			 return hi.concat(msg);
		};
		
		System.out.println(welcomeMsg.get());
		
		
        Supplier<LocalDateTime> s = () -> LocalDateTime.now();
        
        LocalDateTime time = s.get();

        System.out.println(time);

        Supplier<String> s1 = () -> dtf.format(LocalDateTime.now());
        String time2 = s1.get();

        System.out.println(time2);

        
        
	}

}
