package putils;

public class SumNaturalNum {
	public static int sumOfN(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
	return sum;	
	}
	
	public static int sumOfRange(int n1,int n2) {
		int sum=0;
		for(int i=n1;i<=n2;i++) {
			sum+=i;
		}
		return sum;
	}
}
