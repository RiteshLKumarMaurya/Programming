package putils;

public class ArmStrong {
	public static boolean isArmStrong(int n) {
		int temp=n;
		int sum=0;
		int count=CountDigit.count(n);
		for(int i=0;i<count;i++) {

			int digit=LastDigit.find(n);
			sum+=Power.findPow(digit, count);
			n=n/10;

		}
		return sum==temp;
	}
	
	public static void main(String[] args) {
		int n=Input.readInt("a number");
		if(isArmStrong(n)) {
			System.out.println(n+" is an ArmStrong number.");
		}
		else {
			System.out.println(n+ " is not an armStrong number.");
		}
	}
}
