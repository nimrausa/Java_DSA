package Lec_25;

public class Toers_of_hanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String src="A";
		String hlp="B";
		String des="C";
		int n=3;
		TOH(n,src,hlp,des);
		
		

	}
	public static void TOH(int n, String src, String hlp, String des) {
		if(n==0) {
			return;
		}
	TOH(n-1,src,des,hlp); //last disc pr n-1 so last mai likha
	System.out.println("Move" + n +" disc from " + src +" to " +des);
	TOH(n-1,hlp,src,des); 
	}

}
