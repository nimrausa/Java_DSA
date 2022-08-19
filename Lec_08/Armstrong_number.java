package Lec_08;

import java.util.Scanner;

public class Armstrong_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(isArmstrongnumber(n));

	}
	public static boolean isArmstrongnumber(int n) {
		int cod=countofdigit(n);
		int b=0;
		int x=n;
		double sum=0;
		while(n>0) {
			int rem=n%10;
			sum=sum+Math.pow(rem, cod);
			n=n/10;
		}
		if (x==sum) {
			return true;
		}
		else {
			return false;
		}
	}
	public static int countofdigit(int n) {
		int count=0;
		while( n>0) {
		count++;
		 n=n/10;
	}
		return count;
	}
	
	
}