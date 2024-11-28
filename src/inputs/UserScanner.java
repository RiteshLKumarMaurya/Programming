package inputs;

import java.util.Scanner;
import java.io.InputStream;
import java.io.InputStreamReader;

public class UserScanner {
    public static final InputStream in = null;

	public static void main(String[] args) {
		System.out.println("Enter any number: ");
//		Scanner sc=new Scanner(in);
		Scanner sc=new Scanner(System.in);
		
		InputStreamReader in2=new InputStreamReader(in);
		
//		Scanner sc=new Scanner(in2);

		System.out.print("Enter : ");
//		var x=sc.next();
		System.out.println(sc.nextLine());
	}
}
