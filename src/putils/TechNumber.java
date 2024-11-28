package putils;

public class TechNumber {
	public static long[] divideIn2Parts(long l) {
		long arr[]=new long[2];
		long n1=1;
		long n2=1;
		long count=0;
		long count2=0;
		long temp=l;
		long temp2=l;
		long h=1;
		
		while(l>0) {
			count++;
			count2++; 
		}
		
		if(count%2==0) {
			while(count>=count/2) {
				temp=temp/10;
			}
			n1=temp;
			
			while(count>=count/2) {
				h=h/10;
				count--;
			}
			
			n2=l-n1*n1;
			
			
		}
		if((n1*n1)+(n2*n2)==l) {
			arr[0]=n1;
			arr[1]=n2;
			return arr;
		}
		else {
			return arr;
		}
		
	}
	
	public static void main(String[] args) {
		int n=Input.readInt("a number");
		long arr[]=divideIn2Parts(n);

		System.out.println(arr[0]);
		System.out.println(arr[1]);
	}
}
