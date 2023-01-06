package Day_36;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// No inheritance
//		P obj=new P();
//		C obj1=new C();
//		System.out.println(obj.d);
//		System.out.println(obj1.d2);
//		obj.fun();
//		obj1.fun2();
		
		//case 1
//		P obj=new P();
//		System.out.println(obj.d);
//		System.out.println(obj.d1);
		
		//case 2
		//compiler work on left size and Jvm see on right size
//		P obj=new C(); // c is inherit P
//		System.out.println(obj.d);//value in p first compiler will run check left side
//		System.out.println(obj.d1); // value in c
//		System.out.println(((C)(obj)).d2); //type casting of c
//		System.out.println(((C)(obj)).d);// value in C due to type casting
//		
//		obj.fun(); // value of function C will print due to Override type casting can not
		//possible in function
		
		
		
		//case 3      //this case is not possible 
//		C obj=new P();
//		System.out.println(obj.d);
//		System.out.println(obj.d1);
//		System.out.println(obj.d2);

		//case 4
		C obj=new C();
		System.out.println(obj.d);
		System.out.println(obj.d1);
		System.out.println(obj.d2);
		obj.fun();
		
		
		
		

	}

}
