package Lec_58;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HouseRobber {
	
	public static void main(String[] args) {
		int [] arr= {2,7,9,3,1};
		System.out.println(Robber(arr,0));
		int n=arr.length;
		int [] dp=new int [n];
		for(int i=0; i<arr.length; i++) {
			dp[i]=-1;
		}
		Arrays.fill(dp,-1);
		System.out.println(RobberTD(arr,0,dp));
		
	
	
	}
	public static int Robber(int [] arr, int i) {
		if(i>=arr.length) {
			return 0;
		}
		int rob=Robber(arr,i+2) +arr[i];
		//Robber(arr,i+2) it will save at arr(i+2)
		int dnrob=Robber(arr,i+1);//it will save at arr(i+2)
		return Math.max(rob, dnrob);	
	}
	public static int RobberTD(int [] arr, int i, int [] dp) {
		if(i>=arr.length) {
			return 0;
		}
		if(dp[i]!=-1) {  //it can have 0 or the summ where all the element of the array=0
			return dp[i];  //the value already exist it wull get return
		}
		
		int rob=RobberTD(arr,i+2, dp)+ arr[i];
		int dnrob=RobberTD(arr, i+1,dp);
		
		return dp[i]=Math.max(rob, dnrob); //memorize
		
		
	}
	

}
