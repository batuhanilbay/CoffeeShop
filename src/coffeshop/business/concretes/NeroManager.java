package coffeshop.business.concretes;

import coffeshop.entities.concretes.Customer;

public class NeroManager extends BaseCustomerManager {
	
	
	public void addNero(Customer customer) {
		System.out.println("NERO M��TER�S� EKLEND�: "+ customer.getCustomerFirstName() + customer.getCustomerLastName());
		
		
	}
	public void deleteNero(Customer customer) {
		System.out.println("NERO M��TER�S� S�L�ND�: "+ customer.getCustomerFirstName() + customer.getCustomerLastName());
		
		
	}
	public void upgradeNero(Customer customer) {
		System.out.println("NERO M��TER�S� G�NCELLEND�: "+ customer.getCustomerFirstName() + customer.getCustomerLastName());
		
		
	}

}
