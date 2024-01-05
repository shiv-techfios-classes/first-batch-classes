package com.utils.application;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;


class EmployeesByName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getName().compareTo(o2.getName());
	}	
	
}


class EmplyeesByIds implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		Integer id1 = o1.getId();
		Integer id2 = o2.getId();
		
	
		return id1.compareTo(id2);
	}	
	
	
}


public class ComparatorsTest {

	public static void main(String[] args) {
		
		List<Employee> emps =  new LinkedList<>();
		
		emps.add(new Employee(201, "Rohit", "MTS" ));
		
		emps.add(new Employee(203, "Sohan", "DEO"));
		
		emps.add(new Employee(211, "Mohan", "Programmer"));
		
		emps.add(new Employee(209, "Bhaskar", "On Hold"));
		
		
		Comparator<Employee> empComp = new EmployeesByName();
		
		Comparator<Employee> empsCompIDs = new EmplyeesByIds();
		
		System.out.println("Before sorting by ID:" + emps);
		
		Collections.sort(emps, empsCompIDs);
		
		System.out.println("After sorting:" + emps);
		
		
	
		Comparator<Employee> empByName = new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				
				return o1.getName().compareTo(o2.getName());
			}		
			
			
		};
		
		Comparator<Employee> empById = new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				
				Integer id1 = o1.getId();
				Integer id2 = o2.getId();
				
				return id1.compareTo(id2);
			}
		
		};
		
		
		Comparator<Employee> sortbyId = (Employee o1, Employee o2) -> {
		
			Integer id1 = o1.getId();
			Integer id2 = o2.getId();
			
			return id1.compareTo(id2);
		
			
		};
		
		
		
		Collections.sort(emps, empById);
		
	    System.out.println("Sorted via ID:"+emps);
	    
	    Collections.sort(emps, empByName);
	    
	    System.out.println("Sorted via Names:"+emps);
	
		
		

	}

}
