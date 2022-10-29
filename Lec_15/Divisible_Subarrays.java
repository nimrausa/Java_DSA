package Lec_15;

import java.util.Scanner;

public class Divisible_Subarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int [] arr=new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i]=sc.nextInt();
			}
			System.out.println(divisible(arr));
			
	}
	}
	public static long divisible(int[] arr) {
	int n=arr.length;
	long frq [] =new long [arr.length];
	long sum=0;
	frq[0]=1;
		for (int i = 0; i < arr.length; i++) {
			sum=sum+arr[i];
			int idx=(int) (sum%n);
			if(idx<0) {
				idx=idx+n;
			}
			
			 frq[idx]=(int) (frq[idx]+1);
		}
		long ans=0;
		for (int idx = 0; idx < frq.length; idx++) {
			if (frq[idx]>=2) {
				long p=(int) frq[idx];
				ans=ans+(p*(p-1))/2;
				
				
			}
			
		}
		
		return ans;
	}

}
