package putils;

public class HappyNumber {
	public static boolean isHappy(int n) {
		boolean flag=true;
		while(sumOfSquareOfEachDigit(n)==1||sumOfSquareOfEachDigit(n)==4) {
			if(sumOfSquareOfEachDigit(n)==1) {
				flag=true;
				break;
			}
			else if(sumOfSquareOfEachDigit(n)==4) {
				flag=false;
			}else {
				flag=false;
				break;
			}
			n=n/10;
		}
		return flag;
	}
	
	public static int sumOfSquareOfEachDigit(int n) {
		int sum=0;
		while(sum==1||sum==1) {
		while(n>0) {
			int digit=n%10;
			sum+=Power.findPow(digit, 2);
			n=n/10;
		}
	}
		
		return sum;
	}
	
	public static void main(String[] args) {
		int n=Input.readInt("a number");
		if(check(n)) {
			System.out.println("yes!");
		}else {
			System.out.println("no!");
		}
	}
	
	public static boolean check(int n) {
		while(n!=1&&n!=4) {
			int sum=0;
			while(n!=0) {
				int digit=n%10;
				sum=sum+digit*digit;
				n=n/10;
			}
			n=sum;
		}
		return n==1;
	}
}
