package BankAccount;

import java.util.ArrayList;
import java.util.Scanner;

public class BankController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int exit=0;
		int option=0;
		Scanner sc = new Scanner(System.in);
		
		BankLogicArr bankCon = new BankLogicArr();
		Bank bank = new Bank();

		ArrayList<Bank> arr= BankLogicArr.createArray();
		
		//arr[0]= new Bank("231322hamza", "hamza", 1,21323);
		//arr[1]= new Bank("2313shamza", "arfeen", 2,32423);
		//arr[2]= new Bank("231Rshamza", "AMNA", 1,343455);

		
		while(exit==0) {
			System.out.println("please choose one of the below operations:"
					+ "\r\n" + 
					"1: Create Account\r\n" + 
					"2: View specific account details\r\n" + 
					"3: View all accounts\r\n" + 
					"4: Modify or Remove account\r\n" + 
					"5: Exit");
			
			option=sc.nextInt();
			

			switch(option){
			
			case 1: 
				arr = bankCon.CreateAccount(arr);
				break;
			case 2:
				try {
					bankCon.viewAccount(arr);
				} catch (AccountNotFoundException e) {
					// TODO Auto-generated catch block
					System.out.println(e);;
				}
				break;
				
			case 3:
				bankCon.viewAll(arr);
				break;
			case 4:
				bankCon.modifyRemove(arr);
				break;
			case 5:
				exit = 1;
				break;
			}
			
		}
	}

}
