package Assignment;

import java.util.Scanner;

public class Shopping_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int test_cases= sc.nextInt();
		while(test_cases-->0) {
			int a=sc.nextInt();
			int h=sc.nextInt();
			int curr=1;
			int Aayush_totol_phone=0;
			int Harshit_totol_phone=0;
			
			while(true) {
				Aayush_totol_phone=Aayush_totol_phone+curr;
				if(Aayush_totol_phone>a) {
					System.out.println("Harshit");
					break;
				}
				curr++;
				Harshit_totol_phone=Harshit_totol_phone+curr;
				if(Harshit_totol_phone>h) {
					System.out.println("Aayush");
					break;
				}
				curr++;
				
			}
		}

	}

}
