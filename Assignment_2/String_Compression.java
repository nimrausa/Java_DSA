package Assignment_2;

import java.util.Scanner;

public class String_Compression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		String str=sc.next();
	}
	public static int flipchar(String str, int k, char ch) {
		int si=0;
		int ei=0;
		int ans=0;
		int flip=0;
		while(ei<str.length()) {
			if(str.charAt(ei)==ch) {
				flip++;
				
			}
			while(si<=ei && flip>k) {
				if(str.charAt(si)==ch) {
					flip--;
				}
				si++;
			}
			ans=Math.max(ans, ei-si+1);
			ei++;
		}
		return ans;
		
	}
}
