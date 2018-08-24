package BankAccount;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BankLogic {
	int index=0;
	Scanner sc = new Scanner(System.in);
	
	
	public static Bank[] createArray(int size) {
		Bank [] Arr = new Bank[size];
		
		for(int i=0;i<size;i++) {
			Arr[i]= new Bank();
			Arr[i].setAccountNumber("");
			Arr[i].setName("");
		}
		return Arr;
	}
	
	public Bank[] CreateAccount(Bank arr []) {

		String accountNum="";
		String accountname="";
		int accountType= 0;
		double accountBal=-1;
		if (index<arr.length) {
			while(!accountNum.matches("^[a-zA-Z0-9]{10,}$")) {
				System.out.println("Please input Bank Account number: ");
				accountNum = sc.next();
			}
			
			while(!accountname.matches("^[a-zA-Z0-9]{3,25}$")) {
				System.out.println("Please input the clients name: ");
				accountname = sc.next();
			}
			
					
			while(accountType!=1 && accountType!=2) {
				try {

					System.out.println("Please input the clients preferred account type:" + "1: Checking" + "2: Saving");
					accountType = sc.nextInt();
				}catch(Exception e) {
					sc.nextLine();
				}
			}
			

			while(accountBal<0) {
				try {

					System.out.println("Please input initial deposit client wishes to deposit");
					accountBal = sc.nextDouble();
				}catch(Exception e) {
					sc.nextLine();
				}
			}
			
			
			arr[index].setAccountNumber(accountNum);
			arr[index].setName(accountname);
			arr[index].setAccountType(accountType);
			arr[index].setBalance(accountBal);
			

			index++;
			
			return arr;
		}
		else if (index==arr.length) {
			//check whether any null places
		}
		return arr;
		
	}
	
	public void viewAccount(Bank arr []) throws AccountNotFoundException{
		int flag=0;
		
		System.out.println("Please input how you would like to search: \r\n"
				+ "1: Search by account number: \r\n"
				+ "2: Search by account name: \r\n"
				+ "3: Search by account type: \r\n"
				+ "4: Exit \r\n");
		
		int option = sc.nextInt();
		
		switch(option) {
		case 1:
			System.out.println("Please input account number to search");
			String accnum=sc.next();
			
			
			for(Bank i:arr) {
				//System.out.println("The account number " + i.getAccountNumber() + "was located");
				if(i.getAccountNumber().equals(accnum)) {
					System.out.println("The account number " + i.getAccountNumber() + " was located");
					System.out.println("The account name is:" + i.getName());
					System.out.println("The account type is: " + i.getAccountType());
					System.out.println("The account balance is: "+i.getBalance());
					flag=1;
					break;
				}				
			}
			if(flag==0) {
				throw new AccountNotFoundException();
			}
			
			//System.out.println("Sorry the account number was not found in the database");
			break;
			
		case 2:
			System.out.println("Please input account name to search");
			String accname=sc.next();
			
			
			for(Bank i:arr) {
				if(i.getName().equals(accname)) {
					System.out.println("The account number " + i.getAccountNumber() + " was located");
					System.out.println("The account name is:" + i.getName());
					System.out.println("The account type is: " + i.getAccountType());
					System.out.println("The account balance is: "+i.getBalance());
					flag=1;
					break;
				}
			}
			if(flag==0) {
				throw new AccountNotFoundException();
			}
			break;
			
		case 3:
			System.out.println("Please input account type to search");
			int accType=sc.nextInt();
			for(Bank i:arr) {
				if(i.getAccountType()==accType) {
					System.out.println("The account number " + i.getAccountNumber() + " was located");
					flag=1;
				}
			}
			if(flag==0) {
				throw new AccountNotFoundException();
			}
			break;
		case 4:
			break;
		}
	}
	
	public void viewAll(Bank [] arr) {
		
		Bank [] arrSort = new Bank[arr.length];
		
		arrSort = arr;
		Library library = new Library();
		
		arrSort = library.sortName(arrSort);
		
		System.out.println(Arrays.toString(arrSort));
	}
	
	
	public void modifyRemove(Bank [] arr) {
		System.out.println("Please input 1 for account modification and 2 for account deletion and 3 to exit: ");
		int option = sc.nextInt();
		String accnum="";

		switch(option) {
		
		case 1:
			System.out.println("Please input account number to modify");
			accnum=sc.next();
			
			
			for(Bank i:arr) {
				//System.out.println("The account number " + i.getAccountNumber() + "was located");
				if(i.getAccountNumber().equals(accnum)) {
					System.out.println("please input new name");
					String name = sc.next();
					
					System.out.println("Please input account type: 1 for checking 2 for saving");
					int type = sc.nextInt();
					
					i.setName(name);
					i.setAccountType(type);
					System.out.println("The account name is:" + i.getName());
					System.out.println("The account type is: " + i.getAccountType());
					break;
				}				
			}
			break;
		case 2:
			System.out.println("Please input account number to delete");
			accnum=sc.next();
			
			
			for(Bank i:arr) {
				//System.out.println("The account number " + i.getAccountNumber() + "was located");
				if(i.getAccountNumber().equals(accnum)) {
					i.setName("");
					i.setAccountType(0);
					i.setAccountNumber("");
					i.setBalance(0);
				}
			}
				break;
		case 3: 
			break;
		}
		
	}
	public static class Library{

	    // These variables are static because you don't need multiple copies
	    // for sorting, as they have no intrinsic state.
	    static private Comparator<Bank> AccountName;
	    //static private Comparator<Bank> descPageNumber;

	    // We initialize static variables inside a static block.
	    static {
	    	AccountName = new Comparator<Bank>(){
	            @Override
	            public int compare(Bank b1, Bank b2){
	                return b1.getName().compareTo(b2.getName());
	            }
	        };
	        
	    };
	    
	    public Bank[] sortName(Bank [] arr){
	        Arrays.sort(arr, AccountName);
	        return arr;
	    }
	}


}