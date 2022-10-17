package Lec_27;

import java.util.Iterator;

public class palindrome_partition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="nitin";
		
		Partition(str,"");
	}
	public static void Partition(String Ques, String ans) {
		if(Ques.length()==0) {
			System.out.println(ans);
			return;
		}
		for (int i = 1; i <= Ques.length(); i++) {
			String s=Ques.substring(0,i);
			if(ispalindrome(s)==true) {
			Partition(Ques.substring(i), ans + s + "|");
			}
			
		}
		
		}
	public static boolean ispalindrome(String str) {
		int i=0;
		int j=str.length()-1;
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
		
	}
	


