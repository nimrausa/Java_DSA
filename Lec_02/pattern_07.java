package Lec_02;

import java.util.Scanner;

public class pattern_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int space=n-2;;
		int row=1;
		int star=n;
		
		while(row<=n) {
			int i=1;
			if(row==1 || row==n) {
			
			while(i<=star) {
				System.out.print("*" + " ");
				i++;
			}
			}
			else {
				System.out.print("*" + " ");
			int j=1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			System.out.print("*");
			}
			row++;
			System.out.println();
		}
	}

}
