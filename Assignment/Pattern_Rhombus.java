package Assignment;

import java.util.Scanner;

public class Pattern_Rhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int space=n-1;
		int star=1;
		int row=1;
		int number=0;
		while(row<=2*n-1) {
			int j=1;
			while(j<=space) {
				System.out.print("\t");
				j++;
			}
			
			int i=1;
			while(i<=star) {
				if(row==1 || row==2*n-1) {
					star=1;
				}
				
				if (i<=(star+1)/2) {
					number++;
					System.out.print(number + "\t");
				}
				else {
					number--;
					System.out.print(number + "\t");
					
				}
				
				i++;	
				
			}
			if(row<n) {
			space--;
			star=star+2;
			}
			else {
				space++;
				star=star-2;
				number=number-2;
			}
			row++;
			System.out.println();
		}
	}

}