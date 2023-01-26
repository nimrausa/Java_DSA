package Day_17;

import java.util.Iterator;

public class print_palindrome_substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello Bye";
		palindrome(s);
	}

	public static void palindrome(String s) {
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				String str=s.substring(i,j);
				if (ispalindrome(str) == true) {
					System.out.println(str);
				}

			}

		}

	}

	public static boolean ispalindrome(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
