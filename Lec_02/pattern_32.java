package Lec_02;

import java.util.Scanner;

public class pattern_32 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		int star=1;
		int row=1;
		int number=1;
		while(row<=2*n-1) {
			
			int i=1;
			while(i<=star) {
				
				if(i%2==0) {
					System.out.print("*"+ " ");
				}
				else {
				System.out.print(number + " ");
				}
				i++;	
				
			}
			if (row<n) {
				number++;
				star=star+2;
			}
			else {
				number--;	
				star=star-2;
			}
			
			
			row++;
			System.out.println();
		}
	}

}