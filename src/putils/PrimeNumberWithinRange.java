package putils;

public class PrimeNumberWithinRange {
	public static int [] primeNumbersInRange(int init,int last) {
		int arr[]=new int[0];
		int c=0;
		if(init>2 && last>2) {
			for(int i=init;i<=last;i++) {
				if(PrimeNumber.isPrime(init)) {
					arr=new int[arr.length+1];
					arr[c]=i;
					c++;
				}
			}
		}else {
			System.out.println("2 is not vald for the range...");
		}
		return arr;
	}
}
