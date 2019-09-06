/**
 * 
 */
package problem32;

/**
 * @author SARFO PHILIP
 *
 */

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Employee employee = new Employee("Philip Sarfo", "Yc", 34, 2019, 9, 10);

		Account retirement = new Account(employee, AccountType.RETIREMENT,300);
		Account savings = new Account(employee, AccountType.SAVINGS, 300);
		Account checking = new Account(employee, AccountType.CHECKING, 300);

		retirement.makeDeposit(300);
		retirement.makeWithdrawal(300);

		savings.makeDeposit(300);
		savings.makeWithdrawal(2300);

		checking.makeDeposit(300);
		checking.makeWithdrawal(3400);

		System.out.println(retirement.toString() + "\n" + savings.toString() + "\n" + checking.toString());

	}

}
