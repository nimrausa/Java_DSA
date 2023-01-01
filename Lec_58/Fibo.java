package Lec_58;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int [] dp = new int [n+1];
		System.out.println(fibTD(n, dp));
		System.out.println(fibBu(n));
		

	}
	public static int fib(int n) {
		if(n==0 || n==1) {
			return n;
		}
		
		
		int f1=fib(n-1);
		int f2=fib(n-2);
		return f1+f2;
	}
	
	public static int fibTD(int n, int [] dp)  {            //top down
		if(n==0 || n==1) {
			return n;
		}
		if(dp[n] !=0) {
			return dp[n];
		}
		
		int f1=fibTD(n-1,dp);
		int f2=fibTD(n-2,dp);
		return dp[n]=f1+f2;
	}
	public static int fibBu(int n) {
		int [] dp=new int[n+1];
		dp[0]=0;
		dp[1]=1;
		//dp[i]=dp[i-1]+dp[i-2];
		for(int i=2; i<dp.length; i++) {
			dp[i]=dp[i-1]+dp[i-2];
		}
		return dp[n];
	}
	
}
