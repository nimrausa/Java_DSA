package Lec_23;

public class Board_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		boardpath(0,n,"");

	}
	public static void boardpath(int curr,int n, String ans ) {
		if(curr==n) {
			System.out.println(ans);
		}
		if(curr>n) {
			return;
		}
		for(int dice=1;dice<=3;dice++) {
			boardpath(curr+dice,n,ans+dice);
		}
		//boardpath(curr+1,n,ans+1);
		//boardpath(curr+2,n,ans+2);
		//boardpath(curr+3,n,ans+3);
		
		
		
	}

}
