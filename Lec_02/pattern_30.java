package Lec_02;

import java.util.Scanner;

public class pattern_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int star=n;
		int row=1;
		while(row<=n) {
			int number=5;
			int i=1;
			while(i<=star) {
				System.out.print(number + " ");
				number--;	
			i++;
			}
			
			row++;
			System.out.println();	
		}
	}

}