package Lec_02;

import java.util.Scanner;

public class pattern_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int space=-1;
		int star=n/2+1;
		int row=1;
		int end_star=n/2+1;
	
		while(row<=(n)) {
			int i=1;
			while(i<=star) {
					System.out.print("*" + "\t");	
				i++;
			}
			
			int j=1;
			while(j<=space) {
				System.out.print("\t");	
			j++;
		}
			int k=1;
			if(row==n || row==1) {
				k=2;
			}
			
			while(k<=end_star) {
				System.out.print("*" + "\t");
				k++;
			}
			
			if(row<=(n/2)) {
			star--;
			space=space+2;
			end_star--;
			
			}
			else {
			star++;
			space=space-2;
			end_star++;
			}
			row++;
			System.out.println();
		}
	}

}
