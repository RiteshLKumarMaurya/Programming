package putils;

public class Factors {
	public static int [] allFactors(int n) {
		int arr[]=new int[0];

		int c=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				arr[c]=i;
				c++;
			}
		}
		return arr;
	}
}
