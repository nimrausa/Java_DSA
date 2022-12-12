package Day_23;

import java.util.ArrayList;
import java.util.List;

public class generateParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		List <String> list= new ArrayList<>();
		generateparentheis(n,0,0,"",list);
		System.out.println(list);

	}
	public static void generateparentheis(int n, int open , int close,  String ans, List <String> list) {
		if(open==n && close==n) {
			//System.out.print(ans + " ");
			list.add(ans);
			return;
		}
		
		if(open<n) {
		generateparentheis(n ,open+1, close,  ans + "(", list);
		}
		if(close < open) {
		generateparentheis(n,open, close+1, ans+ ")",list);
		}
		
	}

}
