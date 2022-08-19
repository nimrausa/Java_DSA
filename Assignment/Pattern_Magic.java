package Assignment;

import java.util.Scanner;

public class Pattern_Magic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int space=-1;
		int star=n;
		int row=1;
		int end_star=n;
	
		while(row<=(2*n-1)) {
			int i=1;
			while(i<=star) {
					System.out.print("*" + "\t");	
				i++;
			}
			
			int j=1;
			while(j<=space) {
				System.out.print("\t");	
			j++;
		}
			int k=1;
			if(row==2*n-1 || row==1) {
				k=2;
			}
			
			while(k<=end_star) {
				System.out.print("*" + "\t");
				k++;
			}
			
			if(row<(n)) {
			star--;
			space=space+2;
			end_star--;
			
			}
			else {
			star++;
			space=space-2;
			end_star++;
			}
			row++;
			System.out.println();
		}
	}

}
