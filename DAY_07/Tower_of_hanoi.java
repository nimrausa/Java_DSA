package DAY_07;

public class Tower_of_hanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String src="A";
		String help="B";
		String des="C";
		int n=3;
		TOH(n, src,help,des);

	}
	public static void TOH(int n,String src, String help, String des) {
		if(n==0) {
			return;
		}
		
		TOH(n-1, src,des,help);
		System.out.println("put "+n+ " from "+src+ " to " + des);
		TOH(n-1,help,src,des);
	}

}
