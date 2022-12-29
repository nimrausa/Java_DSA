package Day_06;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques="abc";
		Permutn(ques, " ");
		
		
	}
	public static void Permutn(String ques, String ans) {
		if(ques.length()==0) {
			int count=0;
			String curr=ans;
			
			System.out.println(ans);
			return;
		}
		
		
		
		for(int i=0; i<ques.length(); i++) {
		String s1=ques.substring(0,i);
		String s2=ques.substring(i+1);
		Permutn(s1+s2, ans+ques.charAt(i));
		}
		
	}

}
