package Assignment;

import java.util.Scanner;

public class Pattern_HourGlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int space = 0;
		int star = 2*n+1;
		int number = n;
		while (row <= 2*n+1) {
			int k = 1;
			while (k <= space) {
				System.out.print("\t");
				k++;
			}
			if(row==n+1) {
				System.out.print("0" + "\t");
			}
			else {
			int i = 1;
				while (i <= star) {
					if(i<=star/2) {
						
						System.out.print(number + "\t");
						number--;
					}
					else if(i==(star+1)/2){
						System.out.print("0" + "\t");
					}
					else {
						number++;
						System.out.print(number + "\t");	
					}
					i++;
			}
			}
				if(row<=n) {
					space++;
					star=star-2;
					number--;
					}
					else {
					space--;
					star=star+2;
					number++;			
					}
					row++;
					System.out.println();
				
			}
	}
}

