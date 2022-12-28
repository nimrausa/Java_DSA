package Day_04;

import java.util.Scanner;

public class prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int fact=0;
		int i=2;
		while(i<n) {
			if((n%i)==0) {
				fact++;
				break;
			}
			i++;
		}
		if(fact>0) {
			System.out.println("not prime");
		}
		else {
			System.out.println("prime");
		}
	}
}
