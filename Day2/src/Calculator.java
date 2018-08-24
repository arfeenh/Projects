
import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		int exit=0;
		Scanner sc = new Scanner(System.in);
		while(exit==0) {
			
			int option=0;
			int in=0;
			while (in==0) {
				System.out.println("please choose one of the below options:");
				System.out.println("1: basic arithmatic operations:");
				System.out.println("2: computational operations");
				System.out.println("3: exit");
				try {
					option = sc.nextInt();
					in=1;
				}catch(Exception e){
					System.out.println("Invalid Entry");
					sc.next();
				}
			}
			in=0;
						
			switch(option){
				case 1:

					
					int aritOp=0;
					in=0;
					while (in==0) {
						System.out.println("please choose one of the below options:");
						System.out.println("1: Addition");
						System.out.println("2: Multiplication");
						System.out.println("3: Division");
						System.out.println("4: Go back");
						System.out.println("5: Exit");
						try {
							aritOp= sc.nextInt();
							in=1;
						}catch(Exception e){
							System.out.println("Invalid Entry:");
							sc.next();
						}
					}
					in=0;
					
					switch(aritOp){
					case 1:
						double num1=0;
						double num2=0;
						while (in==0) {
							System.out.println("Please input first number");
							try {
								num1 = sc.nextDouble();
								in=1;
							}catch(Exception e){
								System.out.println("Invalid Entry");
								sc.next();
							}
						}
						in=0;
						
						while (in==0) {
							System.out.println("Please input second number");
							try {
								num2 = sc.nextDouble();
								in=1;
							}catch(Exception e){
								System.out.println("Invalid Entry");
								sc.next();
							}
						}
						in=0;

						double resultAdd= CalculatorLogic.add(num1, num2);
						System.out.println(resultAdd);
						
						break;
						
					
					case 2: 
						double num3=0;
						double num4=0;
						
						while (in==0) {
							System.out.println("Please input first number");
							try {
								num3 = sc.nextDouble();
								in=1;
							}catch(Exception e){
								System.out.println("Invalid Entry");
								sc.next();
							}
						}
						in=0;
						
						while (in==0) {
							System.out.println("Please input second number");
							try {
								num4 = sc.nextDouble();								
								in=1;
							}catch(Exception e){
								System.out.println("Invalid Entry");
								sc.next();
							}
						}
						in=0;
						
						double resultMul=CalculatorLogic.multiply(num3, num4);
						System.out.println(resultMul);
						break;
					
					case 3: 
						double num5=0;
						double num6=0;
						while (in==0) {
							System.out.println("Please input first number");
							try {
								num5 = sc.nextDouble();
								in=1;
							}catch(Exception e){
								System.out.println("Invalid Entry");
								sc.next();
							}
						}
						in=0;
						
						while (in==0) {
							System.out.println("Please input second number");
							try {
								num6 = sc.nextDouble();
								in=1;
							}catch(Exception e){
								System.out.println("Invalid Entry");
								sc.next();
							}
						}
						in=0;
						
						double resultDiv=CalculatorLogic.divide(num5, num6);
						System.out.println(resultDiv);
						break;
					
					case 4:
						break;
					
					case 5:
						System.out.println("Thank you for using this calculator");
						exit=1;
						break;
					}
					break;
					
				case 2:

					
					int compOp=0;
					in=0;
					while (in==0) {
						System.out.println("please choose one of the below options:");
						System.out.println("1: Compute factorial");
						System.out.println("2: Compute power");
						System.out.println("3: Find average");
						System.out.println("4: Go back");
						System.out.println("5: Exit");
						try {
							compOp= sc.nextInt();
							in=1;
						}catch(Exception e){
							System.out.println("Invalid Entry:");
							sc.next();
						}
					}
					in=0;
					
						switch(compOp) {
						case 1:
							double num7=0;
							while (in==0) {
								System.out.println("Please input number to compute factorial");
								try {
									num7 = sc.nextDouble();
									in=1;
								}catch(Exception e){
									System.out.println("Invalid Entry");
									sc.next();
								}
							}
							in=0;
						
							double resultFact= CalculatorLogic.factorial(num7);
							System.out.println(resultFact);
						break;
							
						case 2:
							double num8=0;
							double num9=0;
							
							while (in==0) {
								System.out.println("Please input base");
								try {
									num8 = sc.nextDouble();
									in=1;
								}catch(Exception e){
									System.out.println("Invalid Entry");
									sc.next();
								}
							}
							in=0;
							
							while (in==0) {
								System.out.println("Please input power");
								try {
									num9 = sc.nextDouble();
									in=1;
								}catch(Exception e){
									System.out.println("Invalid Entry");
									sc.next();
								}
							}
							in=0;
							
							double resultPower=CalculatorLogic.power(num8, num9);
							System.out.println(resultPower);
							break;
							
						case 3:
							double num10=0;
							double num11=0;
							
							while (in==0) {
								System.out.println("Please input min value");
								try {
									num10 = sc.nextDouble();
									in=1;
								}catch(Exception e){
									System.out.println("Invalid Entry");
									sc.next();
								}
							}
							in=0;
							
							while (in==0) {
								System.out.println("Please input max value");
								try {
									num11 = sc.nextDouble();
									in=1;
								}catch(Exception e){
									System.out.println("Invalid Entry");
									sc.next();
								}
							}
							in=0;
							
							
							double resultAvg=CalculatorLogic.average(num10, num11);
							System.out.println(resultAvg);
							break;
						}
					break;
				
				case 3:
					System.out.println("Thank you for using this calculator");
					exit=1;
					break;
					
				case 4:
					break;
				
				case 5:
					exit=1;
					break;

			}
			
		}
	}
}


