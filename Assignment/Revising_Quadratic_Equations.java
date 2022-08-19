package Assignment;

import java.util.Scanner;

public class Revising_Quadratic_Equations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=(b*b-4*a*c);  
		if(d<0) {
			 System.out.println("Imaginary");
		}
		else if(d==0) {
			int r1=(-b+(int) Math.sqrt(d))/2*a;
			int r2=(-b+(int) Math.sqrt(d))/2*a;
			System.out.println("Real and Equal");
			System.out.println(r1 + " " + r2);
			
		}
		else {
			int r1=(-b-(int) Math.sqrt(d))/2*a;
			int r2=(-b+(int) Math.sqrt(d))/2*a;
			System.out.println("Real and Distinct");
			System.out.println(r1 + " " + r2);
			
		}
	}

}
