package coffeshop.dataAccess.concretes;


import coffeshop.dataAccess.abstracts.CustomerDao;
import coffeshop.entities.concretes.Customer;


public class DataCustomerDao implements CustomerDao {

	@Override
	public void add(Customer customer) {
	
		System.out.println("M��teri eklendi: "+ customer.getId());

		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("M��teri silindi: "+ customer.getId());
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("M��teri bilgileri g�ncellendi: "+ customer.getId());

		
	}
	
	
		
}
