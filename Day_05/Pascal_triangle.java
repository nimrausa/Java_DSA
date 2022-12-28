package Day_05;

import java.util.Iterator;
import java.util.Scanner;

public class Pascal_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int star=1;
		int row=0;
		while(row<n) {
			int val=1;
			for(int i=0; i<star; i++) {
				System.out.print(val + " ");
				val=((row-i)*val)/(i+1);
			}
			row++;
			System.out.println();
			star++;
		}

	}

}
