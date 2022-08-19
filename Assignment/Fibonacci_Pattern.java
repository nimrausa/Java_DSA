package Assignment;

import java.util.Scanner;

public class Fibonacci_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int x=0;
		int y=1;
		while(row<=n) {
			int i=1;
			
			
			while(i<=row) {
				System.out.print(x+ " ");
				int z=x+y;
				x=y;
				y=z;
				
			
				
			i++;
		}
			
			System.out.println();
			row++;
		}
	}

}
