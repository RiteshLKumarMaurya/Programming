package putils;

public class PerfectSquare {
	public static boolean isPerfectSquare(int n) {
		boolean flag=false;
		for(int i=1;i<=n;i++) {// why till n
			if(i*i==n) {
				flag=true;
				break;
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		System.out.println(isPerfectSquare(16));
	}
}	
