package interfaces;

import Entities.Customer;

public interface ICustomerService {
	
	void add(Customer customer);
	void delete(Customer customer);
	void update(Customer customer);

}
