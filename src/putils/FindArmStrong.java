package putils;

import java.util.Scanner;

public class FindArmStrong {
	public static void main(String[] args) {
		int n;
		System.out.println("Enter a number: ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int val=n;
		int sum=0;
		int temp=n;
		int count=0;
		
		while(n>0) {
			count++;
			n=n/10;
		}
		
		while(temp>0) {
			int prod=1;
			int digit=temp%10;
			for(int i=1;i<=count;i++) {
				prod=prod*digit;
			}
			sum=sum+digit;
			temp=temp/10;
		}
		
		if(sum==val) {
			System.out.println("yes");
		}
		else {
			System.out.println("No!");
		}
	}
}
