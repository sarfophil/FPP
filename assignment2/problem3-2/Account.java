package com.lessons;

public class Account {
	public final static AccountType CHECKING = AccountType.CHECKING;
	public final static AccountType SAVINGS = AccountType.SAVINGS;
	public final static AccountType RETIREMENT = AccountType.RETIREMENT;
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private String acctType;
	private Employee employee;

	Account(Employee emp, String acctType, double balance) {
		employee = emp;
		this.acctType = acctType;
		this.balance = balance;
	}

	Account(Employee emp, String acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
	}

	public String toString() {
		return "type = " + acctType + ", balance = " + balance;
	}

	public void makeDeposit(double deposit) { 

	}
	
	public boolean makeWithdrawal(double amount) {
		return false;   		
	//implement  
	}

}
