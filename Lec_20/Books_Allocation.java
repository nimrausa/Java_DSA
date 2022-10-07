package Lec_20;

import java.util.Arrays;
import java.util.Scanner;

public class Books_Allocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
		int n=sc.nextInt();
		int [] page=new int[n];
		int nos = sc.nextInt();// number of stall
			for (int i = 0; i < page.length; i++) {
				page[i]=sc.nextInt();
			}
			System.out.println(minpage(page,nos));
			}
	}
	public static int minpage(int [] page, int nos) {
		int lo=0;
		int hi=0;
		int ans=0;
		for (int i = 0; i < page.length; i++) {
			hi=hi+page[i];
		}
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(isitpossible(page,nos,mid) == true) {
				ans=mid;
				hi=mid-1;
			}
			else {
				lo=mid+1;
			}
		
		}
		return ans;
		
	}
	public static boolean isitpossible(int [] page, int nos, int mid) {
		int student=1;
		int readpage=0;
		int i=0;
		while(i<page.length) {
			if(readpage+page[i]<=mid) {
				readpage=readpage+page[i];
				i++;
				
			}
			else {
				student++;
				readpage=0;
			}
			if(student>nos) {
				return false;
			}
		}
		return true;
		
	}
}