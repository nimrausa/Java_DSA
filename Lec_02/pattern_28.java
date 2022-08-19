package Lec_02;

import java.util.Scanner;

public class pattern_28 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int space=n-1;
		int star=1;
		int row=1;
		int number=0;
		while(row<=n) {
			int j=1;
			while(j<=space) {
				System.out.print("\t");
				j++;
			}
			
			int i=1;
			while(i<=star) {
				if (i<=row) {
					number++;
				}
				else {
					number--;	
				}
				System.out.print(number + "\t");
				i++;	
				
			}
			
			space--;
			star=star+2;
			row++;
			System.out.println();
		}
	}

}