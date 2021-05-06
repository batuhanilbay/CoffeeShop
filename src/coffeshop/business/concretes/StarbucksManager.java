package coffeshop.business.concretes;

import coffeshop.entities.concretes.Customer;

public class StarbucksManager extends BaseCustomerManager{
	
	public void addStarbucks(Customer customer) {
		System.out.println("STARBUCKS MÜÞTERÝSÝ EKLENDÝ: "+ customer.getCustomerFirstName() + customer.getCustomerLastName());
		
		
	}
	public void deleteStarbucks(Customer customer) {
		System.out.println("STARBUCKS MÜÞTERÝSÝ SÝLÝNDÝ: "+ customer.getCustomerFirstName() + customer.getCustomerLastName());
		
		
	}
	public void upgradeStarbucks(Customer customer) {
		System.out.println("STARBUCKS MÜÞTERÝSÝ GÜNCELLENDÝ: "+ customer.getCustomerFirstName() + customer.getCustomerLastName());
		
		
	}
	

}
