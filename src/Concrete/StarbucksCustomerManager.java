package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{

	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		
		this.customerCheckService=customerCheckService;
	}
	
	public void save(Customer customer) {
		
		System.out.println("Veritabanýna kaydedildi: "+customer.getFirstName());
		
		if(this.customerCheckService.CheckIfRealPerson(customer))
		{
			save(customer);
		}
		else 
		{
			System.out.println("Geçersiz kullanýcý.");
		}
	}

}
