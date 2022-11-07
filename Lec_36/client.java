package Lec_36;

public class client {
	
	public static void main(String[] args) {
	
	P obj=new C(); 
	System.out.println(obj.d);
	System.out.println(obj.d1);
	System.out.println();
	System.out.println(((C)(obj)).d);
	System.out.println(((C)(obj)).d2);
	//P obj =new P();
		obj.fun();  // for same variable new C will access because its new we can'not access p in any case if the function 
		//name are same
		obj.fun1();
		((C)(obj)).fun2();
		
		
		
	}

}
