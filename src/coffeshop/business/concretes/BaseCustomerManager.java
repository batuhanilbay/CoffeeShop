package coffeshop.business.concretes;

import coffeshop.business.abstracts.CustomerService;
import coffeshop.entities.concretes.Customer;

public  class BaseCustomerManager implements CustomerService {
	
	public void register(Customer customer) {
		System.out.println("M��teri kaydedildi: " + customer.getCustomerFirstName() + customer.getCustomerLastName());
		
	}



}
