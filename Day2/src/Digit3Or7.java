import java.util.Scanner;

public class Digit3Or7 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please input number");
	    int num = sc.nextInt();
	    int flag=0;

	    while(num!=0) {
	    	if(num%10==3 || num%10==7) {
	    		num=num/10;
		    }
		    else {
		    	flag=1;
		    	break;
		    }
	    }
	    if(flag==1) {
	    	System.out.println("No");
	    }
	    else {
	    	System.out.println("Yes");

	    }
	    
	}

}
