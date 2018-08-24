import java.util.Scanner;
public class IfElseExercise {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Please input what type of licence you are applying for 1 for g1 - 2 for g2 - 3 for g");
		int type= sc.nextInt();
		
		System.out.println("Please Input your age");
		double age= sc.nextDouble();
		
		System.out.println("Please input your Citizen status.  1 for Citizen - 2 for PR - 3 for immigrant");
		String cStatus= sc.next();
		
		if(cStatus.equals(3)) {
			System.out.println("Do you have a driving license Y/N");
			char otherCountry = sc.nextLine().charAt(0);
		}
		
		System.out.println("Please enter your driving experience");
		double experience= sc.nextDouble();
		
		
		
		
		if(type==1 && age>=16 && age <=90 && (cStatus.equals("1") || cStatus.equals("2"))) {	//for pr and citizens
			System.out.println("You are eligible for g1 licence");
		}
		else if(type==2 && age>=17 && age<=90 && (cStatus.equals("1") || cStatus.equals("2") && experience >=1)) {
			System.out.println("You are eligible for g2 licence");
		}
	}
	
	

		
		

	

}
