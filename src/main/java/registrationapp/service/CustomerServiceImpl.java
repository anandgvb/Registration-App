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
			if(cust.getFirstName().equalsIgnoreCase(customer.getFirstName()) 
					&& cust.getLastName().equalsIgnoreCase(customer.getLastName())) {
				return false;
			}
		}
		return true;
	}

}
