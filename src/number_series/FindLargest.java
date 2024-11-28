package number_series;

import java.util.Scanner;

public class FindLargest {
	public static int findLargestDigeit(int n) {
		int large=0;
		int rem;
		while(n!=0) {
			rem=n%10;
			if(rem>large) {
				large=rem;
			}
			n=n/10;
		}
		return large;
	}
	public static void main(String[] args) {
		System.out.print("Enter a number to find the largest Digit: ");
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
	System.out.println("Largest digit in the given number : "+findLargestDigeit(n));
	
	}
}
