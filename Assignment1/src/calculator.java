
import java.util.*;

public class calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Please enter the operation: add, subtract, multiply, divide or 0 to exit");
			
			String operation = sc.next().toLowerCase();
			
			if(operation.equals("add")){
				System.out.println("please input first number");
				double firstNum = sc.nextDouble();
				System.out.println("please input second number");
				double secondNum = sc.nextDouble();
				
				double result = firstNum + secondNum;
				System.out.println("The result is: ");
				System.out.println(result);
			}
			else if(operation.equals("subtract")) {
				System.out.println("please input first number");
				double firstNum = sc.nextDouble();
				System.out.println("please input second number");
				double secondNum = sc.nextDouble();
				
				double result = firstNum - secondNum;
				System.out.println("The result is: ");
				System.out.println(result);
			}
			else if(operation.equals("multiply")) {
				System.out.println("please input first number");
				double firstNum = sc.nextDouble();
				System.out.println("please input second number");
				double secondNum = sc.nextDouble();
				
				double result = firstNum * secondNum;
				System.out.println("The result is: ");
				System.out.println(result);
			}
			else if(operation.equals("divide")) {
				System.out.println("please input first number");
				double firstNum = sc.nextDouble();
				System.out.println("please input second number");
				double secondNum = sc.nextDouble();
				
				double result = firstNum / secondNum;
				System.out.println("The result is: ");
				System.out.println(result);
			}
			else {
				if(operation.equals("0")) {
					System.out.println("Thanks for using this calculator bye!");
					break;
				}
				else {
					System.out.println("Unexpected input please try again");
				}
			}
			
		}
	}
		

}
