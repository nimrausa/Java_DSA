package Lec_02;

import java.util.Scanner;

public class pattern_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int space=0;
		int row=1;
		int star=n;
		
		while(row<=n) {
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
			space=space+2;
			row++;
			star--;
			System.out.println();
		}
	}

}
