package Lec_23;

public class Count_of_sequence {
	static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abc";
		printans(str,"");
		System.out.println(count);
	}
	public static void printans(String ques, String ans) {
		if(ques.length()==0) {
			System.out.println(ans);
			count++;
			return;
		}
		char ch=ques.charAt(0);
		printans(ques.substring(1),ans);
		printans(ques.substring(1),ans+ch);
	}

}

