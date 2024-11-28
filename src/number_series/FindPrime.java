package number_series;
import java.util.Scanner;
public class FindPrime {
	static Scanner sc=new Scanner(System.in);
	
	public static boolean isPrimeOrNot(int n) {
		boolean flag=true;
		for(int i=1+1;i<=n-1;i++) {
			if(n%i==0) {
				flag= false;
				break;
			}
		}
		return flag;
	}
	
	public static boolean isPrimeOrNot2(int n) {
		int c=0;
		for(int i=1+1;i<=n-1;i++) {
			if(n%i==0) {
				c++;
				break;
			}
		}
		if(c>0) {
			return false;
		}
		else {
			return true;
		}
	}
	
	
	public static boolean isPrimeOrNot3(int n) {
		int c=0;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				c++;
				break;
			}
		}
		if(c>0) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public static void main(String[] args) {
		System.out.print("Enter the numbern to check it: ");
		int n=sc.nextInt();
		boolean isPrime=isPrimeOrNot(n);
		if(isPrime) {
		System.out.println(n+" : a Prime Number!");
		}
		else {
			System.out.println(n+" : Not a Prime Number!");
		}
	}
}
