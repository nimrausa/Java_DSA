package Lec_02;

import java.util.Scanner;

public class pattern_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int space=n-1;
		int row=1;
		while(row<=n) {
			int j=1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			int i=1;
			while(i<=row) {
				System.out.print("*" + " ");
				i++;
			}
			space--;
			row++;
			System.out.println();
		}
	}

}
