package level3;

import putils.Input;

public class CharpaiPattern {
	
	public static void main(String[] args) {
//		pattern1(Input.readInt("value for n"));
//		pattern(Input.readInt("value for n"));
		pattern7(Input.readInt("value for n"));
	}
	
	
	public static void pattern(int n) {
		for(int i=1;i<=2*n-1;i++) {
			for(int j=1;j<=2*n-1;j++) {
				if(true) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	public static void pattern1(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=(n*2)-1;j++) {
				if(i+j>=n+1&&i+j<=n*2) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	public static void pattern2(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=(n*2)-1;j++) {
				if(i<=j&&j-i<=2) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	public static void pattern7(int n) {
		for(int i=1;i<=2*n-1;i++) {
			for(int j=1;j<=n;j++) {
				if(i+j>=2*n||i<=j) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	
	
}
