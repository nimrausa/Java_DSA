package Doubts1;

import java.util.Scanner;

public class Chewbacaa_and_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;
		int mul=1;
		while(n>0) {
			
			int rem=n%10;
			if(rem>=5 && n!=9) {
			sum=sum+(9-rem)*mul;
			}
			else {
				sum=sum+rem*mul;
				
			}
			
			mul=mul*10;
			n=n/10;
			
		}
		System.out.println(sum);
	}

}
