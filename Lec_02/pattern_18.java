package Lec_02;

import java.util.Scanner;

public class pattern_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int space=n/2;
		int star=1;
		int row=1;
		while(row<=n) {
			int j=1;
			while(j<=space) {
				System.out.print("\t");	
			j++;
		}
			int i=1;
			while(i<=star) {
					System.out.print("*" + "\t");	
				i++;
			}
			
			
			
			if(row<(n/2 +1)) {
			star=star+2;
			space--;
			}
			else {
			star=star-2;
			space++;
			}
			row++;
			System.out.println();
		}
	}

}