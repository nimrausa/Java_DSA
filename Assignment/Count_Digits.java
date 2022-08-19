package Assignment;

import java.util.Scanner;

public class Count_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int d=sc.nextInt();
		int count=0;
		while(n!=0) {
			int rem=n%10;
			if(d==rem) {
			count++;
		}
		n=n/10;
	}
		System.out.println(count);

}
}