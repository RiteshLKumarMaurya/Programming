package putils;

public class PerfectNumber {
	public static boolean isPerfect(int n) {
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		if(n==sum) {
			return true;
		}
		else {
			return false;
		}
	}
}
