package Lec_22;

public class coin_toseed_two_no_head {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		printout(n,"");

	}
	public static void printout(int n, String ans) {
		if(n==0) {
		System.out.print(ans + " ");
		return;
	}
		if(ans.length()==0 || ans.charAt(ans.length()-1)!='H')
		printout(n-1, ans + "H");
		printout(n-1, ans + "T");
		
	}

}