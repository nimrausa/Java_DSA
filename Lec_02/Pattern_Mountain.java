package Lec_02;

import java.util.Scanner;

public class Pattern_Mountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int middle_space = n+1;
		int star = 1;
		while (row <= n) {
			int number = 1;
			int i = 1;
				while (i <= star) {
					System.out.print(number + "\t");
					number++;
					i++;
			}
				
			int k = 1;
			while (k <= middle_space) {

				System.out.print("\t");
				k++;
			}
			int m = 1;
			if( row==n) {
				number--;
				star--;
				}
			while (m <= star) {
				number--;
				System.out.print(number + "\t");
				m++;
			}
			middle_space = middle_space - 2;	
			star++;
			row++;
			System.out.println();
		}
	}

}