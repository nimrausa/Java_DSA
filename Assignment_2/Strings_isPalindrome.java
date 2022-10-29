package Assignment_2;

import java.util.Iterator;
import java.util.Scanner;

public class Strings_isPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(ispalindrome(str));
	}

	public static boolean ispalindrome(String str) {
		int i = 0;
		int j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
		
		i++;
		j--;
		}
		return true;

	}
}