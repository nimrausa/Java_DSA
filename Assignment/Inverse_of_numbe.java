package Assignment;

import java.util.Scanner;

public class Inverse_of_numbe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int ans=0;
		int pos=1;;
		while(n!=0) {
			int rem=n%10;
			ans=(int) (ans+pos*Math.pow(10, rem-1));
			pos++;
			n=n/10;
		}
		
		System.out.print(ans);
	}

}
