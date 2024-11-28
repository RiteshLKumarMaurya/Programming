package putils;

import java.util.Scanner;

public class Strong {
	public static boolean isArmStrong(int n) {
		int sumOfFacts=0;
		int val=n;
		while(n>0) {
			int digit=n%10;
			sumOfFacts+=Factorial.findFact(digit);
			n=n/10;
		}
		System.out.println("Sum: "+sumOfFacts);
		if(val==sumOfFacts) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		System.out.print("Enter a  number to check Strong or not: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		if(isArmStrong(n)==true) {
			System.out.println(n+" : armStrong number.");
		}
		else {
			System.out.println(n+" : Not A armStrong number.");

		}

	}
}
