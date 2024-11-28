package putils;

public class ArithmeticOperations {
	public static int sum(int ... x) {
		int sum=0;
		for(int i:x) {
			sum+=i;
		}
		return sum;
	}

	public static int sub(int a,int b) {
		return a-b;
	}
	
	public static int mul(int ... x) {
		int sum=0;
		for(int i:x) {
			sum*=i;
		}
		return sum;
	}

	public static int div(int a,int b) {
		return a/b;
	}
	
	public static int mod(int a,int b) {
		return a%b;
	}
	
//	public static int squareRoute(int n) {
//		
//	}
	
}
