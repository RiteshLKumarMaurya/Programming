package putils;

public class TechNumbers {
	public static void main(String[] args)throws Exception {
		int n=Input.readInt("a number");
		System.out.println(isTechNumber(n));
	}

	public static boolean isTechNumber(int n)throws Exception
	{
		
		int n1 = 0;
		int n2 = 0;
		int val = n;
		int d = 1;
		int count = 0;
		int n3=0;

		while (n > 0) {
			count++;
			n = n / 10;
		}
		
		if(count%2==0){
			for (int i = 1; i <= count/2; i++) {
				d=d*10;
			}
			
			n1=val/d;
			n2=val%d;
			
			System.out.println("n1: "+n1);
			System.out.println("n2: "+n2);
			n3=n1+n2;
			
			System.out.println("n3*n3: "+n3*n3+" == val:"+val);
			return n3*n3==val;
	
		}
		else {
			throw new NotEligibleNumber("not eligible for tech number!");
		}

		

	}
}
