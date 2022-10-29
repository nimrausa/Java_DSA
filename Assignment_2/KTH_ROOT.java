package Assignment_2;

import java.util.Scanner;

public class KTH_ROOT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		while(t-->0) {
			long n=sc.nextLong();
			int k=sc.nextInt();
			System.out.print(kthroot(n,k));
		}
		
		

	}
	public static int kthroot(long n, int k) {
		long low=1;
		long hi=n;
		int ans=0;
		
		while(low<=hi) {
			int mid=(int) (low + (hi-low)/2);
			if(Math.pow(mid, k)<=n) {
				 ans=mid;
				low=mid+1;
			}
			else {
				hi=mid-1;
			}
			
		}
		return ans;
		
		
	}
}
