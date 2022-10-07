package Lec_26;

public class Queen_combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tq=2;
		int n=4;
		boolean[] board= new boolean[n];
		printanswer(board,tq,0,"",0);

	}
	public static void printanswer(boolean[] board,int tq,int qpsf,String ans,int last) {
		if(tq==qpsf) {
			System.out.println(ans);
			return;
		}
		for (int i = last; i < board.length; i++) {
			if(board[i]==false) {
				board[i]=true;
						printanswer(board,tq,qpsf+1,ans+"b"+i+"q"+qpsf,i+1);
						board[i]=false;
			}
		}
	}

}
