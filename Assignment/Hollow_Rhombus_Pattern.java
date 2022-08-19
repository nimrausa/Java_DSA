package Assignment;

import java.util.Scanner;

public class Hollow_Rhombus_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int space=n-1;
		int row=1;
		int middle_space=(n+1)/2;
		

	while(row <=n) {
		int j=1;
		while( j<=space) {
			
			System.out.print(" ");
			j++;
		}
		int i=1;
		if (row==1 || row==n) {
			while(i<=n) {
				System.out.print("*" );
				i++;
			}
			
		}
		else {
		System.out.print("*");
		int k=1;
		while( k<=middle_space) {
			System.out.print(" ");
			k++;
		}
		System.out.print("*" + " ");
		}
		space--;
		row++;
		System.out.println();
		}
	}
	}



