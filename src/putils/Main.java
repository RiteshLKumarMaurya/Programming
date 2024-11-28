package putils;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.print("Enter a number to check: ");
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
//		final boolean res=PolindromeNumber.isPolindrome2(n);
//		System.out.println("res: "+res);
		
		final boolean res=SunnyNumber.isSunnyNumber(n);
		System.out.println(res);
	}
}
