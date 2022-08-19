package Lec_02;

import java.util.Scanner;

public class pattern_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int space=n-1;
		int star=1;
		int row=1;
	
		
		while(row<=(2*n-1)) {
			int j=1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			
			int i=1;
			while(i<=star) {
					System.out.print("*" + " ");	
				i++;
			}
			if(row<n) {
			star++;
			space--;
			}
			else {
			star--;
			space++;
			}
			row++;
			System.out.println();
		}
	}

}
