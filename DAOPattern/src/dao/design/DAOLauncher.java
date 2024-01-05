package dao.design;

import dao.launcher.InMemoryCustomerDB;

public class DAOLauncher {

	public static void main(String[] args) {
		
	
		InMemoryCustomerDB customerDB = new InMemoryCustomerDB();
		
		customerDB.addCustomer(new Customer(3, "Mark", "Waugh"));
		customerDB.addCustomer(new Customer(2, "Will", "Smith"));
		customerDB.addCustomer(new Customer(1, "Timothy", "Buffet"));
		
		System.out.println(customerDB.getAllCustomers());
		
	   
		Customer warren = new Customer(1, "Wurren", "Buffet");
			
		customerDB.updateCustomer(warren);
		
		
		System.out.println(customerDB.getCustomer(2));
		
		customerDB.deleteCustomer(1);

		System.out.println(customerDB.getAllCustomers());
		
		
	}

}
