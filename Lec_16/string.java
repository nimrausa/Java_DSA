package Lec_16;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello";
		String S1="Hello";
		System.out.println(s);
		System.out.println(S1);
		String x= "hellobyestar";
		System.out.println(x.length());
		System.out.println(x.charAt(0));
		String y="hellobyeStar";
		System.out.println(x.equals(y));
		String s2="raj";
		String s3="raju";
		System.out.println(s2.compareTo(s3)); // s2>s3 +ve   s2<s3 -ve   or s3==s2 0
		String ss=x.substring(3);
		System.out.println(ss);
		System.out.println(x.substring(0,6));// 6 is not taken isted // last wala exclusive
		
		
	}

}
