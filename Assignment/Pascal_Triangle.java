package Assignment;

import java.util.Scanner;

public class Pascal_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int row=0;
	while(row<=n) {
		int i=0;
		int ncr=1;
		while(i<=row) {
			System.out.print(ncr + "\t");
			ncr=((row-i)*ncr)/(i+1);
			
			i++;
		}
			row++;
			System.out.println();
		}
		
	}
	

}
