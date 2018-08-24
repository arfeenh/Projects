import java.util.Scanner;

public class vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please input string");
		
		String str = sc.next();
		
		System.out.printf("The vowels count is: %d", countVowel(str));
	}
	
	public static int countVowel(String str) {
		char[] vowel= {'a','e','i','o','u'};
		int count=0;
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<vowel.length;j++) {
				if(str.charAt(i)==vowel[j]) {
					count++;	
				}
			}
		}
		return count;	

	}

}
