package putils;

public class SpyNumber {
	public static boolean isSpy(int n) {
		if(SumDigit.sum(n)==ProductDigit.productDigit(n)) {
			return true;
		}
		return false;
	}
}
