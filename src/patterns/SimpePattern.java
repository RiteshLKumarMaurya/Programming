package patterns;

import putils.Input;

public class SimpePattern {

	public static void matrix(int number) {
		int c=0;
		int rc;
		
		rc=Input.readInt("a number to specify row or columns options---\n1.rows\n2.columns");
		if(rc==1) {
			c = Input.readInt("a number to which row");
		}else if(rc==2) {
			c=Input.readInt("a number to which column");
		}
		else {
			try {
				throw new OuterOfRangeException("1 or 2 is option only!");	
			}catch(Exception e) {
				System.out.println(e.getLocalizedMessage());
			}
		}
		
		if (c <= number) {
			for (int i = 1; i <= number; i++) {
				for (int j = 1; j <= number; j++) {
					if(rc==1) {
						if (i == c) {
							System.out.print("*");
						}
						else {
							System.out.print(" ");
						}
					}else {
						if (j == c) {
							System.out.print("*");
						}
						else {
							System.out.print(" ");
						}
					}
				}
				System.out.print("\n");
			}
		}else {
			try {
				throw new OuterOfRangeException("the given number is out of range if the column!");

			}catch(Exception e) {
				System.out.println(e.getLocalizedMessage());
			}
		}
	}
	

	public static void primaryCoordinate(int number) {
		for(int i=1;i<=number;i++) {
			for(int j=1;j<=number;j++)
			{
				if(i==j) {
					System.out.print("* ");
				}
				else {
					System.out.print("- ");
				}
			}
		}
	}
	
	public static void secondaryCoordinate(int number) {
		for(int i=1;i<=number;i++) {
			for(int j=1;j<=number;j++)
			{
				if(i+j==number+1) {
					System.out.print("* ");
				}
				else {
					System.out.print("- ");
				}
			}
			System.out.println();
		}
	}
	
	public static void primaryHalf(int number) {
		for(int i=1;i<=number;i++) {
			for(int j=1;j<=number;j++) {
				if(i>=j) {
					System.out.print("* ");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int number=Input.readInt("enter a value for the rows and columns");
//		matrix(number);
		
		//Primary co-ordiante 
//		primaryCoordinate(number);
		
		//Secondary co-ordinate
//		secondaryCoordinate(number);
		
		primaryHalf(number);
		
		
		
	}
}
