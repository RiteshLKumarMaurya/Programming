package putils;

public class DivisibleNumber {
	public static int [] allDivisible(int n) {
		int arr[]=new int[0];

		int i=0;
		while(n>0) {
			if(n%i==0) {
				arr=new int[arr.length+1];
				arr[i]=i;
				i++;
			}
		}
		return arr;
	}
}
