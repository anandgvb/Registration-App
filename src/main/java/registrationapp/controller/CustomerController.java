package registrationapp.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import registrationapp.model.Customer;
import registrationapp.service.CustomerService;

@Controller
public class CustomerController {
 
	@Autowired
	private CustomerService customerService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String openHomePage() {
		return "homepage";
	}
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String openRegistrationForm(Model model) {
		model.addAttribute("customerObj", new Customer());
		return "register";
	}
	@RequestMapping(value = "/submit" , method = RequestMethod.POST)
	public String submitRegistrationForm(Model model,@Valid @ModelAttribute("customerObj") Customer customer,BindingResult br) {
		if(br.hasErrors()) {
			return "register";
		}
		if(customerService.validateCustomer(customer)) {
			customerService.saveCustomer(customer);
			model.addAttribute("custName",customer.getFirstName()+" "+customer.getLastName());
			return "success";
		}else {
			model.addAttribute("customerObj", new Customer());
			model.addAttribute("custError", "User is already registered");
			return "register";
		}
	}
}
