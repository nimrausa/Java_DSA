package DAY_15;

import java.util.Scanner;

public class Divisible_SUBarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int [] arr=new int [n];
			for (int i = 0; i < arr.length; i++) {
				arr[i]=sc.nextInt();			
			}		
			System.out.println(goodsubarray(arr, n));
		}	
	}
	public static int goodsubarray(int[] arr, int n) {		
		long sum=0;
		int c=0;
		
		int [] frq=new int [n];
		frq[0]=1;
		for (int i = 0; i < frq.length; i++) {
			sum=sum+arr[i];
			int idx=(int) (sum%n);	
			frq[idx]=frq[idx]+1;
		}
		for (int i = 0; i < frq.length; i++) {
			
			if(frq[i]>=2) {
				int total=frq[i];
				c=(total )*(total-1)/2 +c;
			}
		}
		return c;	
	}
}

