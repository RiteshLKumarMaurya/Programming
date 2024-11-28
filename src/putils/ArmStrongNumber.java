package putils;

public class ArmStrongNumber {
	public static boolean isArmStrong(int n) {
		int sum=0;
		int val=n;
		while(n>0) {
			sum+=Exponent.findQueue(n%10);
			n/=10;
		}
		return sum==val;
	}
}
