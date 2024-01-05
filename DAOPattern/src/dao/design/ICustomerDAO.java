package dao.design;

import java.util.Map;

public interface ICustomerDAO {
	
	public Map<Integer, Customer> getAllCustomers();
	
	public Customer getCustomer(int ID);
	
	public void addCustomer(Customer customer);
	
	public void deleteCustomer(int ID);
	
	public Customer updateCustomer(Customer customer);
	

}
