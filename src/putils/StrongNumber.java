package putils;

public class StrongNumber {
	public static boolean isStrongNumber(int n) {
		int sum=0;
		int val=n;
		while(n>0) {
			sum+=Factorial.findFact(n%10);
			n=n/10;
		}
		
		return val==sum;
	}
}
