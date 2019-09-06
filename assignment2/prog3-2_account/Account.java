/**
 * 
 */
package problem32;

/**
 * @author SARFO PHILIP
 *
 */
public class Account {

	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private AccountType acctType;
	private Employee employee;

	public Account(Employee emp, AccountType acctType, double balance) {
		this.employee = emp;
		this.acctType = acctType;
		this.balance = balance;
	}

	Account(Employee emp, AccountType acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
	}

	public String toString() {
		return "type = " + acctType + ", balance = " + balance;
	}

	public void makeDeposit(double deposit) {
		this.balance += deposit;
	}

	public boolean makeWithdrawal(double amount) {
		if (amount > balance)
			return false;

		return true;
	}

	public double getBalance() {
		return balance;
	}

	public AccountType getAcctType() {
		return acctType;
	}

}
