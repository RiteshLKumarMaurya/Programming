package number_series;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		System.out.println(10.0/4.0);
		
		new Scanner(System.in).close();
		/**
		 * in the System.in means we are giving argument t the system using the 
		 * System.in and . we can close because having the Buffered open when we 
		 * create object for it. But in our class there is no ary buffrs so no opt
		 * to close()
		 * */
		
		Test t=new Test();
//		t.close();---> Why do we not need to close it??
	}
	
	
}
