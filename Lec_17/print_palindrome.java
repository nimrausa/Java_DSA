package Lec_17;

import java.util.Scanner;

public class print_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
				if(ispalindrome(str)==true) {
					System.out.println(str);
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
















