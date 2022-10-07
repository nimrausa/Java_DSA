package Lec_19;

public class Wrapper_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a=10;  //heap
		int a1=10;   //stack
		System.out.println(a1==a);
		a=a1; //Autoboxing-- stack vale going to heap
		Integer b=10;  //heap
		int b1=10; 
		b1=b;    //onboxing
		Integer c=12;
		Integer c1=12;
		Integer d=167;
		Integer d1=167;   ///-128 to 127 for integer
		System.out.println(c==c1);
		System.out.println(d==d1);
		int m=10;
		int m1=10;
		System.out.println(m==m1);
	}

}
