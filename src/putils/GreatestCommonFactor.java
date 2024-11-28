package putils;

public class GreatestCommonFactor {
	public static void main(String[] args) {
		int n1=Input.readInt("n1 value");
		int n2=Input.readInt("n2 value");
		int maxFactor=1;
		int min;
		
		min=n1<n2? n1:n2;
		
		for(int i=1;i<=min;i++) {
			if(n1%i==0&&n2%i==0) {
				if(i>maxFactor) {
					maxFactor=i;
				}
			}
		}
		System.out.println("max common factor "
				+ "is: "+maxFactor);
	}
}
