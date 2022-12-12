package Day_23;

public class board_path_loop {
	//dice has three faces

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		System.out.println(Bp(0,n,""));

	}
	public static int Bp(int curr, int n, String ans) {
		if(curr==n) {
			System.out.println(ans);
			return 1;
		}
		if(curr>4) {
			return 0;	
		}
		int a1=0;
		for (int dice = 1; dice <=3; dice++) {
		a1=a1+Bp(curr+dice, n, ans+dice);	
		}
		return a1;
	}

}
