package Assignment_2;

import java.util.Scanner;

public class MaximumSum_Path_in_Two_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			int [] arr=new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i]=sc.nextInt();
			}
			int [] brr=new int[m];
			for (int j = 0; j < brr.length; j++) {
				brr[j]=sc.nextInt();
			}
			System.out.println(maxsum(arr,brr));	
		}
		
	}
		public static int maxsum(int [] arr, int [] brr) {
			int i=0;
			int j=0;
			int p=i;
			int q=j;
			int ans=0;
			while(i<arr.length && j<brr.length) {
				if(arr[i]<brr[j]) {
					i++;
				}
				else if(arr[i]>brr[j]) {
					j++;
				}
				else {
					int sum1=0;
					int sum2=0;
					for (int k = p; k <=i; k++) {
						sum1=sum1+arr[k];	
					}
					for (int k = q; k <=j; k++) {
						sum2=sum2+brr[k];	
					}
					ans=ans+Math.max(sum1, sum2);
					
					i++;
					j++;
					p=i;
					q=j;
				}
		}
			if(i==arr.length || j==brr.length) {
				int ans1=0;
				int ans2=0;
				for (int k = p; k <arr.length; k++) {
					ans1=ans1+arr[k];	
				}
				for (int k = q; k <brr.length; k++) {
					ans2=ans2+brr[k];	
				}
				ans=ans+Math.max(ans1, ans2);
				
			}
			return ans;
				
			}
	}
