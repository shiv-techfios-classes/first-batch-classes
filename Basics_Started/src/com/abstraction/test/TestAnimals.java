package com.abstraction.test;

import java.util.ArrayList;
import java.util.List;


public class TestAnimals {

	public static void main(String[] args) {
		
		
		Animal h1 = new Horse("first");
			 	
		//downcasting example

		Animal h2 = new Horse("second");
		
		Animal h3 = new Horse("third");
		
		List<Animal> myHorses =  new ArrayList<>();
		
		myHorses.add(h1);
		
		myHorses.add(h2);
		
		myHorses.add(h3);
		
		Horse hr;
		
		Mule mul;
		
		Animal m1  = new Mule("Mulesoft application.");
		
		myHorses.add(m1);
		
		for(Animal ae : myHorses) {
		
			//downcast to horse type from animal type
		
			if(ae instanceof Horse) {
				
				hr =(Horse)ae;
				hr.doHorseStuff();
			
			} else if (ae instanceof Mule) {
				
				mul = (Mule)ae;
				mul.muleStuff();
				
			}
		
			
		}
		
	}

}
