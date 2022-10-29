package Lec_22;

public class print_subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abc";
		printanswer(str, "");
		

	}
	public static void printanswer(String ques,String ans) {
		if (ques.length()==0) {
			System.out.println(ans);
			return;
		}
		char ch=ques.charAt(0);
		printanswer(ques.substring(1),ans); //substring(1):all character from1
		printanswer(ques.substring(1),ans+ ch);
	}
}
