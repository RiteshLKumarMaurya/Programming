package number_series;

import java.util.Scanner;

public class Utils {
public static void main(String[] args) {
	System.out.print("Enter a number to check it: ");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	boolean isNeonOrNot=isNeon(n);
	if(isNeonOrNot) {
		System.out.println(n+" is a neon number!");
	}
	else {
		System.out.println(n+" is not a neon number!");
	}

}
	public static void buzzNumber() {
		
	}
	
	public static boolean isNeon(int n) {
		int sum=0;
		int rem;
		int square;
		square=n*n;
		while(square!=0) {
			rem=square%10;
			sum+=rem;
			square=square/10;
		}
		
		if(sum==n) {
			return true;
		}
		else {
			return false;
		}
	}

	
}


//Q:- can we find all of the decimal numbers
