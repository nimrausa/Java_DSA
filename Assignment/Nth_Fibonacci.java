package Assignment;

import java.util.Scanner;

public class Nth_Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int a=0;
		int b=1;
		while(n>0) {
		int c=a+b;
		a=b;
		b=c;
		n--;
	}
		System.out.println(a);
}
}
