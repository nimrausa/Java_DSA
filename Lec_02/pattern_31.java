package Lec_02;

import java.util.Scanner;

public class pattern_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int star=n;
		int row=1;
		int king=n;
		while(row<=n) {
			int number=5;
			int i=1;
			while(i<=star) {
			if (i==king) {
				System.out.print("*"+ " ");
			}
			else {
				System.out.print(number + " ");
				number--;	
			}
			i++;
			}
			
			
			king--;
			row++;
			System.out.println();	
		}
	}

}