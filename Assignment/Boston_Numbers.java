package Assignment;

import java.util.Scanner;

public class Boston_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a=n;
		int sum = 0;
		while (n > 0) {
			int rem = n% 10;
			sum = sum + rem;
			n = n / 10;
		}
		int primefact = 0;
		for (int i = 2; i <= a; i++) {
			while (a % i == 0) {
				int star=0;
				int r=i;
			
				if (i<10){
					primefact=primefact+i;
				}		
				else  {
					while(r>0) {
						int digit=r%10;
						star=star+digit;
						r=r/10;	
					}	
					primefact=primefact+star;
				}
				a=a/i;
		}
		}
		
		if(sum==primefact) {
			System.out.println("1");
	}
		else {
			System.out.println("0");
		}
}
}
