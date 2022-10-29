package Assignment_2;

import java.util.Scanner;

public class Find_square_Rot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		System.out.println(square(n));

	}
	public static int square(int n) {
		int lo=1;
		int hi=n;
		int ans=0;
		while(lo<=hi) {
			int mid=(int) ( lo+ (hi-lo)/2);
			if(mid*mid==n) {
				ans=mid;
				return ans;
			}
			else if(mid*mid>n) {
				hi=mid-1;
				
			}
			else {
				lo=mid+1;
			}
			
		}
	return (int)Math.sqrt(n);
		
	}

}
