package BankAccount;

public class Bank {
	private String accountNumber;
	private String name;
	private int accountType;
	private double balance;
	
	Bank(String account, String Name, int accountType, double balance){
		this.accountNumber=account;
		this.name=Name;
		this.accountType=accountType;
		this.balance=balance;
	}
	
	Bank(){
		
	}
	public String getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAccountType() {
		return accountType;
	}


	public void setAccountType(int accountType) {
		this.accountType = accountType;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}



	public String toString(){
		return ("Account Number:" + accountNumber + ", " + "Account name: " +  name + ", " + "Account Type: " +  accountType + "balance: " +  balance + "\n" );
	}
}
