package dao.launcher;

import java.util.HashMap;
import java.util.Map;

import dao.design.Customer;
import dao.design.ICustomerDAO;

public class InMemoryCustomerDB implements ICustomerDAO {
	
	private Map<Integer, Customer>  customersDB;
	
	
	public InMemoryCustomerDB() {
		
		this.customersDB = new HashMap<Integer, Customer>();
	}
	
	@Override
	public Map<Integer, Customer> getAllCustomers() {
		
		return customersDB;
	}

	@Override
	public Customer getCustomer(int ID) {
		
		return customersDB.get(Integer.valueOf(ID));
	}

	@Override
	public void addCustomer(Customer customer) {
		
		customersDB.put(customer.getId(), customer);
		
		 
	}

	@Override
	public void deleteCustomer(int ID) {
		
		try {
			
			customersDB.remove(Integer.valueOf(ID));
			
		}catch(Exception ex) {
			
			System.out.println("Could not delete customer with ID:" + ID);
		}
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		
		return customersDB.replace(customer.getId(), customer);
	}
	
	
	
	
	

}
