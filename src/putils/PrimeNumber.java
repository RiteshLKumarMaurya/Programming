package putils;

import java.lang.classfile.instruction.ReturnInstruction;
import java.util.Scanner;

public class PrimeNumber {
	
	public static boolean isPrime(int n) {
		boolean flag=true;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				flag=false;
				break;
			}
		}
		return flag;
	}
	
	public static boolean isPrime2(int n) {
		int count=0;
		int i=2;
		while(n>0&&i<n) {
			if(n%i==0&& i<n&&count==0) {
				count++;
				break;
			}
			i++;
		}

		return count==0? true:false; 
	}
	
}
