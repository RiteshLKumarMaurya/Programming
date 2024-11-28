package putils;

public class BuzzNumber {
	public static boolean isBuzz(int n) {
		return n%10==7||n%7==0;
	}
	public static void main(String[] args) {
		System.out.println(isBuzz(Input.readInt("a number")));
	}
}
