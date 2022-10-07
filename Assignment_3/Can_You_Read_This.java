package Assignment_3;

import java.util.Scanner;

public class Can_You_Read_This {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		String str=sc.next();
		printstring(str);
		
	}
	public static void printstring(String str) {
		String ans=""; //empty string
		ans=ans+str.charAt(0);// checking char at 0
		for (int i = 1; i <str.length(); i++) {
			char ch=str.charAt(i);
			if(ch>='A' && ch<='Z') {
				System.out.println(ans);//print if char is capital
				ans="";//empty string
				 //left over char
				ans=ans+ch;
			}
			else {
				
				ans=ans+ch;
				
			}
			
		}
		System.out.println(ans);
		
	}

}
