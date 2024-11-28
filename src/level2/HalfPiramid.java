package level2;

import putils.Input;

public class HalfPiramid {
	public static void main(String[] args) {
		int n = Input.readInt("Enter value for n");

		halfPyramid4(n);
		
	}

	public static void halfPyramid1(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n * 2 - 1; j++) {
				System.out.println(i <= j && i + j <= n * 2 ? "* " : " ");

			}
			System.out.println();

		}
	}

	public static void halfPyramid2(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n * 2 - 1; j++) {
//				if(i<=j&&i+j<=n*2)
				if (j - i <= 2 && i + j >= n + 1) {
					System.out.print("* ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();

		}
	}

	public static void halfPyramid3(int n) {
		for (int i = 1; i <= 2 * n - 1; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(i >= j && i + j <= 2 * n ? "* " : " ");
			}
			System.out.println();
		}
	}

	public static void halfPyramid4(int n) {
		for (int i = 1; i <=n*2-1; i++) {
			for (int j = 1; j <= n; j++) {
				if(i + j >= n + 1 && i - j <= n-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");// careful   (  )
				}
			}
			System.out.println();
		}
	}
	
	public static void halfPyramid5(int n) {
		for (int i = 1; i<=n; i++) {
			for (int j = 1; j <=2*n-1; j++) {
				if(i>=j||	i+j>=n*2) {
//					System.out.print("* ");
					System.out.print("("+i+","+j+")");
				}
				else {
					System.out.print("     ");
				}
			}
			System.out.println();
		}
	}
	
	public static void halfPyramid6(int n) {
		for (int i = 1; i<=n; i++) {
			for (int j = 1; j <=2*n-1; j++) {
				if(i+j<=n+1||j-i>=n-1) {
//					System.out.print("* ");
					System.out.print("("+i+","+j+")");
				}
				else {
					System.out.print("     ");
				}
			}
			System.out.println();
		}
	}

}
