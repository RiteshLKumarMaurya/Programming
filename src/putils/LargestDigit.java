package putils;

public class LargestDigit {
	public static int findLargest(int n) {
		int max=0;
		while(n!=0) {
			if(n%10>max) {
				max=n%10;
			}
		}
		return max;
	}
	
	public static boolean isLargest(int d) {
		if(d==findLargest(d)) {
			return true;
		}
		else {
			return false;
		}
	}
}
