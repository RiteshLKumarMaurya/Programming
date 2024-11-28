package putils;

public class PolindromeNumber {
	public static boolean isPolindrome(int n) {
		if(n==ReverseNumber.reverse(n)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean isPolindrome2(int n) {
		int rev=0;
		int val=n;
		while(n>0) {
			rev=rev*10+n%10;
			System.out.println("n: "+n);
			n=n/10;
		}
		System.out.println("final n: "+n);
		return rev==val;
	}
	
}
