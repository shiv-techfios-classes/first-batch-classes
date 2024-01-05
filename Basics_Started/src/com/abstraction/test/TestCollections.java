package com.abstraction.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import com.utils.application.Employee;

public class TestCollections {

	public static void main(String[] args) {
		
		Map<Integer, Employee> staff = new HashMap<>();
		
		Map<Integer, Employee> sortedStaff = new TreeMap<>();
		
		boolean addHPPavilion= false;
		
	
//	    Set<String> names = new HashSet<>();
		
		Set<String> names = new TreeSet<>();
	    
	    names.add("Dell");
	    names.add("HP");
	    names.add("Lenovo");
	    names.add("Dell Inspiron 15");
	    
	    addHPPavilion= names.add("HP Pavilion");
	    
	    addHPPavilion = names.add("HP Pavilion");
	    
	    names.add("HP Pavilion");
	    

	    
	    names.stream().forEach(System.out::println);
	    
	    System.out.println(addHPPavilion);
	    
	    
	    Employee e1 = new Employee(11, "Mike", "DEO");
	    
	    Integer k1 = Integer.valueOf(e1.getId());
	    
	    Employee e2 = new Employee(12, "Wiki", "DEO");
	    
	    Integer k2 = Integer.valueOf(e2.getId());
	    
	    Employee e3 = new Employee(17, "Juno", "DEO");
	    
	    Integer k3, k4, k5;
	    
	    k3 = Integer.valueOf(e3.getId());
	    
	    Employee e4 = new Employee(31, "Taaro", "Programmer");
	    
	    k4 = Integer.valueOf(e4.getId());
	    
	    Employee e5 = new Employee(19, "Pihu", "DEO");
	    
	    k5 = Integer.valueOf(e5.getId());
	    
	    
	    staff.put(k1, e1);
	    
	    System.out.println("---------------Explore Maps-------------");
	    
	    
	    staff.get(e1.getId());
	    
	    staff.put(k2, e2);
	    
	    staff.put(k3, e3);
	    
	    
	    staff.put(k4, e4);
	    
	    staff.put(k5, e5);
	    
	    
	    /**
	    
	    System.out.println(staff);
	    
	    System.out.println(staff.keySet());
	    
	    
	    int count = staff.size();
	    
	    System.out.println("Total of " + count + " people.");
	    
	    staff.remove(k2);
	    
	    count = staff.size();
	    
	    System.out.println("Total of " + count + " people.");
	    
	    System.out.println(staff);
	    
	   
	    sortedStaff.putAll(staff);
	    
	    sortedStaff.put(Integer.valueOf(6), null);
	    
	   */
	    
	//    System.out.println("ID\t\tName\t\tRole");
		
	    for(Map.Entry<Integer, Employee> emps: staff.entrySet()) {
	    	
	    	
	    	
	    	System.out.println(	emps.getKey()+":" + emps.getValue().getName()+ ":" + emps.getValue().getRole() );
	    		    
	    	
	    }
	    
	    
	    
	    
	    
	    

	}

}
