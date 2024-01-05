package com.utils.application;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerExamples {

	public static void main(String[] args) throws IOException {

		// create scanner for the CSV file
		
		System.out.println(System.getProperty("user.dir")+ "\\src");
		
		Scanner sc = new Scanner(new File(System.getProperty("user.dir")+"\\src"+"\\employees.csv"));

		// set delimiter as new line to read one line as a single token
		sc.useDelimiter(System.getProperty("line.separator"));

		// create the List of Employees
		List<Employee> emps = new ArrayList<>();
		
		StringBuilder summ =  new StringBuilder();

		while (sc.hasNext()) {
			
			Employee emp = parseEmployeeData(sc.next());
			
			if(emp.getName().indexOf("khil")!=-1) {
				System.out.println("Khil printed.");
			}
			
	       summ.append(emp);
			
		//	System.out.println("Hashcode of ID:"+ emp.getId() +" equals:" + emp.hashCode());
			emps.add(emp);
		}

		// close the scanner
		sc.close();

		System.out.println("-----------------"+summ);
		
		
		// print employee records
		
		emps.stream().forEach(System.out::println);
		
	//	System.out.println(emps);
	}

	private static Employee parseEmployeeData(String record) {
		// create scanner for the String record
		Scanner sc = new Scanner(record);

		// set delimiter as comma
		sc.useDelimiter(",");

		Employee emp = new Employee();
		emp.setId(sc.nextInt());
		emp.setName(sc.next());
		emp.setRole(sc.next());

		// close the scanner
		sc.close();

		return emp;
	}

}

