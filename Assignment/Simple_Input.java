package Assignment;

import java.util.Scanner;

public class Simple_Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int sum=0;
		while(sc.hasNext()) {
		int n=sc.nextInt();
		sum=sum+n;
		if(sum<0){
			break;
		}
		System.out.println(n);
		}
		
		

	}

}
