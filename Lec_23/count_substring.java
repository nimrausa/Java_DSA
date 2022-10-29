package Lec_23;

public class count_substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abc";
		System.out.println(answercount(str, ""));
		

	}
	public static int answercount(String ques,String ans) {
		if (ques.length()==0) {
			System.out.println(ans);
			return 1;
		}
		char ch=ques.charAt(0);
		int a=answercount(ques.substring(1),ans); //substring(1):all character from1
		int b=answercount(ques.substring(1),ans+ ch);
		return a+b;
	}
}