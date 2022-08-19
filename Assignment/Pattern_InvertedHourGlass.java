package Assignment;

import java.util.Scanner;

public class Pattern_InvertedHourGlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int space = 2 * n - 1;
		int star = 1;

		while (row <= 2 * n + 1) {

			int i = 1;
			int number = n;
			if (row == n+1) {
				i = 2;
				
			}
			while (i <= star) {
				System.out.print(number + "\t");
				number--;

				i++;

			}
			int k = 1;
			while (k <= space) {
				System.out.print("\t");
				k++;
			}
			int j = 1;
			if (row == n+1) {
				number--;
				
			}
			while (j <= star) {
				number++;
				System.out.print(number + "\t");

				j++;

			}
			if (row <= n) {
				space = space - 2;
				star++;
				number--;
			} else {
				space = space + 2;
				star--;
				number++;
			}
			row++;
			System.out.println();

		}
	}
}
