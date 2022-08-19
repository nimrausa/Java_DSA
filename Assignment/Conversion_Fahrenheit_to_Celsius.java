package Assignment;

import java.util.Scanner;

public class Conversion_Fahrenheit_to_Celsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc=new Scanner(System.in);
		int min=sc.nextInt();
		int max=sc.nextInt();
		int step=sc.nextInt();
		int i=min;
		while(i<=max) {
		int C = (5*(i - 32))/9;
		System.out.print(i + " ");
		System.out.println(C);
		i=step+i;
	}
	}

}
