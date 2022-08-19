package Assignment;

import java.util.Scanner;

public class Print_Armstrong_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		
		for(int n=n1; n<=n2; n++) {
		if(isArmstrongnumber(n))
		System.out.println(n);
		
		}
		
		
	}
	public static boolean isArmstrongnumber( int n) {
		int cod=countofdigit(n);
		int b=0;
		int x=n;
		double sum=0;
		int count=0;
		while(n>0) {
			int rem=n%10;
			sum=sum+Math.pow(rem, cod);
			n=n/10;
		}
		if (sum==x) {
			return true;
		}
		else {
			return false;
		}
		
		
		
	}
	public static int countofdigit(int n) {
		int count=0;
		while(n>0) {
		count++;
		n=n/10;
		}
		
		return count;
				
	}
	
	

}
