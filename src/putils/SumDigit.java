package putils;

public class SumDigit {
	public static int sum(int n) {
		int s=0;
		while(n!=0) {
			int digit=n%10;
			s+=digit;
			n=n/10;
		}
		return s;
	}
}
