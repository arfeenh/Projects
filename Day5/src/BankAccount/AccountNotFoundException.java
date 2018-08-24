package BankAccount;

public class AccountNotFoundException extends Exception {

	public String toString(){

		return "The account was not found";
	}

}
