/**
 * 
 */
package fpp.assignment2.customer;

/**
 * @author SARFO PHILIP
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Customer[] customer = new Customer[3];
		customer[0] = new Customer("Philip","Sarfo","452-455");
		customer[1] = new Customer("Akonnor","Joana","234-67");
		customer[2] = new Customer("Osei","Geo","234-6745");
		
		//set Billing and Shipping Address
		customer[0].setBillingAddress(new Address("100 North 4th Street","Chicago","IOWA","52557"));
		customer[0].setShippingAddress(new Address("Chicago","Fairfield","IOWA","52557"));
		
		//Customer 1
		customer[1].setBillingAddress(new Address("100 North 4th Street","Fairfield","IOWA","52557"));
		customer[1].setShippingAddress(new Address("Texas","Fairfield","IOWA","52557"));
		
		//Customer 2
		customer[2].setBillingAddress(new Address("1000 Hillton Street","Kansas","los angeles","090"));
		customer[2].setShippingAddress(new Address("Bronx","1234 Street","Bronx","0900"));
		
		for(Customer cs : customer) {
			if(cs.getBillingAddress().getCity().equals("Chicago")) {
				System.out.println("Customer Name: "+cs.getFirstName()+" "+cs.getLastName());
			}
		}
		
		
	}

}
