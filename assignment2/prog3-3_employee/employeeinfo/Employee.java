package problem33.employeeinfo;



import java.time.LocalDate;

public class Employee {

	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	private String name;
	private LocalDate hireDate;

	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
		this.name = name;
		this.hireDate = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);
	}

	public void createNewChecking(double startAmount) {
		checkingAcct = new Account(this, AccountType.CHECKING, startAmount);
	}

	public void createNewSavings(double startAmount) {
		savingsAcct = new Account(this, AccountType.SAVING, startAmount);

	}

	public void createNewRetirement(double startAmount) {
		retirementAcct = new Account(this, AccountType.RETIREMENT, startAmount);
	}

	public String getFormattedAcctInfo() {
		if (this.checkingAcct == null) {
			return "ACCOUNT FOR " + name + ": \n \n" + this.savingsAcct.toString() + this.retirementAcct.toString()
					+ "\n\n";
		} else if (this.savingsAcct == null) {
			return "ACCOUNT FOR " + name + ": \n \n" + this.checkingAcct.toString() + this.retirementAcct.toString()
					+ "\n";
		} else if (this.retirementAcct == null) {
			return "ACCOUNT FOR " + name + ": \n \n" + this.checkingAcct.toString() + this.savingsAcct.toString()
					+ "\n";
		} else {
			return "ACCOUNT FOR " + name + ": \n \n" + this.retirementAcct.toString() + this.checkingAcct.toString()
					+ this.savingsAcct.toString() + "\n";
		}

	}

	public void deposit(AccountType acctType, double amt) {
		switch (acctType) {
		case CHECKING:
			this.checkingAcct.makeDeposit(amt);
			break;
		case SAVING:
			this.savingsAcct.makeDeposit(amt);
			break;
		case RETIREMENT:
			this.retirementAcct.makeDeposit(amt);
			break;
		default:
			System.err.println("Account Type is Invalid");
			break;

		}
	}

	public boolean withdraw(AccountType acctType, double amt) {
		boolean status = false;
		switch (acctType) {
		case CHECKING:
			status = this.checkingAcct.makeWithdrawal(amt);
			break;
		case SAVING:
			status = this.savingsAcct.makeWithdrawal(amt);
			break;
		case RETIREMENT:
			status = this.retirementAcct.makeWithdrawal(amt);
			break;
		default:
			System.err.println("Account Type is Invalid");
			break;
		}
		return status;
	}

	public String getName() {
		return name;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

}
