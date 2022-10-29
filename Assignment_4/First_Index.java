package Assignment_4;

import java.util.Scanner;

public class First_Index {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();			
		}
		
		
		int m=sc.nextInt();
		
		firstindex(n,m,arr,0,0);

	}
	public static void firstindex(int n,int m,int arr[],int ans,int index) {
		
		if(m==ans) {
			System.out.print(index);
			
		}
		
		
		for(int i = 0; i < arr.length; i++) {
			firstindex(n,m,arr,ans=arr[i],index=i);
			
		}
		
		
		
		
		
	}

}

	


