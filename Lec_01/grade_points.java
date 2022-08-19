package Lec_01;

import java.util.Scanner;

public class grade_points {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int marks=sc.nextInt();
		if (marks>=75) {
			System.out.println("Grade : A" );
		}
		else if (65 <= marks && marks < 75 ) {
			System.out.println("Grade : B" );
		}
		else if (55 <= marks && marks < 65 ) {
			System.out.println("Grade : C" );
		}
		else if (45 <= marks && marks < 55 ) {
			System.out.println("Grade : D" );
		}
		else {
			System.out.println("Fail");
		}
	}

}
