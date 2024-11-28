package putils;

public class ProductDigit {
	public static int productDigit(int n) {
		int prod=1;
		while(n!=0) {
			int digit=n%10;
			prod=prod*digit;
			n=n/10;
		}
		return prod;
	}
}
