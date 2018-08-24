
public class CalculatorLogic {

	public static double add(double a, double b) {
		double result= a+b;
		return result;
	}
	public static double multiply(double a, double b) {
		double result= a*b;
		return result;
	}
	public static double divide(double a, double b) {
		double result= a/b;
		return result;
	}
	public static double factorial(double input) {
		double num=1;
		double denom=input;
		for(double i=input;i>=1;i--) {
			num = num*i;
		}
		double result =num;
		
		return result;
	}
	public static double power(double base, double power) {
		double result=1;
		
		for(int i=0;i<power;i++) {
			result=result*base;
		}
		return result;
	}
	public static double average(double min, double max) {
		double result=0;
		
		for(double i=min;i<=max;i++) {
			result=result+i;
		}
		result = (result/(max-min+1));
		
		return result;
	}
	
	
}
