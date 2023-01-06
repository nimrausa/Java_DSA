package Day_36;

public class Method_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(4,5));
		System.out.println(add(9,10));
		System.out.println(add(5, 7,8.9f));
		System.out.println(add(2,3,4,6,8,90,1,3,2,4,5,6,7,9,6,4));
		
	}
	public static int add(int x, int y,int... a) {//... if we don't know how many number of variables
		//x=2  y=3 it will take first two value other left value store in a
		//public static int add(int... a,int x, int y)// not possible
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum=+a[i];;
			
		}
		return sum;
		
	}
	public static int add(int a, int b) {
		return a+b;
	}
	public static int add(int a, int b, int c) {
		return a+b+c;
	}
	public static int add(int a, int b, float c) {
		return (int) (a+b+ c);
	}
	
}
