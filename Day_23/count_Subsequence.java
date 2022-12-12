package Day_23;

public class count_Subsequence {
	//static int count=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc";
		//printanswer(s, "");
		//System.out.println(count);
		System.out.println(printanswer(s,""));
		

	}
	public static int printanswer(String ques, String ans) {
		if(ques.length()==0) {
			//System.out.println(ans);
			// count++;
			return 1;
		}
		
		char ch=ques.charAt(0);
	int	a1=printanswer(ques.substring(1),ans);
	int	b1=printanswer(ques.substring(1), ans+ch);
	return a1+b1;
		
	}
}
