package coffeshop;

import coffeshop.business.concretes.BaseCustomerManager;
import coffeshop.entities.concretes.Customer;

public class Main {

	public static void main(String[] args) {
		
		
		Customer m�steri = new Customer(123,"Batuhan","�lbay","12345678910","12.12.1996");
		
		BaseCustomerManager customerManager1 = new BaseCustomerManager();
		customerManager1.register(m�steri);
		
		
	
		

}

}