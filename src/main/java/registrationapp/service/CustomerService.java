package registrationapp.service;

import java.util.List;

import registrationapp.model.Customer;

public interface CustomerService {

	
	void saveCustomer(Customer customer);
	List<Customer> getAllCustomers();
	boolean validateCustomer(Customer customer);
}
