package coffeshop.dataAccess.abstracts;

import coffeshop.entities.concretes.Customer;

public interface CustomerDao {
	
	void add(Customer customer);
	void delete(Customer customer);
	void update(Customer customer);
	
	

}
