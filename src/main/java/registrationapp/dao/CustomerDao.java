package registrationapp.dao;

import java.util.List;

import registrationapp.model.Customer;

public interface CustomerDao {

	void saveCustomer(Customer customer);
	List<Customer> getAllCustomers();
}
