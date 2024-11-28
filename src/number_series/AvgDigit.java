package number_series;

import java.util.Scanner;

public class AvgDigit {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter the number to find the avg of the digits: ");
		int n=sc.nextInt();
		System.out.println("Avg of digits of given number: "+findAvg(n));;
		sc.close();
		
	}
	
	// find the avg of the digits of a number
		public static int findAvg(int n) {
		
			
			int count=SeriesUtils.findCount(n);
			int sum=SeriesUtils.findSumDigit(n);
			
			return sum/count;
			
		}
}
