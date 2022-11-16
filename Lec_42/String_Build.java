package Lec_42;

public class String_Build {
	public static void main(String[] args)  {
		StringBuilder sb=new StringBuilder();
		System.out.println(sb.capacity()); //intially capacity=0
		System.out.println(sb.length());  //like array list size intially 0
		sb.append('c'); //to add
		sb.append("Hello");
		System.out.println(sb);
		String str=sb.toString();//to write string builder data to string
		System.out.println(str);
	System.out.println(sb.reverse());
	String s="hellobye"; //to convert the string to string builder
	StringBuilder sb1=new StringBuilder(s);
	System.out.println(sb1);
	System.out.println(sb1.capacity()); //1st time capacity get update automaticaly which equals to 16+s
	sb1.append("Tom");
	System.out.println(sb1.capacity());
	sb1.append("Have a good day");
	System.out.println(sb1.length()+ " " + sb1.capacity()); //total length of sb1=hellobye +Tom +Have a good day=26
	//if the capacity get full than the new capacity = (old capacity*2 +2)
	//sb1.append(2,'c'); //it add to the last . To add index at the middle does not exist
	System.out.println(sb1.indexOf("Ha"));// find index of H
	System.out.println(sb1);
	System.out.println(sb1.delete(1, 3)); //it deletes from 1 to 2 exclude 3
	System.out.println(sb1.charAt(5));
	sb1.setCharAt(0, 't');//change at the same string don't create new
	System.out.println(sb1);
	
	
		
		
		
		
		
	}
	}


