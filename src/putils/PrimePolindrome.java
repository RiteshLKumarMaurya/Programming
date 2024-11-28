package putils;

public class PrimePolindrome {
	public static boolean isPrimePolindrome(int n) {
		if(PrimeNumber.isPrime(n)==PolindromeNumber.isPolindrome(n)) {
			return true;
		}
		else {
			return false;
		}
	}
}
