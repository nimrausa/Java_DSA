package Assignment_4;

import java.util.Scanner;

public class Boardpath_count_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		boardpath(0,n,m,"");

	}
	public static void boardpath(int curr,int n,int m, String ans ) {
		
		int count=0;
		if(curr==n) {
			System.out.print(ans+ " ");
			count++;	
		}
		
		if(curr>n) {
			return;
		}
		for(int dice=1;dice<=m;dice++) {
			boardpath(curr+dice,n,m,ans+dice);
			
		}
		
		
		//boardpath(curr+1,n,ans+1);
		//boardpath(curr+2,n,ans+2);
		//boardpath(curr+3,n,ans+3);
		
		System.out.println(count);
		
	}

}

	
