/**
 * 
 */
package problem5;

/**
 * @author SARFO PHILIP
 *
 */
public class CustomerAccount {

	public static <E> void main(String[] args) throws MyCustomException {
		CustomerAccount customerAccount = new CustomerAccount("John Doe", "903", 90.0);
		customerAccount.deposit(90.0);
		customerAccount.withdraw(80.0);
		
		
	}
	
	private String cusName;
	private String accNo;
	private double balance;
	
	public CustomerAccount(String cusName,String accNo,Double balance) {
		this.cusName = cusName;
		this.accNo   = accNo;
		this.balance = balance;
	}
	
	public void deposit(Double balance) throws MyCustomException {
		this.balance += balance;
		if(this.balance < 100) throw new MyCustomException("Amount is below 100$");
	}
	
	public void withdraw(Double balance) throws MyCustomException {
		if(balance > balance) 
			throw new MyCustomException("Amount exceeds the balance");
		else
			this.balance -= balance;
	}
	

}

class MyCustomException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public MyCustomException() {
		super();
	}
	
	public MyCustomException(String message) {
		super();
		System.out.println(message);
	}
}
