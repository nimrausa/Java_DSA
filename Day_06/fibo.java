package Day_06;

import java.util.Scanner;

public class fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0;
		int b=1;
		for (int i = 0; i <=n; i++) {
			int c=a+b;
			a=b;
			b=c;
			
		}
		System.out.print(a);

	}

}
