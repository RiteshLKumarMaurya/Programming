package putils;

public class DuckNum {
	public static boolean isDuck(int n) {
		boolean flag=false;
		if(n>0) {
			while(n>0) {
				if(n%10==0) {
					flag= true;
					break;
				}
				n=n/10;
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		System.out.println(isDuck(Input.readInt("a number")));
	}
}
