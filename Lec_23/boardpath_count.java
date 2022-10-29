package Lec_23;

public class boardpath_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		System.out.print(boardpath(0,n,""));

	}
	public static int boardpath(int curr,int n, String ans ) {
		if(curr==n) {
			return 1;
		}
		if(curr>n) {
			return 0;
		}
		int a1=0;
		for (int dice=1; dice<=3; dice++) {
			
		 a1=a1+boardpath(curr+dice,n,ans+dice);
		 System.out.println(a1);
		}
		//int a2=boardpath(curr+2,n,ans+2);
		//int a3=boardpath(curr+3,n,ans+3);
		return a1;
		
	}

}
