package Day_23;

public class board_path {
	static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		board_path(0,n,"");
		System.out.println(count);
	}
	public static void board_path(int curr, int n , String ans) {
		if(curr==4) {
			System.out.println(ans);
			count++;
			
			return;
			
			
		}
		if(curr>4) {
			return ;
		}
		
		board_path(curr+1,n,ans+1);  //string+integer====String
		board_path(curr+2,n, ans+2);
		board_path(curr+3,n,ans+3);
		
		
	}
}
