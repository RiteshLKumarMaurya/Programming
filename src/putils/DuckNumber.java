package putils;

public class DuckNumber {
	public static void main(String[] args) {
		int n = Input.readInt("a number");
//		System.out.println(isDuck(n));
		isDuckNumberOrNot(n);
	}

	public static void isDuckNumberOrNot(int n) {
		int count=0;
		int n2=n;
		int temp=n;
		int d=1;
		
		while(n>0) {
			count++;
			n=n/10;
		}
		for(int i=1;i<=d;i++) {
			d=d*10;
		}
		
		if(n2%d!=0) {
			
			while(n2>0) {
				if(n2%10==0) {
					System.out.println("yes a duck number!");
					n2=n2/10;
				}
			}
		}else {
			System.out.println("not eligible for a duck number!");
		}
	}
	
	
	
	public static boolean isDuck(int n) {
		int n2=n;
		boolean flag = false;
		int d = 1;
		int count = 0;

		for (; n > 0; n /= 10)
			count++;

		for (int i = 1; i <= count; i++) {
			d = d * 10;
		}

		//System.out.println("check n: " + n);

		if (n2 % d != 0) {
			while (n2 > 0) {
				if (n2 % 10 == 0) {
					flag = true;
					break;
				}
				n2 = n2 / 10;
			}
		}
		else {
			System.out.println("not a duck number!");
		}
		return flag;
	}
}
