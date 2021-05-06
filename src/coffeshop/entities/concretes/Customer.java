package coffeshop.entities.concretes;

import coffeshop.entities.abstracts.Entity;

import java.util.Date;

public class Customer implements Entity {
	
	private int id;
	private String customerFirstName;
	private String customerLastName;
	private String nationalId;
	private String dateOfbirth;
	
	public Customer() {
		
	}

	public Customer(int id, String customerFirstName, String customerLastName, String nationalId, String dateOfbirth) {
		super();
		this.id = id;
		this.customerFirstName = customerFirstName;
		this.customerLastName = customerLastName;
		this.nationalId = nationalId;
		this.dateOfbirth = dateOfbirth;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomerFirstName() {
		return customerFirstName;
	}

	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}

	public String getCustomerLastName() {
		return customerLastName;
	}

	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}

	public String getNationalId() {
		return nationalId;
	}

	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}

	public String getDateOfbirth() {
		return dateOfbirth;
	}

	public void setDateOfbirth(String dateOfbirth) {
		this.dateOfbirth = dateOfbirth;
	}

	
	

}
