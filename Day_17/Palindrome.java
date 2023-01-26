package Day_17;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "civaic";
		System.out.println(isPalindrome(s));

	}

	public static boolean isPalindrome(String s) {
		int i = 0;
		int j = s.length() - 1;// indexing is 0 based
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
