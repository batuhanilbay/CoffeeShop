package coffeshop.dataAccess.concretes;


import coffeshop.dataAccess.abstracts.CustomerDao;
import coffeshop.entities.concretes.Customer;


public class DataCustomerDao implements CustomerDao {

	@Override
	public void add(Customer customer) {
	
		System.out.println("Müþteri eklendi: "+ customer.getId());

		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Müþteri silindi: "+ customer.getId());
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Müþteri bilgileri güncellendi: "+ customer.getId());

		
	}
	
	
		
}
