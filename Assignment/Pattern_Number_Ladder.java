package Assignment;

import java.util.Scanner;

public class Pattern_Number_Ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int number=0;

	while(row <=n) {
		int i=1;
		while( i<=row) {
			number++;
			System.out.print(number + "\t");
			i++;
		}
		
		row++;
		System.out.println();
	}
	}

}

