package number_series;
import java.util.Scanner;

public class BuzzNumber {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter a number to check wheather, it is Buzz Number or not: ");
		int n=sc.nextInt();
		if(isBuzzNumber(n)) {
			System.out.println(n+ " is a "+"Buzz number.");
		}else {
			System.out.println(n+" is not a Buzz number.");
		}
	}
	
	public static boolean isBuzzNumber(int n) {
		if(n%7==0) {
			return true;
		}
		else if(n%7==7) {
			return true;
		}
		else {
			return false;
		}
	}
}
