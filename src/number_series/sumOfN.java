package number_series;

import java.util.Scanner;

public class sumOfN {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
//			sum+=sum+i;//0+0+1//1+1+2
			sum=sum+i;
		}
		System.out.println("Sum: "+sum);
		
	}
}
