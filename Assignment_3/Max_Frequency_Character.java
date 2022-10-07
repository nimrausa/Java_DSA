package Assignment_3;

import java.util.Scanner;

public class Max_Frequency_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		frequency_char(str);
		

	}
	public static void frequency_char(String str) {
		int [] freq=new int [26];
		for (int i = 0; i < str.length(); i++) {
			char ch=str.charAt(i);
			freq[ch-97]=freq[ch-97]+1;  //intially all are 0 
			
		}
		int max_i=0;
		for (int i = 0; i < freq.length; i++) {
			if(freq[i]>freq[max_i]) {
			max_i=i;
			}
		}
		char ch=(char) (97+max_i);
		System.out.println(ch);
	}

}
