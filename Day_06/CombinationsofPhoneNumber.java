package Day_06;
import java.util.*;

public class CombinationsofPhoneNumber {
	static String[] key= {" ", " ", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
	
	public static void main(String[] args) {
		String str="23";
		List <String> list=new ArrayList<>();
		keypress( str, " " , list);	
		System.out.print(list);
	}
	public static void keypress(String ques, String ans, List<String> list) {
		if(ques.length()==0) {
			//System.out.println(ans);
			list.add(ans);
			return;
		}
		
		char ch=ques.charAt(0); //2
		String press=key[ch-'0']; //2-0=abc
		for(int i=0; i<press.length(); i++) { //a --> i=0--d, i=1--e, i=2--f)
			keypress(ques.substring(1), ans + press.charAt(i), list); //ques.substring(1)=3   press.charAt(0)=" "+a--3,a
			
		}
		
		
		
	}
	
	

}
