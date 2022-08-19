package Lec_01;

public class traingle_area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int b=6;
		int c=7;
		int s=(a+b+c)/2;
		int area=(int) Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println(area);
		
		

	}

}
