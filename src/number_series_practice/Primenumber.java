package number_series_practice;

import java.util.Scanner;

public class Primenumber {
	public static boolean isPrimeNumberUsingFor(int n) {
		boolean flag=true;
		int i=2;
		while(flag!=false&&i<n) {
			if(n%i==0) {
				flag=false;
			}
			i++;
		}
		return flag;
	}
	public static void main(String[] args) {
		System.out.println("Enter a number to check the prime number or not: ");
		int n=new Scanner(System.in).nextInt();

		if(new Primenumber().isPrimeNumberUsingFor(n)) {
			System.out.println(n+" is a prime number!");
		}
		else {
			System.out.println(n+" is not a prime number!");
		}
		
		System.out.println(isPrimeusingdoWhile(n));
	}

	public static boolean isPrimeusingdoWhile(int n) {
		boolean flag=true;
		int c=0;
		int i=2;
		do {
			if(n%i==0&&c==0) {
				flag=false;
				c++;
			}
			i++;
		}
		while(flag==true&&i<=n-1);
		
		return flag;
	}
}
