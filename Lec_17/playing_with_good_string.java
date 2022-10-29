package Lec_17;

import java.util.Scanner;

public class playing_with_good_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(Good_Strings(str));

	}

	public static int Good_Strings(String str) {
		int ans=0;
		for (int i = 0; i < str.length(); i++) {
			char ch=str.charAt(i);
			if(isvowel(ch)==true) {
				int count=0;
				while(i<str.length() && isvowel(str.charAt(i))==true) {
					count ++;
					i++;
				}
				ans=Math.max(ans,count);
			}
		}
		return ans;
	}
		
		public static boolean isvowel(char ch) {
			if(ch=='a' || ch=='e'|| ch=='i' || ch=='o' || ch=='u') {
			return true;
			}	
		
		return false;
			
		}
}