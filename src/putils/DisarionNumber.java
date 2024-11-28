package putils;

public class DisarionNumber {
	public static boolean isDesarion(int n) {
		int temp=n;
		int sum=0;
		while(n>0) {
			int count=CountDigit.count(n);
			int digit=LastDigit.find(n);
			int power=Power.findPow(digit, count);
			sum=sum+power;
			n/=10;
		}
		return sum==temp;
	}
	public static void main(String[] args) {
		int n=Input.readInt(" a number");
		if(isDesarion(n)) {
			System.out.println("Yes! "+n+ " is a desarion number!.");
		}
		else {
			System.out.println("No!");
		}
	}
}
