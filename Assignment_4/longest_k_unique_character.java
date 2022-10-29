package Assignment_4;

import java.util.Scanner;

public class longest_k_unique_character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			String str=sc.next();
			int k=sc.nextInt();
			System.out.println(k_unique_character(str,k));
			
		}
		
		
	}

		
	public static int k_unique_character(String str,int k){
		int si=0;
		int ei=0;
		int ans=-1;
		int frq[]=new int[256];
		int unique_count=0;
		while(ei<str.length()) {
			//window grow
			 char ch=str.charAt(ei);
			 if(frq[ch]==0) {
				 unique_count++;
			 }
			 frq[ch]=frq[ch]+1;//ans calculate
			 while(unique_count > k) {
				 char c=str.charAt(si);
				 frq[c]=frq[c]-1;
				 if(frq[c]==0) {
					 unique_count--;
				 }
				 si++;
				 }
			 if(unique_count==k) {
				 ans=Math.max(ans, ei-si+1);
			 }
			 ei++;
			
		}
		return ans;
		
	}
	
	

}
