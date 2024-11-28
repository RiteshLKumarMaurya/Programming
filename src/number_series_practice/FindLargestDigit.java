package number_series_practice;

import java.util.Scanner;

public class FindLargestDigit {
	static int max=0;
	public static void main(String[] args) {
		System.out.print("Enter a number to find the largest digit: ");
		int n=new Scanner(System.in).nextInt();
		
//		new FindLargestDigit().usingWhile(n);
		new FindLargestDigit().usingDoWhile(n);
//		new FindLargestDigit().usingFor(n);
		
	}
	
	void usingDoWhile(int n) {
		int x=n;
		do {
			if(x%10>max) {
				max=x%10;
			}
			x=x/10;
		}while(x!=0);
		System.out.println("Largest digit is: "+max);

		
	}
	
	 void usingWhile(int n) {
		while(n>0) {
			if(n%10>max) {
				this.max=n%10;// -> we 
			}
			n/=10;
		}
		System.out.println("Largest Digit: "+max);
	}
	
	public void usingFor(int n) {
		
		for(int x=n;x>0;) {
			int rem=x%10;
			if(rem>max) {
				max=rem;
			}
			x=x/10;
		}
		System.out.println("Maximum: "+max);
		
	}
}
