package Assignment;

import java.util.Scanner;

public class Print_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1= sc.nextInt();
		int n2=sc.nextInt();
		int s=0;
		int i=1;
		while(i<=n1) {
			s=3*i+2;
			if(s%n2!=0) {
				System.out.println(s);
			}
			else {
				n1++;
			}
			i++;
		}
	}

}
