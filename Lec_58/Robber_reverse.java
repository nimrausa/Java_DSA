package Lec_58;

import java.util.Arrays;

public class Robber_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {2,7,9,3,1};
		//int [] dp=new int [arr.length-1];
		//Arrays.fill(dp, -1);
		System.out.print(Robber(arr,arr.length-1));
		 
		
	
		
	}
	public static int Robber(int [] arr, int i ) {
		if(i<0) {
			return 0;
		}
//		if(arr[i]!=0) {
//			return dp[i];
//		}
		int rob=Robber(arr,i-2)+arr[i];
		int dnrob=Robber(arr,i-1);
		
		return Math.max(rob, dnrob);
		
		
	}

}
