package number_series;

import java.util.Scanner;


//1.wajp to print the numbers from n to 1
public class SeriesUtils {
	static Scanner sc=new Scanner(System.in);
	void nTo1() {
		System.out.println("Enter the n Value: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=n;i>=1;i--) {
			System.out.println(i);
		}
		sc.close();
		
	}
	
	public static void main(String[] args) {
//		
		findSpyNumber();
//		new SeriesUtils().nTo1();
		
//		Object obj=new SeriesUtils();
//		SeriesUtils s=(SeriesUtils)obj;
//		System.out.println("Enter number of looping:");
//		Scanner sc2=new Scanner(System.in);
//		
//		System.out.println("Enter any number");
//		removeDigit(new Scanner(System.in).nextInt());
		
//		findProduct();
		
	}
	
	// wajp to access each digit present in a number
	
	static void removeDigit(int n) {
		
		while(n!=0) {
			int digit=n%5;
			System.out.println("digit: "+digit);
			n=n/10;
			System.out.println("After removed: "+n);
			
		}
		
	}
	
	//wajp to find the sum of digits in a number
	public static int findSumDigit(int n) {
		int sum=0;
		
		while(n!=0) {
			int digit=n%10;
			sum=sum+digit;
			n=n/10;
		}
		return sum;
		
	}
	
	
	// 3. WAJP TO FIND TH PROUCT OF DIGITS OF THE GIVEN NUMBERS

	
	static int findProduct(int n) {
		int prod=1;
		
		while(n!=0) {
			int digit=n%10;
			prod=prod*digit;
			n=n/10;
		}

		return prod; 
		
	}


	///wajp to find given number is the spy number...
	// spy number means if sum==product
	
	/**
	 * if the sum of the digits is the equal to the product 
	 * of the digit of the given number is called as the 
	 * spy num
	 * */
	
	static void findSpyNumber() {
		int x;
		System.out.println("Enter a number to check the spy num.");
		x=sc.nextInt();
		if(findProduct(x)==findSumDigit(x)) {
			System.out.println(x+"Spy number!");
		}
		else{
			System.out.println("Not a spy number");
		}
	}
	
	public static int findCount(int n) {
		int i=0;
		while(n!=0) {
			i++;
			n=n/10;
		}
		return i;
	}
}
