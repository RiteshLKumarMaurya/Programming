package putils;

public class SunnyNumber {
	public static boolean isSunnyNumber(int n) {
		System.out.println(PerfectSquare.isPerfectSquare(n+1));
		if(PerfectSquare.isPerfectSquare(n+1)) {
			return true;
		}
		else {
			return false;
		}
	}
}
