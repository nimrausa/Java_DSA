package Day_19;

public class Wrapper_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a=156; // value in heap
		Integer b=156;
		int a1=156; //full thing in stack
		int a2=156;
		System.out.println(a==a1); //when non-primitive and primitive get compared than 
		//the value get compared
		System.out.println(a==b);// out of range
		System.out.println(a1==a2); //value compared
		//AutoBoxing
		
		a=a1; // when the primitive goes to non-primitive
		
		//OnBoxing
		Integer c=10;
		int c1=9;
		c1=c; // when non- primitive data comes in primitive
		
		Integer m=12; 
		Integer m1=12;
		Integer n=167; // it will not coming to the range of -128 to 127
		Integer n1=167;
		System.out.println(m==m1);
		System.out.println(n==n1);
		
		
		int f=900;
		int f1=900;
		System.out.println(f1==f);
		

	}

}
