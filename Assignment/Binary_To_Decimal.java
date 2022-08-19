package Assignment;

import java.util.Scanner;

public class Binary_To_Decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int digit=0;
		while(n>0) {
			int rem=n%10;
			sum=(int) (sum+rem*Math.pow(2,digit));
			n=n/10;
			digit++;
		}
		System.out.println(sum);

	}

}
