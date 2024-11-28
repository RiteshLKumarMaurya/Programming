package putils;

public class CountFactors {

	public static int count(int n) {
		int c=0;
		int i=1;
		while(n!=0) {
			if(i<n) {
				if(n%i==0) {
					c++;
				}
				i++;
			}
		}
		return c;
	}

}
