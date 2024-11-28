package putils;

import java.util.Scanner;

public class XylemPhloem {

	public static boolean xylemOrPhloem2(int n) {
		int outerSum=0;
		int innerSum=0;
		outerSum=n%10;
		n=n/10;
		
		while(n>9) {
			innerSum+=n%10;
			n/=10;
		}
		outerSum+=n;
		
		if(outerSum==innerSum) {
			return true;
//			System.out.println(n+" : a Xylem number!");
		}
		else {
//			System.out.println(n+" : a Phloem number!");
			return false;
		}
	}
	public static boolean isXylemOrPhloem(int n) {
		int n1=0;
		int n2=0;
		int val=n;
		int last=0;
		int first=0;
		while(n>0) {
			n=n%10;
			break;
		}

		while(n>0) {
			n=n%10;
			n=n/10;
		}
		while(n>0) {
			if(n==last||n==val) {
				n1=n1+n%10;
			}
			else {
				n2=n2+n%10;
			}
			n=n/10;
		}
		if(n1==n2) {
			System.out.println("Xylom number.");
			return true;
		}
		else {
			System.out.println("Phloem number.");

			return false;
		}
	}
	public static void main(String[] args) {
		System.out.print("Enter a number to check it:");

		int n;
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		boolean res=xylemOrPhloem2(n);
		if(res==true) {
			System.out.println("Xylem");
		}
		else {
			System.out.println("Phloem");
		}
	}
}
