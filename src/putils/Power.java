package putils;

public class Power {

	public static int findPow(int m,int n) {
		int prod=1;
		for(int i=1;i<=n;i++) {
			prod*=m;
		}
		return prod;
	}
}
