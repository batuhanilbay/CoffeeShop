package coffeshop.business.concretes;

import coffeshop.entities.concretes.Customer;

public class StarbucksManager extends BaseCustomerManager{
	
	public void addStarbucks(Customer customer) {
		System.out.println("STARBUCKS M��TER�S� EKLEND�: "+ customer.getCustomerFirstName() + customer.getCustomerLastName());
		
		
	}
	public void deleteStarbucks(Customer customer) {
		System.out.println("STARBUCKS M��TER�S� S�L�ND�: "+ customer.getCustomerFirstName() + customer.getCustomerLastName());
		
		
	}
	public void upgradeStarbucks(Customer customer) {
		System.out.println("STARBUCKS M��TER�S� G�NCELLEND�: "+ customer.getCustomerFirstName() + customer.getCustomerLastName());
		
		
	}
	

}
