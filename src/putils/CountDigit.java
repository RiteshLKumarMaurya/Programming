package putils;

public class CountDigit {
	public static int count(int n) {
		int c=0;
		while(n!=0) {
			c++;
			n=n/10;
		}
		return c;
	}
}
