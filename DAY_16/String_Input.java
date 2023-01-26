package DAY_16;

import java.util.Scanner;

public class String_Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
//		String s=sc.next(); //next don't read the space
//		System.out.println(s);
//		String s1=sc.nextLine();//nextLine will read the space
//		System.out.println(s1);
		String s="HelloByeOkayHey";
		System.out.println(s.length()); //method
		System.out.println(s.charAt(5));//0 base indexing
		String s1="helloByeOkayHey";
		System.out.println(s.equals(s1));
		String s4="pan";
		String s5="pen";
		System.out.println(s4.compareTo(s5));// it will compare in Lexigography
		//order difference of the characters present in the string will print 
		// in ASCII ORDER s4>s5==+ve  s5>s4==-ve  s4==s5==0
		String s6="Sam";
		String s7="Safe";
		System.out.println(s6.compareTo(s7));
		System.out.println(s.substring(3));//it will take from 3 to string.length
		System.out.println(s.substring(0,3));//i to j last index is not included
		
				
		
		
		

	}

}
