package putils;

import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number");
	int n = sc.nextInt();	
	sc.close();
//	System.out.println(findFact(n));


}

public static int findFact(int n) {
	int pro = 1;
	for(int i=n; i>0; i--) {
		
		pro=pro*i;
	}
	return pro;
}

}
