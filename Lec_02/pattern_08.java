package Lec_02;

import java.util.Scanner;

public class pattern_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int space=0;
		int space_2=(n+1)/2;
		int row=1;
		int star=n;
		
		while(row<=n) {
			int j=1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			System.out.print("*" + " ");
			int i=1;
			while(i<=space_2) {
				System.out.print("  ");
				i++;
			}
			if (row !=(n+1)/2) {
			System.out.print("*");
			}
			if (row <(n+1)/2) {
				space_2=space_2-2;
				space++;
			}
			else {
			space--;
			space_2=space_2+2;
			}
			row++;
			System.out.println();
		}
	}

}
