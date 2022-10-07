package Lec_18;

import java.util.Scanner;

public class CB_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // N == 5 e.g
		sc.nextLine(); // Consume the leftover '\n'
		String str = sc.nextLine(); // Hello World
		str = str.substring(0, N);
		printsubstring(str);
		
	}

	public static void printsubstring(String str) {
		int count=0;
		boolean [] vis=new boolean[str.length()];
		for(int len=1; len<=str.length(); len++) {
			for(int j=len; j<=str.length(); j++) {
				int i=j-len;
				String s=str.substring(i,j);
				
		
		if(isCbnumber(Long.parseLong(s))==true && isvisited(vis,i,j-1)) {
			count++;
			for (int k = i; k < j; k++) {
				vis[k]=true;
				
			}
		}
		
			}
		}
		System.out.println(count);
	}
	public static boolean isvisited(boolean [] vis, int i,int j) {
		for (int k = i; k < j; k++) {
			if(vis[k]==true) {
				return false;
			}
			
		}
		return true;
	}
	public static boolean isCbnumber(long n) {
		if(n==0 || n==1) {
			return false;
		}
		int [] arr= {2,3,5,7,11,13,17,19,23,29};
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==n) {
				return true;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if(n%arr[i]==0) {
				return false;
			}
			
		}
		return true;
	}
}

	