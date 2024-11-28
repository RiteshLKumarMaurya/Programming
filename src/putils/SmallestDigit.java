package putils;

public class SmallestDigit {
	public static int findSmallest(int n) {
		int min=n;
		while(n!=0) {
			if(n%10<min) {
				min=n%10;
			}
		}
		return min;
	}
	
	public static boolean isSmallest(int d) {
		if(d==findSmallest(d)) {
			return true;
		}
		else {
			return false;
		}
	}
}
