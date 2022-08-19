package Assignment;

import java.util.Scanner;

public class Chewbacca_and_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long n= sc.nextLong();
		long sum=0;
		long mul=1;
		long reverse=0;
		while(n>0) {
			long rem=n%10;
			if(n/10==0 && rem==9) {
				sum=sum+rem*mul;
			}
			else if(rem<=4 ) {
				sum=sum+rem*mul;
			}
			else {
				reverse=9-rem;
				sum=sum+reverse*mul;
				
			}
			mul=mul*10;
			n=n/10;
			
		}
		System.out.print(sum);
	}

}
