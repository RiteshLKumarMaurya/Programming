package number_series;
import java.util.Scanner;

public class FindSmallest {
	static Scanner sc=new Scanner(System.in);
	 public static int findSmallestDigitInGivenNumber(int n) {
		int smallest=n;
		while(n!=0) {
			int rem;
			rem=n%10;
			if(rem<smallest) {
				smallest=rem;
			}
			n=n/10;
		}
		return smallest;
	}
	public static void main(String[] args) {
		System.out.print("Enter the number to find the smallest digit: ");
		int n=sc.nextInt();
		System.out.println("Smallest digit in the given number : "+findSmallestDigitInGivenNumber(n));
	sc.close();
	}
}
