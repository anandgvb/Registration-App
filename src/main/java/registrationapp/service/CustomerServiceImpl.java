package registrationapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import registrationapp.dao.CustomerDao;
import registrationapp.model.Customer;

@Component
public class CustomerServiceImpl implements CustomerService {

	
	@Autowired
	private CustomerDao customerDao;
	
	public void saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerDao.saveCustomer(customer);
	}

	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return customerDao.getAllCustomers();
	}

	public boolean validateCustomer(Customer customer) {
		List<Customer> customers = getAllCustomers();
		
		for(Customer cust: customers) {
			if(cust.getUserId().equalsIgnoreCase(customer.getUserId()) 
					&& cust.getPassword().equalsIgnoreCase(customer.getPassword())) {
				return false;
			}
		}
		return true;
	}
	public boolean validateCustomerLogin(Customer customer) {
		List<Customer> customers = getAllCustomers();
		
		for(Customer cust: customers) {
			if(cust.getUserId().equalsIgnoreCase(customer.getUserId()) 
					&& cust.getPassword().equalsIgnoreCase(customer.getPassword())) {
				return true;
			}
		}
		return false;
	}

}
