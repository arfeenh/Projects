import java.util.Scanner;

public class SandwichMaker {
	
	private char onion;
	private char tomato;
	private char chicken;
	private char beef;
	private char Mayo;
	
	public SandwichMaker() {
		
	}
	public SandwichMaker(char onion, char tomato, char chicken, char beef,char mayo) {
		this.onion=onion;
		this.tomato=tomato;
		this.chicken=chicken;
		this.beef=beef;
		this.Mayo=mayo;
				
	}
	
	public String toString() {
		return "onions: " + onion + " tomato: " + tomato + " chicken: " + chicken+ " beef: " +beef + " mayo: " + Mayo ;
	}

	public double cost(SandwichMaker [] array,int num){
		double price=2*num;
		for(SandwichMaker p: array) {
			if(p.onion=='y' && p.tomato=='y') {
				price+=2;
			}
			if(p.beef=='y'||p.chicken=='y') {
				price+=3;
			}
			if(p.Mayo=='n') {
				price-=1;
			}
		}
		return price;
	}
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please input how many sandwiches you would like");
		
		int num = sc.nextInt();
		SandwichMaker [] array = new SandwichMaker[num];
		
		//System.out.println(array[0]);
		for(int i=0;i<num;i++) {
			System.out.printf("Would you like onions in sandwich %d Y/N ",i+1);
			char onions =sc.next().charAt(0);
			
			System.out.printf("Would you like tomatos in sandwich %d Y/N ",i+1);
			char tomatos =sc.next().charAt(0);

			System.out.printf("Would you like chicken in sandwich %d Y/N ",i+1);
			char chicken =sc.next().charAt(0);
			
			System.out.printf("Would you like beef in sandwich %d Y/N ",i+1);
			char beef =sc.next().charAt(0);
			
			System.out.printf("Would you like mayo in sandwich %d Y/N ",i);
			char mayo =sc.next().charAt(0);
			
			array[i]= new SandwichMaker(onions,tomatos,chicken,beef,mayo);
		
		}
		SandwichMaker obj = new SandwichMaker();
		double cost=obj.cost(array,num);
		System.out.println(cost);
	}

}
