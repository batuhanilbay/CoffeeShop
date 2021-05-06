package coffeshop.business.concretes;

import coffeshop.entities.concretes.Customer;

public class NeroManager extends BaseCustomerManager {
	
	
	public void addNero(Customer customer) {
		System.out.println("NERO MÜÞTERÝSÝ EKLENDÝ: "+ customer.getCustomerFirstName() + customer.getCustomerLastName());
		
		
	}
	public void deleteNero(Customer customer) {
		System.out.println("NERO MÜÞTERÝSÝ SÝLÝNDÝ: "+ customer.getCustomerFirstName() + customer.getCustomerLastName());
		
		
	}
	public void upgradeNero(Customer customer) {
		System.out.println("NERO MÜÞTERÝSÝ GÜNCELLENDÝ: "+ customer.getCustomerFirstName() + customer.getCustomerLastName());
		
		
	}

}
