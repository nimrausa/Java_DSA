package Assignment_2;

import java.util.Scanner;

public class Kartik_Bhaiya_And_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int k=sc.nextInt();
		String str=sc.next();
		int flipa=flipchar(str,k,'a');
		int flipb=flipchar(str,k,'b');
		System.out.println(Math.max(flipa, flipb));
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
