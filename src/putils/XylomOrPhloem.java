package putils;

public class XylomOrPhloem {
	public static String check(int n) {
		int val=n;
		int innerSum=0;
		int outerSum=0;

		outerSum=val%10;
		val=val/10;

		while(val>9) {
			innerSum+=val%10;
			val/=10;
		}

		outerSum+=n;

		//		if(innerSum==outerSum) {
		//			return "xylom number!";
		//		}
		//		else {
		//			return "Pholem Number!";
		//		}

		return outerSum==innerSum? "Xylom Number":"Phloem Number";
	}
}
