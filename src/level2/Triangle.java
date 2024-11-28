package level2;

import putils.Input;

public class Triangle {
	public static void main(String[] args) {
		pattern1(Input.readInt("n value"));
	}
	public static void pattern1(int n) {
		for(int i=1;i<=n*2-1;i++) {
			for(int j=1;j<=n;j++) {
				if(i+j>=n+1&&i-j<=n-1) {
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
