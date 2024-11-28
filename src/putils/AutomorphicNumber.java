package putils;

// 25 --> 625 (25--> 25 -> yes)
public class AutomorphicNumber {
	public static boolean isAutoMorphic(int n) {
		int val = n;
		int square = Power.findPow(val, 2);
		int last1;
		int last2;
		int noOfDigit = 0;

		while (n > 0) {
			noOfDigit++;
			n = n / 10;
		}

		int count = 0;
		while (n > 0) {
			last1 = n % 10;
			last2 = square % 10;
			if (last1 == last2) {
				count++;
			}
			square = square / 10;
			n = n / 10;
		}
		if (count == noOfDigit) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		int n = Input.readInt("a number");
		if (isAutomorphicNumber(n)&&isAutoMorphic(n)) {
			System.out.println("yes! " + n + " is automorphic number!");
		} else {
			System.out.println("No!");
		}
	}

	public static boolean isAutomorphicNumber(int n) {
		int square = n * n;
		boolean flag = true;

		while (n > 0) {
			if (n % 10 ==square % 10) {
				n /= 10;
				square /= 10;
			} else {
				flag = false;
				break;
			}
		}
		return flag;
	}
}
