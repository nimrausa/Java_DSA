package Assignment_3;

import java.util.Scanner;

public class Strings_Remove_Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		duplicate(str);
		

	}
	public static void duplicate(String str) {
		String ans="";
		
		char prev=str.charAt(0);
		for (int i = 1; i < str.length(); i++) {
			char curr=str.charAt(i);
			if(prev==curr) {
			
		}
		else {
			ans=ans+prev;
			prev=curr;
			
		}
		}
		ans=ans+prev;
		System.out.println(ans);
				
	}

}
