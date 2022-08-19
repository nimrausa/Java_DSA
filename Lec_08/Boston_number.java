package Lec_08;

import java.util.Scanner;

public class Boston_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		isbostonnumber(n);

	}
	public static void isbostonnumber(int n) {
			int i=2;
			int x=n;
			int prime=0;
		while(i<=n) {
			while(n%i==0) {
			 prime=prime+sod(i);
				n=n/i;	
		}
		i++;	
	}
		int ans=sod(x);
		if(ans==prime) {
			System.out.println(1);
			
		}
		else {
			System.out.println(0);
		}
	}
	
	public static int sod(int n) {
		int sum=0;
		while(n>0) {
			int rem=n%10;
			sum=sum+rem;
			n=n/10;	
		}
		return sum;
	}

}
