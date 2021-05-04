package interfaceAbstractDemo;
import java.rmi.RemoteException;
import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Program {

	public static void main(String[] args) throws RemoteException {
		
		Customer customer1=new Customer("Murat","Mizamoðlu",2001,"11209956722");
		BaseCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(customer1);
		

	}

}
