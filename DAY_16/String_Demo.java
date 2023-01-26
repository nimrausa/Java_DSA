package DAY_16;

public class String_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello";  //hard core value written in the string pool in heap
		String s1="Hello"; //same address for s and s1
		String s2=new String("Hello"); //in heap duplicate value have different address
		String s3=s1+s2;
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		String s4="Hello"+ "Hello"; //li + li=pool
		String s5=s1+s; //s1 + s will stored in heap
		String s6=s+s2; //li +heap=heap
		System.out.println(s4==s5); //false because they have different address 
		//s4=POOL and s5=HEAP
		String s7=s1+s; //value with different address in heap
		System.out.println(s5==s7); //they will have different address in heap
		//string is immutable the new value will go to different address
	//so the value of content go to new address instead of changing to same address
		
		
	}

}
