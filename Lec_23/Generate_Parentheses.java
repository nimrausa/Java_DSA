package Lec_23;

import java.util.ArrayList;
import java.util.List;

public class Generate_Parentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		List <String> list=new ArrayList<>();
	
		GenerateParantheisis(n,0,0,"",list);
		System.out.print(list);
		

	}
	public static void GenerateParantheisis(int n, int open, int close, String ans, List<String> list) {
		if(open==n && close==n) {
			list.add(ans);
			//System.out.print(ans + " ");
			return;
		}
		if(open<n) {
			GenerateParantheisis(n,open+1,close,ans+"(",list);
		}
		if(close<open) {
			GenerateParantheisis(n,open,close+1,ans+")",list);
		}
	}
	

}
