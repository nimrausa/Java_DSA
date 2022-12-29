package Day_06;

public class Maze_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		int m=3;
		int ec=n-1;
		int er=m-1;
		maze(0,0,ec,er, " ");
		

	}
	public static void maze(int cc, int cr, int ec, int er, String ans) {
		if(cc==ec && cr==er) {
			System.out.println(ans);
			return;
		}
		if(cc>ec || cr>er) {
			return;
		}
		
		
		
		maze(cc+1,cr,ec,er,ans+"H" );
		maze(cc,cr+1,ec,er,ans+"V" );
	}

}
