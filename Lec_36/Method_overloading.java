package Lec_36;

public class Method_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(2,4));
		System.out.println(add(2,4,9));
		System.out.println(add(2,4,9.6f));
		System.out.println(add(2,3,4,9,6,7,8,9,5,4,3,5,6,7,8,9));
		

	}
	public static int add(int x, int z, int.... a) {
		int sum=0;
		for(i=0; i<a.length; i++) {
			sum=sum+a[i];
		}
		return sum;
	}
	public static int add(int a , int b) {
		return a +b;
	}
	public static int add(int a , int b, int c) {
		return a +b +c ;
	}
	
	public static int add(int a , int b float d) {
		return a +b+ d ;
	}


}
