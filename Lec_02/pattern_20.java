package Lec_02;

import java.util.Scanner;

public class pattern_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int space = n / 2;
		int middle_space = -1;
		int row = 1;
		while (row <= n) {
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}
			System.out.print("*" + " ");
			int j = 1;
			while (j <= middle_space) {
				System.out.print("  ");
				j++;
			}
			
			if (row != 1 && row != n) {
				System.out.print("*" + " ");
			}
			
			if (row <= n / 2) {
				space--;
				middle_space = middle_space + 2;
			} else {
				space++;
				middle_space = middle_space - 2;
			}
			row++;
			System.out.println();
		}
	}
}
