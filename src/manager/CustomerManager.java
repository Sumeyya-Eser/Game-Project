package manager;

import Entities.Customer;
import interfaces.ICustomerService;
import interfaces.UserValidationService;

public class CustomerManager implements ICustomerService {

	UserValidationService userValidationService;
	
	public CustomerManager(UserValidationService userValidationService) {
		this.userValidationService = userValidationService;
	}

	@Override
	public void add(Customer customer) {
		if (userValidationService.validate(customer)) {
			System.out.println("Customer was added  : "+customer.getFirstName()+" "+customer.getLastName());
		}
		else {
			System.out.println("Not a valid person");
		}
		
	}

	@Override
	public void delete(Customer customer) {
		if (userValidationService.validate(customer)) {
			System.out.println("Customer was deleted  : "+customer.getFirstName()+" "+customer.getLastName());
		}
		else {
			System.out.println("Not a valid person");
		}
	}

	@Override
	public void update(Customer customer) {
		if (userValidationService.validate(customer)) {
			System.out.println("Customer was updated  : "+customer.getFirstName()+" "+customer.getLastName());
		}
		else {
			System.out.println("Not a valid person");
		
	}
	}
}

