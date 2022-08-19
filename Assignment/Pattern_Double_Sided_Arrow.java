package Assignment;

import java.util.Scanner;

public class Pattern_Double_Sided_Arrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int number = 1;
		int space = n - 1;
		int middle_space = -1;
		int star = 1;
		while (row <= n) {
			int j = 1;
			while (j <= space) {
				System.out.print("\t");
				j++;
			}
			int i = 1;
			while (i <= star) {

				System.out.print(number + "\t");
				number--;
				i++;
			}
			int k = 1;
			while (k <= middle_space) {

				System.out.print("\t");
				k++;
			}
			number++;
			if(row!=1 && row!=n) {
				number--;
			int m = 1;
			while (m <= star) {
				number++;
				System.out.print(number + "\t");
				m++;
			}
			}
			if (row <=n/2) {
				number++;
				space = space - 2;
				middle_space = middle_space + 2;
				star++;
			} 
			else {
				space = space + 2;
				middle_space = middle_space - 2;
				number--;
				star--;
				
			}
			row++;
			System.out.println();
		}
	}

}