package Day_23;

public class count_cointoss {
	static int count=0;
	public static void main(String[] args) {
	int n=3;
	Ct(n,"");
	System.out.println(count);
	
	}
	public static void Ct(int n, String ans) {
		if(n==0) {
			System.out.println(ans);
			count++;
			return;
		}
		
		Ct(n-1, ans + "H");
		Ct(n-1, ans + "T");
	}
}
