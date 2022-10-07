package Assignment_2;

import java.util.Scanner;

public class Rain_Water_Trapping {

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
		
		System.out.println(rain(arr));
		}
		
	}
	public static int rain(int [] arr) {
		int n=arr.length;
		int [] left=new int[n];
		int sum=0;
		left[0]=arr[0];
		for (int i = 1; i < left.length; i++) {
			left[i]=Math.max(left[i-1],arr[i]);
			
		}
		int [] right=new int[n];
		right[n-1]=arr[n-1];
		for (int i = n-2; i >=0; i--) {
			right[i]=Math.max(right[i+1],arr[i]);
			
		}
		int [] brr=new int[n];
		for (int i = 0; i < right.length; i++) {
			brr[i]=Math.min(left[i],right[i])-arr[i];
			sum=sum+brr[i];
		
		}
		return sum;
		
		
		

	}

}
