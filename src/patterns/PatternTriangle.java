package patterns;

import putils.Input;

public class PatternTriangle {
	public static void main(String[] args) {
		pattern1();
		pattern2();
		pattern3();
		pattern4();

	}

	public static void pattern1() {
		int n = Input.readInt("Enter value for matrix");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i + j <= n + 1) {
//					System.out.print("* ");
					System.out.print("(" + i + "," + j + ")");
				} else {
					System.out.print("     ");
				}
			}
			System.out.println();
		}
	}

	public static void pattern2() {
		int n = Input.readInt("Enter value for matrix");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i + j >= n + 1) {
//					System.out.print("* ");
					System.out.print("(" + i + "," + j + ")");

				} else {
					System.out.print("     ");
				}
			}
			System.out.println();
		}
	}

	public static void pattern3() {
		int n = Input.readInt("Enter value for matrix");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i <= j) {
//					System.out.print("* ");
					System.out.print("(" + i + "," + j + ")");

				} else {
					System.out.print("     ");
				}
			}
			System.out.println();
		}
	}

	public static void pattern4() {
		int n = Input.readInt("Enter number of the rows and the columns");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i >= j) {
//					System.out.print("* ");
					System.out.print("(" + i + "," + j + ")");

				} else {
					System.out.print("     ");
				}
			}
			System.out.println();
		}
	}

}
